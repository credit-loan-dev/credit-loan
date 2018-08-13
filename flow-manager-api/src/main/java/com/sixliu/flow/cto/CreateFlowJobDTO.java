package com.sixliu.flow.cto;

import javax.validation.constraints.NotBlank;

import com.sixliu.credit.common.validation.CurrentUserIdValidation;

import lombok.Data;

/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
public class CreateFlowJobDTO {

	@NotBlank(message = "the flowJobClassId must not be blank")
	private String flowJobClassId;
	
	@CurrentUserIdValidation
	private String userId;
	
	@NotBlank(message = "the channelId must not be blank")
	private String channelId;
}
