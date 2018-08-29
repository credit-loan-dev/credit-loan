package com.sixliu.creditloan.product.entity.credit;


import com.sixliu.creditloan.product.constant.CreditApplyMutexType;
import com.sixliu.creditloan.product.entity.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年8月22日
*@E-mail:359852326@qq.com
*@version:
*@describe 产品-授信配置
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ProductCreditConfig extends BaseEntity {

	/**产品id**/
	private String productId;
	
	/**授信申请流程模型id**/
	private String flowJobModleId;
	
	/**授信申请互斥类型:VARCHAR(8)**/
	private CreditApplyMutexType applyMutexType;
	
	/**使用黑名单组id**/
	private String useBlacklistGroupId;
	
	/**授信申请最大持续天数**/
	private Integer applyMaxDayDuration;
	
	/**授信申请拒绝后干扰天数**/
	private Integer interfereDaysAfterReject;
}
