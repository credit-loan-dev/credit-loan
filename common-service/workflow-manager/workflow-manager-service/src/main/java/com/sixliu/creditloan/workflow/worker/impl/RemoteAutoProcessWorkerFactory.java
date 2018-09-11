package com.sixliu.creditloan.workflow.worker.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sixliu.creditloan.workflow.entity.WorkflowTaskWorker;
import com.sixliu.creditloan.workflow.worker.AutoProcessWorker;

/**
*@author:MG01867
*@date:2018年9月7日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Component
public class RemoteAutoProcessWorkerFactory {

	private RestTemplate  restTemplate;
	
	public AutoProcessWorker getOrNew(WorkflowTaskWorker workflowTaskWorker) {
		return new RemoteAutoProcessWorker(restTemplate, workflowTaskWorker);
	}
}
