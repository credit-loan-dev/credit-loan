package com.sixliu.flow.handler;

import com.sixliu.flow.FlowTask;
import com.sixliu.flow.FlowTaskResult;

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