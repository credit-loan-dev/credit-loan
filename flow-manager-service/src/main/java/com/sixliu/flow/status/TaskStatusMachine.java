package com.sixliu.flow.status;

import com.sixliu.flow.FlowJob;
import com.sixliu.flow.FlowTask;
import com.sixliu.flow.FlowTaskResult;

import lombok.NonNull;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public interface TaskStatusMachine {

	FlowTask process(@NonNull FlowJob flowJob, @NonNull FlowTask flowTask, @NonNull FlowTaskResult approvalResult);
}
