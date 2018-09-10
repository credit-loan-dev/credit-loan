package com.sixliu.creditloan.workflow.worker.impl;

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
import com.sixliu.creditloan.workflow.dao.AutoProcessWorkerConfigDao;
import com.sixliu.creditloan.workflow.dao.WorkflowTaskDao;
import com.sixliu.creditloan.workflow.dto.TaskProcessResult;
import com.sixliu.creditloan.workflow.entity.AutoProcessWorkerConfig;
import com.sixliu.creditloan.workflow.entity.WorkflowTask;
import com.sixliu.creditloan.workflow.status.TaskStatusMachine;
import com.sixliu.creditloan.workflow.status.TaskStatusMachineFactory;
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
	private final static long DEFAULT_FIRST_INITIAL_DELAY = 1000 * 60 * 5;

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
	private TaskStatusMachineFactory taskStatusMachineFactory;

	/** 定时扫描任务延迟时间历史集合,用于打散定时扫描任务的时间分布 **/
	private TreeSet<Long> initialDelayHistory;

	private AutoProcessWorkerConfigDao autoProcessWorkerConfigDao;

	@PostConstruct
	public void init() {
		this.initialDelayHistory = new TreeSet<>();
		this.workerThreadPool = new ScheduledThreadPoolExecutor(workerThreads, this::newWorkerThread);
//		List<AutoProcessWorkerConfig> autoProcessWorkerConfigs = autoProcessWorkerConfigDao.listAll();
//		for (AutoProcessWorkerConfig autoProcessWorkerConfig : autoProcessWorkerConfigs) {
//			long initialDelay = nextInitialDelay();
//			workerThreadPool.scheduleAtFixedRate(new AutoProcessWorkerProxy(autoProcessWorkerConfig), initialDelay,
//					autoProcessWorkerConfig.getCheckInterval(), TimeUnit.MILLISECONDS);
//		}
	}


	public void notice(String jobId) {
		workerThreadPool.execute(new NoticeWokrer(jobId));
	}

	class NoticeWokrer implements Runnable {

		private String jobId;

		public NoticeWokrer(String jobId) {
			this.jobId = jobId;
		}

		@Override
		public void run() {
			WorkflowTask workflowTask = workflowTaskDao.getByJobIdForPooling(jobId);
			if (null != workflowTask && TaskType.AUTO == workflowTask.getType()) {
				AutoProcessWorkerConfig autoProcessWorkerConfig=autoProcessWorkerConfigDao.getTaskId(workflowTask.getId());
				if(null==autoProcessWorkerConfig) {
					log.error(String.format("The WorkflowTask[%s] has not AutoProcessWorkerConfig", workflowTask.getId()));
					return;
				}
				AutoProcessWorker wutoProcessWorker = remoteAutoProcessWorkerFactory.getOrNew(autoProcessWorkerConfig);
				TaskProcessResult taskProcessResult = wutoProcessWorker.process(workflowTask.getId());
				TaskStatusMachine taskStatusMachine = taskStatusMachineFactory.get(taskProcessResult.getStatus());
				taskStatusMachine.process(taskProcessResult,jobId-> {
					notice(jobId);
				});
			}
		}

	}

	class AutoProcessWorkerProxy implements Runnable {

		AutoProcessWorkerConfig autoProcessWorkerConfig;

		private AutoProcessWorkerProxy(AutoProcessWorkerConfig autoProcessWorkerConfig) {
			this.autoProcessWorkerConfig = autoProcessWorkerConfig;
		}

		@Override
		public void run() {

		}
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

	@PreDestroy
	public void shutdown() {
		if (null != workerThreadPool) {
			workerThreadPool.shutdown();
		}
	}
}
