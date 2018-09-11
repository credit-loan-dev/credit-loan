package com.sixliu.creditloan.workflow.worker.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.sixliu.creditloan.workflow.dto.TaskProcessResult;
import com.sixliu.creditloan.workflow.entity.WorkflowTaskWorker;
import com.sixliu.creditloan.workflow.worker.AutoProcessWorker;

/**
 * @author:MG01867
 * @date:2018年9月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class RemoteAutoProcessWorker implements AutoProcessWorker {

	private RestTemplate restTemplate;

	private WorkflowTaskWorker workflowTaskWorker;

	public RemoteAutoProcessWorker(RestTemplate restTemplate,WorkflowTaskWorker workflowTaskWorker) {
		this.restTemplate = restTemplate;
		this.workflowTaskWorker = workflowTaskWorker;
	}

	@Override
	public TaskProcessResult process(String taskId) {
		ResponseEntity<TaskProcessResult> responseEntity = restTemplate.postForEntity(workflowTaskWorker.getUrl(),
				taskId, TaskProcessResult.class);
		return responseEntity.getBody();
	}

}
