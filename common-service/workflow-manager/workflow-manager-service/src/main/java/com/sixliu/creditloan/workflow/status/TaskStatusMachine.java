package com.sixliu.creditloan.workflow.status;

import com.sixliu.creditloan.workflow.dto.FlowTask;
import com.sixliu.creditloan.workflow.dto.FlowTaskResult;
import com.sixliu.creditloan.workflow.entity.WorkflowJob;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程任务状态机
 */
public interface TaskStatusMachine {

	FlowTask process(WorkflowJob workflowJob,FlowTask flowTask,FlowTaskResult approvalResult);
}
