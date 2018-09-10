package com.sixliu.creditloan.workflow.worker.impl;

import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sixliu.creditloan.workflow.dao.WorkflowJobDao;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年9月7日 下午8:23:49
 * @version V1.0
 * @Description:心跳检查锁住了的job 是否健康
 */
@Slf4j
@Component
public class HeartbeatCheckLockJob {

	@Value("${app.heartbeatCheckLockJob.heartbeatTime}")
	private long heartbeatTime;

	@Autowired
	private WorkflowJobDao workflowJobDao;

	private RestTemplate restTemplate;

	private Thread thread;

	@PostConstruct
	public synchronized void init() {
		if (null == this.thread) {
			this.thread = new Thread(this::run);
			this.thread.setName("HeartbeatCheckLockJob-thread");
			this.thread.setDaemon(true);
			this.thread.start();
		}
	}

	private void run() {
		while (true) {
			List<WorkflowJob> lockJobs = Collections.emptyList();
			try {
				lockJobs = workflowJobDao.listLockJob();
			} catch (Exception exception) {
				log.error("HeartbeatCheckLockJob listLockJob err", exception);
			}
			for (WorkflowJob job : lockJobs) {
				try {
					String newUUID = restTemplate.getForObject(job.getLockUrl(), String.class);
					if (!StringUtils.equals(newUUID, job.getLockUUID())) {
						workflowJobDao.unlock(job.getId(), job.getVersion());
					}
				} catch (Exception exception) {
					log.error(String.format("HeartbeatCheckLockJob request target[%s] UUID err", job.getLockUrl()),
							exception);
				}
			}
			try {
				Thread.sleep(heartbeatTime);
			} catch (Exception exception) {
				log.warn("HeartbeatCheckLockJob run sleep err", exception);
			}
		}
	}
}
