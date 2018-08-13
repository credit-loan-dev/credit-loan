package com.sixliu.flow.dao;

import com.sixliu.flow.entity.FlowJobModel;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程作业模型数据访问dao
*/
public interface FlowJobModelDao {

	/**
	 * 通过流程作业模型id获取流程作业模型
	 * @param id
	 * @return
	 */
	FlowJobModel get(String id);
	
	int insert(FlowJobModel flowJobModel);
}
