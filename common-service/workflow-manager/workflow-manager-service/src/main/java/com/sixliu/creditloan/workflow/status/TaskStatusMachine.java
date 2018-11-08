package com.sixliu.creditloan.workflow.status;

import com.sixliu.workflow.constant.TaskStatus;
import com.sixliu.workflow.dto.TaskProcessResult;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程任务状态机
 */
public interface TaskStatusMachine {

	TaskStatus getTaskStatus();
	
	void process(TaskProcessResult taskProcessResult,CompleteCallback completeCallback);
	
	@FunctionalInterface
	public interface CompleteCallback{
		
		void complete(String jobId);
	}
}
