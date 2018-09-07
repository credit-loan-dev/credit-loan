package com.sixliu.creditloan.workflow.dao;

import java.util.List;

import com.sixliu.creditloan.workflow.entity.AutoProcessWorkerConfig;

/**
*@author:MG01867
*@date:2018年9月7日
*@E-mail:359852326@qq.com
*@version:
*@describe
*/
public interface AutoProcessWorkerConfigDao {

	AutoProcessWorkerConfig get(String id);
	
	AutoProcessWorkerConfig getTaskId(String taskId);
	
	List<AutoProcessWorkerConfig> listAll();
}
