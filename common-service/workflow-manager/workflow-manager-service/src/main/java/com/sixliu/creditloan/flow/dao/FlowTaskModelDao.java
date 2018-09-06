package com.sixliu.creditloan.flow.dao;

import java.util.List;

import com.sixliu.creditloan.flow.dto.FlowTaskModel;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface FlowTaskModelDao {

	int insert(FlowTaskModel flowTaskModel);
	
	FlowTaskModel get(String id);
	
	FlowTaskModel getByflowJobModelAndPhase(String flowJobModelId, int phase);

	List<FlowTaskModel> listByflowJobModel(String flowJobModelId);
}
