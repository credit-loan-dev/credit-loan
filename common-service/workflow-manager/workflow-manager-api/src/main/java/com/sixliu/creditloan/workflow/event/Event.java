package com.sixliu.creditloan.workflow.event;

/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年8月20日 下午7:52:16
 * @version V1.0
 * @Description:工作流程事件
 */
public enum Event {

	/** 流程作业被创建 **/
	JOB_CREATE,

	/** 流程作业通过结束 **/
	JOB_PASS_ENDED,

	/** 流程作业拒绝结束 **/
	JOB_REJECT_ENDED,

	/** 流程作业取消结束 **/
	JOB_CANCEL_ENDED,

	/** 流程任务被创建 **/
	TASK_CREATE,
}
