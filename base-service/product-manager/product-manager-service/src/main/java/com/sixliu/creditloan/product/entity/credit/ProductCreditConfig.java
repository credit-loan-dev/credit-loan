package com.sixliu.creditloan.product.entity.credit;


import com.sixliu.creditloan.product.CreditApplyMutexType;
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
	
	/**授信申请互斥类型:INT(11)**/
	private CreditApplyMutexType creditApplyMutexType;
	
	/**使用黑名单组id**/
	private String useBlacklistGroupId;
	
	/**是否循环额度:INT(1)**/
	private Boolean loopCreditlimit;
	
	/**是否支持提高额度:INT(1)**/
	private Boolean increaseCreditlimit;
	
	/**是否支持降低额度:INT(1)**/
	private Boolean decreaseCreditlimit;
	
	/**是否关联客户基础额度:INT(1)**/
	private Boolean linkCustomerBaseCreditlimit;
	
	/**授信申请最大持续月数**/
	private Integer creditApplyMaxMonths;
	
	/**授信申请流程模型id**/
	private String creditApplyFlowModleId;
	
	/**授信申请拒绝影响天数**/
	private Integer creditApplyRejectInfluenceDays;

	/** 最小授信额度**/
	private Integer minCreditlimit;

	/** 最大授信额度 **/
	private Integer maxCreditlimit;
	
	/**授信额度有效月数**/
	private Integer creditlimitEffectiveMonths;
}
