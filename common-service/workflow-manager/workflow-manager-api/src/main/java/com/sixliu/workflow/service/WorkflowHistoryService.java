package com.sixliu.workflow.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;

import com.sixliu.workflow.WorkflowManagerApi;

/**
*@author:MG01867
*@date: 2018年9月6日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
@FeignClient(WorkflowManagerApi.SERVICE_NAME)
@Validated
public interface WorkflowHistoryService {

}
