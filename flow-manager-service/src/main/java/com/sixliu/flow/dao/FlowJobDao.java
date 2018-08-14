package com.sixliu.flow.dao;

import com.sixliu.flow.entity.FlowJob;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface FlowJobDao {

	int insert(FlowJob flowJob);
	
	FlowJob get(String id);
}
