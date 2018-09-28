package com.sixliu.creditloan.workflow.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.creditloan.workflow.WorkflowManagerApi;
import com.sixliu.creditloan.workflow.constant.TaskStatus;
import com.sixliu.creditloan.workflow.dto.FlowTask;
import com.sixliu.creditloan.workflow.dto.TaskProcessResult;

/**
 * @author:MG01867
 * @date: 2018年7月6日
 * @email:359852326@qq.com
 * @version:
 * @describe 流程管理-运行时服务接口
 */
@FeignClient(WorkflowManagerApi.SERVICE_NAME)
@Validated
public interface WorkflowRuntimeService {

    /**
     * 创建流程作业
     *
     * @param jobModelId 作业模型id
     * @param userId     当前操作用户
     * @return 返回创建好的作业id
     */
    @RequestMapping(value = "/runtime/createJob", method = RequestMethod.POST)
    @ResponseBody
    String createJob(String jobModelId, String userId);

    /**
     * 根据操作用户获取他的任务集
     *
     * @param userId 当前操作用户
     * @return 返回匹配到任务集
     */
    @RequestMapping(value = "/runtime/listTaskByUserId", method = RequestMethod.POST)
    List<FlowTask> listTaskByUserId(String userId);

    /**
     * 根据操作用户和任务状态获取他的任务集
     *
     * @param userId 当前操作用户
     * @param status 任务状态
     * @return 返回匹配到任务集
     */
    @RequestMapping(value = "/runtime/listTaskByUserIdAndTaskStatus", method = RequestMethod.POST)
    List<FlowTask> listTaskByUserIdAndTaskStatus(String userId, TaskStatus status);

    /**
     * 根据操作用户自动认领可以处理的任务
     *
     * @param userId 当前操作用户
     * @return 已领取的任务id
     */
    @RequestMapping(value = "/runtime/autoClaimTask", method = RequestMethod.POST)
    String autoClaimTask(String userId);

    /**
     * 提交任务处理结果
     *
     * @param taskProcessResult 任务处理结果
     */
    @RequestMapping(value = "/runtime/submitTaskProcessResult", method = RequestMethod.POST)
    void submitTaskProcessResult(TaskProcessResult taskProcessResult);

    /**
     * 根据作业id和用户id取消流程作业
     *
     * @param flowJobId 作业id
     * @param userId    当前操作用户
     */
    @RequestMapping(value = "/runtime/cancelJob", method = RequestMethod.POST)
    void cancelJob(String flowJobId, String userId);
}
