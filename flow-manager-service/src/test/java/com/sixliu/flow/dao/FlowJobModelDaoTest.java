package com.sixliu.flow.dao;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.flow.BaseTest;
import com.sixliu.flow.entity.FlowJobModel;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class FlowJobModelDaoTest extends BaseTest{

	@Autowired
	private FlowJobModelDao flowJobModelDao;
	
	@Test
	public void testInsert() {
		FlowJobModel flowJobModel=new FlowJobModel();
		flowJobModel.setName("test");
		flowJobModel.setCreateUserId("sixliu");
		flowJobModel.setCreateDate(new Date());
		flowJobModel.setUpdateUserId("sixliu");
		flowJobModel.setUpdateDate(new Date());
		flowJobModelDao.insert(flowJobModel);
	}
	
	@Test
	public void testGet() {
		FlowJobModel flowJobModel=flowJobModelDao.get("6703c1f1-9ed5-11e8-9e01-005056986f0b");
		assertTrue(null==flowJobModel||null!=flowJobModel);
	}
}
