package com.sixliu.creditloan.workflow.status;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.springframework.stereotype.Component;

import com.sixliu.creditloan.workflow.constant.TaskStatus;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Component
public class TaskStatusMachineFactory {

	private Map<TaskStatus, TaskStatusMachine> map = new HashMap<>();

	
	/**
	 * 流程任务状态机注册
	 * @param taskStatus        状态
	 * @param taskStatusMachine
	 */
	public void register(TaskStatusMachine taskStatusMachine) {
		Objects.requireNonNull(taskStatusMachine);
		TaskStatusMachine stock = map.get(taskStatusMachine.getTaskStatus());
		if (null != stock && stock != taskStatusMachine) {
			throw new IllegalArgumentException(
					String.format("Already registed TaskStatusMachine[%s] for TaskStatus[%s]",
							taskStatusMachine.getClass().getName(), taskStatusMachine.getTaskStatus().name()));
		}
		map.put(taskStatusMachine.getTaskStatus(), taskStatusMachine);
	}

	/**
	 * 通过流程任务状态获取相应的状态机
	 * 
	 * @param taskStatus
	 * @return
	 */
	public final TaskStatusMachine get(TaskStatus taskStatus) {
		Objects.requireNonNull(taskStatus);
		TaskStatusMachine taskStatusMachine = map.get(taskStatus);
		if (null == taskStatusMachine) {
			throw new UnsupportedOperationException(
					String.format("No operation is supported for status[%s]", taskStatus));
		} else {
			return taskStatusMachine;
		}
	}
}
