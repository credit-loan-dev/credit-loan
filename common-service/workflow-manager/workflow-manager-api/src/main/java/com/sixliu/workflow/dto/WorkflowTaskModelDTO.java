package com.sixliu.workflow.dto;

import java.util.Date;

import com.sixliu.workflow.constant.TaskType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年9月10日 下午10:44:22   
 * @version V1.0 
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WorkflowTaskModelDTO extends BaseFormDTO{

	/**数据id业务无关性:VARCHAR(36)**/
	private String id;
	
	/** 流程作业任务名称 **/
	private String name;

	/** 流程作业模型id **/
	private String jobId;

	/** 流程作业任务所处阶段 **/
	private Integer phase;

	/** 流程作业任务处理类型 **/
	private TaskType type;

	/** 流程作业任务处理worker **/
	private String worker;
	
	/**数据备注:VARCHAR(100)**/
	private String remarks;
	
	/**数据版本:INT(11)**/
	private Integer version;
	
	/**数据更新用户id:VARCHAR(36)**/
	private String updateUserId;
	
	/**数据更新日期(每次写操作时赋值):TIMESTAMP**/
	private Date updateDate;
	
	/**数据创建用户id:VARCHAR(36)**/
	private String createUserId;
	
	/**数据创建日期(只在创建时赋值):TIMESTAMP**/
	private Date createDate;
}
