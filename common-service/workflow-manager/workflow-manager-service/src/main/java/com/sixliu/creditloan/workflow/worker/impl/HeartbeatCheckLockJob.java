package com.sixliu.creditloan.workflow.worker.impl;

import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sixliu.creditloan.workflow.dao.WorkflowJobDao;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;
import com.sixliu.creditloan.workflow.service.impl.WorkflowServiceImpl;

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

	@Value("${spring.cloud.client.ip-address}")
	private String ip;

	@Value("${server.port}")
	private int port;

	@Value("${app.heartbeatCheckLockJob.heartbeatTime}")
	private long heartbeatTime;

	private String localUrl;

	@Autowired
	private WorkflowJobDao workflowJobDao;

	@Autowired
	private RestTemplate restTemplate;

	private static Thread thread;

	@Bean(name = "remoteRestTemplate")
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@PostConstruct
	public synchronized void init() {
		if (null == thread) {
			this.localUrl = ip +":" +port;
			thread = new Thread(this::run);
			thread.setName("HeartbeatCheckLockJob-thread");
			thread.setDaemon(true);
			thread.start();
		}
	}

	private void run() {
		while (true) {
			List<WorkflowJob> lockJobs = Collections.emptyList();
			try {
				lockJobs = workflowJobDao.listLockJobs();
			} catch (Exception exception) {
				log.error("HeartbeatCheckLockJob listLockJob err", exception);
			}
			for (WorkflowJob job : lockJobs) {
				Boolean result = false;
				if (StringUtils.contains(job.getLockUrl(),localUrl)) {
					result =StringUtils.contains(job.getLockUrl(), WorkflowServiceImpl.UUID);
				} else {
					try {
						result = restTemplate.getForObject(job.getLockUrl(), Boolean.class);
					} catch (Exception exception) {
						log.error(String.format("HeartbeatCheckLockJob request target[%s] UUID err", job.getLockUrl()),
								exception);
					}
				}
				if (!result) {
					try {
						workflowJobDao.unlock(job.getId(), job.getVersion());
					} catch (Exception exception) {
						log.error(String.format("HeartbeatCheckLockJob unlock job[%s] err", job.getId()),
								exception);
					}
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
