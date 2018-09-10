package com.sixliu.creditloan.workflow.worker;

import java.util.List;

import com.sixliu.creditloan.workflow.dto.FlowTask;
import com.sixliu.creditloan.workflow.dto.TaskProcessResult;

/**
 * @author:MG01867
 * @date:2018年7月18日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 异步handler
 */
@FunctionalInterface
public interface AutoProcessWorker{

	/**
	 * Worker名称:默认worker实现类名
	 * @return
	 */
	default String getName() {
		return this.getClass().getName();
	}
	
	default List<FlowTask> next(){
		return null;
	}

	TaskProcessResult process(String taskId);
}
