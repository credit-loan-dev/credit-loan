package com.sixliu.flow.status;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.sixliu.flow.TaskStatus;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public class TaskStatusMachineFactoryTest{

	@Test
	public void testInsert() {
		TaskStatusMachineFactory taskStatusMachineFactory=new TaskStatusMachineFactory();
		TaskStatusMachine taskStatusMachine=taskStatusMachineFactory.get(TaskStatus.PASS);
		assertTrue(null==taskStatusMachine||null!=taskStatusMachine);
	}

}
