package com.sixliu.flow.service;

import com.sixliu.flow.entity.FlowJobModel;
import com.sixliu.flow.entity.FlowTaskModel;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface FlowConfigService {

	/**
	 * 增加流程任务模型
	 * @param flowTaskModel
	 */
	void addFlowTaskModel(FlowTaskModel flowTaskModel);
	
	/**
	 * 增加流程作业模型
	 * @param flowTaskModel
	 */
	void addFlowJobModel(FlowJobModel flowJobModel);
}
