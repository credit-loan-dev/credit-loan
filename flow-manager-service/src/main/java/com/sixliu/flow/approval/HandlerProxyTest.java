package com.sixliu.flow.approval;

import com.sixliu.flow.FlowTaskResult;
import com.sixliu.flow.entity.FlowTask;

/**
 * @author:MG01867
 * @date:2018年7月18日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public class HandlerProxyTest implements AutoApprovalHandler {

	@Override
	public String getName() {
		return "HandlerProxyTest";
	}
	
	@Override
	public long getCheckInterval() {
		return 6000;
	}

	@Override
	public FlowTask check() {
		return  null;
	}

	@Override
	public FlowTaskResult process(FlowTask flowTask){
		System.out.println(flowTask);
		return  null;
	}
}