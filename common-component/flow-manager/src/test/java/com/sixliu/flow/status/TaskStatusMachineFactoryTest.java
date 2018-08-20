package com.sixliu.flow.status;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.flow.TaskStatus;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class TaskStatusMachineFactoryTest{

	@Autowired
	private TaskStatusMachineFactory taskStatusMachineFactory;
	
	@Test
	public void testInsert() {
		TaskStatusMachine taskStatusMachine=taskStatusMachineFactory.get(TaskStatus.PASS);
		assertTrue(null==taskStatusMachine||null!=taskStatusMachine);
	}

}
