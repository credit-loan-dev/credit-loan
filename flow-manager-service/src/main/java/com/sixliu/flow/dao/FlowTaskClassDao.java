package com.sixliu.flow.dao;

import java.util.List;

import com.sixliu.flow.entity.FlowTaskClass;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface FlowTaskClassDao {

	int insert(FlowTaskClass flowTaskClass);
	
	FlowTaskClass get(String id);
	
	FlowTaskClass getByflowJobClassAndPhase(String flowJobClassId, int phase);

	List<FlowTaskClass> listByflowJobClass(String flowJobClassId);
}
