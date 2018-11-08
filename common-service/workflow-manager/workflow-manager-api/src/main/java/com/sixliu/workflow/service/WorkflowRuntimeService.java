package com.sixliu.workflow.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sixliu.user.validation.CurrentUserValidation;
import com.sixliu.workflow.WorkflowManagerApi;
import com.sixliu.workflow.constant.TaskStatus;
import com.sixliu.workflow.dto.CreateJobDTO;
import com.sixliu.workflow.dto.FlowTask;
import com.sixliu.workflow.dto.TaskProcessResult;

/**
 * @author:MG01867
 * @date: 2018年7月6日
 * @email:359852326@qq.com
 * @version:
 * @describe 流程管理-运行时服务接口
 */
@FeignClient(WorkflowManagerApi.SERVICE_NAME)
@Validated
@RequestMapping("/runtime")
public interface WorkflowRuntimeService {

    /**
     * 创建流程作业
     *
     * @param createJobDTO 
     * @return 返回创建好的作业id
     */
    @RequestMapping(value = "/createJob", method = RequestMethod.POST)
    @ResponseBody
    String createJob(CreateJobDTO createJobDTO);

    /**
     * 根据操作用户获取他的任务集
     *
     * @param userId 当前操作用户
     * @return 返回匹配到任务集
     */
    @RequestMapping(value = "/listTaskByUserId", method = RequestMethod.POST)
    List<FlowTask> listTaskByUserId(@CurrentUserValidation String userId);

    /**
     * 根据操作用户和任务状态获取他的任务集
     *
     * @param userId 当前操作用户
     * @param status 任务状态
     * @return 返回匹配到任务集
     */
    @RequestMapping(value = "/listTaskByUserIdAndTaskStatus", method = RequestMethod.POST)
    List<FlowTask> listTaskByUserIdAndTaskStatus(@CurrentUserValidation String userId, TaskStatus status);

    /**
     * 根据操作用户自动认领可以处理的任务
     *
     * @param userId 当前操作用户
     * @return 已领取的任务id
     */
    @RequestMapping(value = "/autoClaimTask", method = RequestMethod.POST)
    String autoClaimTask(@CurrentUserValidation String userId);

    /**
     * 提交任务处理结果
     *
     * @param taskProcessResult 任务处理结果
     */
    @RequestMapping(value = "/submitTaskProcessResult", method = RequestMethod.POST)
    void submitTaskProcessResult(TaskProcessResult taskProcessResult);

    /**
     * 根据作业id和用户id取消流程作业
     *
     * @param flowJobId 作业id
     * @param userId    当前操作用户
     */
    @RequestMapping(value = "/cancelJob", method = RequestMethod.POST)
    void cancelJob(String flowJobId,@CurrentUserValidation String userId);
}
