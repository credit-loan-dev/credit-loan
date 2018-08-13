package com.sixliu.flow.dao;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.flow.BaseTest;
import com.sixliu.flow.entity.FlowTaskModel;
import com.sixliu.flow.entity.TaskType;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class FlowTaskModelDaoTest extends BaseTest{

	@Autowired
	private FlowTaskModelDao flowTaskModelDao;
	
	@Test
	public void testInsert() {
		FlowTaskModel flowTaskModel=new FlowTaskModel();
		flowTaskModel.setName("test");
		flowTaskModel.setType(TaskType.AUTO);
		flowTaskModel.setWorker("worker");
		flowTaskModel.setCreateUserId("sixliu");
		flowTaskModel.setCreateDate(new Date());
		flowTaskModel.setUpdateUserId("sixliu");
		flowTaskModel.setUpdateDate(new Date());
		flowTaskModelDao.insert(flowTaskModel);
	}
	
	@Test
	public void testGet() {
		FlowTaskModel flowTaskModel=flowTaskModelDao.get("e40a2f20-9ed8-11e8-9e01-005056986f0b");
		assertTrue(null==flowTaskModel||null!=flowTaskModel);
	}
}
