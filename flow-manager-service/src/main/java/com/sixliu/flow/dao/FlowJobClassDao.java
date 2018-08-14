package com.sixliu.flow.dao;

import com.sixliu.flow.entity.FlowJobClass;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public interface FlowJobClassDao {

	int insert(FlowJobClass flowJobModel);

	/**
	 * 通过流程作业模型id获取流程作业模型
	 * 
	 * @param id
	 * @return
	 */
	FlowJobClass get(String id);
}
