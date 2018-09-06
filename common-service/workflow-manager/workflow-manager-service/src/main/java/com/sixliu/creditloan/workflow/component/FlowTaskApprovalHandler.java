package com.sixliu.creditloan.workflow.component;

import com.sixliu.creditloan.workflow.dto.FlowTaskResult;

/**
 * @author:MG01867
 * @date:2018年7月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程任务自动审批处理handler
 */
public interface FlowTaskApprovalHandler {

	FlowTaskResult process();
}
