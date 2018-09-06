package com.sixliu.creditloan.flow.status;

import com.sixliu.creditloan.flow.dto.FlowJob;
import com.sixliu.creditloan.flow.dto.FlowTask;
import com.sixliu.creditloan.flow.dto.FlowTaskResult;

import lombok.NonNull;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程任务状态机
 */
public interface TaskStatusMachine {

	FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask, @NonNull FlowTaskResult approvalResult);
}
