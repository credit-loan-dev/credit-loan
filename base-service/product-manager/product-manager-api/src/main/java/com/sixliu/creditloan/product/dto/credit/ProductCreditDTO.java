package com.sixliu.creditloan.product.dto.credit;

import com.sixliu.creditloan.product.constant.CreditApplyMutexType;

import lombok.Data;

/**
*@author:MG01867
*@date:2018年8月28日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@Data
public class ProductCreditDTO{

	/**数据id**/
	private String id;
	
	/**产品id**/
	private String productId;
	
	/**使用黑名单组id**/
	private String useBlacklistGroupId;
	
	/**授信申请互斥类型:INT(11)**/
	private CreditApplyMutexType creditApplyMutexType;
	
	/**授信申请最大持续天数**/
	private Integer applyMaxDayDuration;
	
	/**授信申请流程模型id**/
	private String applyFlowModleJobId;
	
	/**授信申请拒绝后干扰天数**/
	private Integer interfereDaysAfterReject;

}
