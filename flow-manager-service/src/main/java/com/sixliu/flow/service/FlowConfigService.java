package com.sixliu.flow.service;

import com.sixliu.flow.dto.FlowTaskModelDTO;
import com.sixliu.flow.entity.FlowJobModel;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程配置服务接口
*/
public interface FlowConfigService {

	/**
	 * 增加流程任务模型
	 * @param flowTaskModel
	 */
	void addFlowTaskModel(FlowTaskModelDTO flowTaskModelDTO);
	
	/**
	 * 增加流程作业模型
	 * @param flowTaskModel
	 */
	void addFlowJobModel(FlowJobModel flowJobModel);
}
