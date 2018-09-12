package com.sixliu.creditloan.workflow.worker.impl;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.sixliu.creditloan.workflow.constant.TaskType;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskWorkerDao;
import com.sixliu.creditloan.workflow.dto.TaskProcessResult;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskWorker;
import com.sixliu.creditloan.workflow.status.TaskStatusMachine;
import com.sixliu.creditloan.workflow.status.TaskStatusMachineFactory;
import com.sixliu.creditloan.workflow.status.TaskStatusMachine.CompleteCallback;
import com.sixliu.creditloan.workflow.worker.AutoProcessWorker;

import lombok.extern.slf4j.Slf4j;

/**
 * @author:MG01867
 * @date:2018年7月18日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 自动审批handler管理
 */
@Component
@Slf4j
public class AutoProcessWorkerMangaer {

	/** 工作线程名字索引 **/
	private final static AtomicInteger WORKER_THREAD_INDEX = new AtomicInteger(0);

	private final static String WORKER_THREAD_NAME_PRE = "Auto-Process-";

	/** 定时扫描任务-默认第一次扫描时间 **/
	private final static long DEFAULT_FIRST_INITIAL_DELAY = 1000 * 5;

	@Value("${app.autoProcessWorkerMangaer.workerThreads}")
	private int workerThreads;

	/** 定时扫描任务延迟时间-增量因子 **/
	@Value("${app.autoProcessWorkerMangaer.initialDelayIncFactor}")
	private long initialDelayIncFactor;

	/** 工作线程池 **/
	private ScheduledThreadPoolExecutor workerThreadPool;

	@Autowired
	private RemoteAutoProcessWorkerFactory remoteAutoProcessWorkerFactory;

	@Autowired
	private WorkflowTaskDao workflowTaskDao;

	@Autowired
	private WorkflowTaskWorkerDao workflowTaskWorkerDao;

	@Autowired
	private TaskStatusMachineFactory taskStatusMachineFactory;

	/** 定时扫描任务延迟时间历史集合,用于打散定时扫描任务的时间分布 **/
	private TreeSet<Long> initialDelayHistory;

	private CompleteCallback completeCallback;

	@PostConstruct
	public void init() {
		this.initialDelayHistory = new TreeSet<>();
		this.completeCallback = jobId -> noticeProcessNextTask(jobId);
		this.workerThreadPool = new ScheduledThreadPoolExecutor(workerThreads, this::newWorkerThread);
		List<WorkflowTaskWorker> workflowTaskWorkers = workflowTaskWorkerDao.listAll();
		for (WorkflowTaskWorker workflowTaskWorker : workflowTaskWorkers) {
			long initialDelay = nextInitialDelay();
			workerThreadPool.scheduleAtFixedRate(new TimingScanAutoProcessWorkerProxy(workflowTaskWorker), initialDelay,
					workflowTaskWorker.getCheckInterval(), TimeUnit.MILLISECONDS);
		}
	}

	public void submitTaskProcessResult(TaskProcessResult taskProcessResult) {
		TaskStatusMachine taskStatusMachine = taskStatusMachineFactory.get(taskProcessResult.getStatus());
		taskStatusMachine.process(taskProcessResult, completeCallback);
	}

	/**
	 * 根据jobid通知处理下个能处理的任务
	 * 
	 * @param jobId
	 */
	public void noticeProcessNextTask(String jobId) {
		workerThreadPool.execute(new AutoProcessWorkerBroadcaster(jobId));
	}

	private long nextInitialDelay() {
		if (initialDelayHistory.isEmpty()) {
			initialDelayHistory.add(DEFAULT_FIRST_INITIAL_DELAY);
		}
		long lastInitialDelay = initialDelayHistory.last();
		long initialDelay = lastInitialDelay + initialDelayIncFactor;
		initialDelayHistory.add(initialDelay);
		return initialDelay;
	}

	private Thread newWorkerThread(Runnable r) {
		String newName = WORKER_THREAD_NAME_PRE + WORKER_THREAD_INDEX.getAndIncrement();
		Thread newThread = new Thread(r);
		newThread.setDaemon(false);
		newThread.setName(newName);
		return newThread;
	}

	public class TimingScanAutoProcessWorkerProxy implements Runnable {

		private WorkflowTaskWorker workflowTaskWorker;

		protected TimingScanAutoProcessWorkerProxy(WorkflowTaskWorker workflowTaskWorker) {
			this.workflowTaskWorker = workflowTaskWorker;
		}

		public void process(WorkflowTask task) {
			List<WorkflowTask> pendingTasks = null;
			if (null == task) {
				pendingTasks = workflowTaskDao.listForTimingScan(workflowTaskWorker.getTaskModelId(),
						workflowTaskWorker.getTaskPhase());
			} else {
				pendingTasks = Arrays.asList(task);
			}
			for (WorkflowTask item : pendingTasks) {
				AutoProcessWorker wutoProcessWorker = remoteAutoProcessWorkerFactory.getOrNew(workflowTaskWorker);
				TaskProcessResult taskProcessResult = wutoProcessWorker.process(item.getId());
				submitTaskProcessResult(taskProcessResult);
			}
			log.info("AutoProcessWorkerProxy");
		}

		@Override
		public void run() {
			process(null);
		}
	}

	public class AutoProcessWorkerBroadcaster implements Runnable {

		private String jobId;

		protected AutoProcessWorkerBroadcaster(String jobId) {
			this.jobId = jobId;
		}

		@Override
		public void run() {
			WorkflowTask workflowTask = workflowTaskDao.getByJobIdForPooling(jobId);
			if (null != workflowTask && TaskType.AUTO == workflowTask.getType()) {
				WorkflowTaskWorker workflowTaskWorker = workflowTaskWorkerDao.getByTaskId(workflowTask.getId());
				if (null == workflowTaskWorker) {
					log.error(String.format("The WorkflowTask[%s] has not AutoProcessWorkerConfig",
							workflowTask.getId()));
					return;
				}
				TimingScanAutoProcessWorkerProxy autoProcessWorkerProxy = new TimingScanAutoProcessWorkerProxy(
						workflowTaskWorker);
				autoProcessWorkerProxy.process(workflowTask);
			}
		}

	}

	@PreDestroy
	public void shutdown() {
		if (null != workerThreadPool) {
			workerThreadPool.shutdown();
		}
	}
}
