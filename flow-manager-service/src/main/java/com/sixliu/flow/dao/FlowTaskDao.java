package com.sixliu.flow.dao;

import java.util.Date;
import java.util.List;

import com.sixliu.flow.TaskStatus;
import com.sixliu.flow.entity.FlowTask;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public interface FlowTaskDao {

	int insert(FlowTask flowTask);

	FlowTask get(String id);

	List<FlowTask> listManualFlowTaskByRole(String roleId);

	int updateWorkerForManual(String id, String worker, Date updateDate, Integer currentVersion);

	int updateApprovalResult(String id, TaskStatus status, String innerOpinion, String outerOpinion, String channelId,
			Date updateDate, Integer currentVersion);
}
