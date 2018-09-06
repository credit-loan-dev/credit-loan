package com.sixliu.creditloan.workflow.entity;

import com.sixliu.creditloan.workflow.constant.EventType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年9月6日 下午10:57:07   
 * @version V1.0 
 * @Description:TODO
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class WorkflowEventModel extends BaseEntity {
	
	/**流程任务模型id**/
	private String taskId;
	
	/**事件类型**/
	private EventType type;
	
	/**事件执行脚本**/
	private String executeScript;
}
