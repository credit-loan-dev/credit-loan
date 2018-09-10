package com.sixliu.creditloan.workflow.dto;

import javax.validation.constraints.NotBlank;

import lombok.Data;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年9月10日 下午10:57:15   
 * @version V1.0 
 * @Description:TODO
 */
@Data
public abstract class BaseFormDTO {

	/**表单id:避免表单重复提交**/
	@NotBlank(message="The form'id must be not blank")
	private String formId;
	
	/**数据更新用户id:VARCHAR(36)**/
	@NotBlank(message="The current user'id must be not blank")
	private String currentUserId;
}
