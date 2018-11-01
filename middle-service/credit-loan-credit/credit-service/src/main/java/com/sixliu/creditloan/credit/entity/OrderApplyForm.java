package com.sixliu.creditloan.credit.entity;

import com.sixliu.credit.common.entity.BaseEntity;
import com.sixliu.creditloan.product.constant.LoanTermType;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author:MG01867
 * @date: 2018年6月15日
 * @email: 359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class OrderApplyForm extends BaseEntity {

	/** 客户id:VARCHAR(36) **/
	private String customerId;

	/** 产品id:VARCHAR(36) **/
	private String productId;

	/** 申请额度:INT(11) **/
	private Integer applyCreditlimit;
	
	/** 申请贷款期限类型(1:月,2:天):INT(1) **/
	private LoanTermType applyLoanTermType;

	/** 申请贷款期限(数量):INT(4) **/
	private Integer applyLoanTerm;

	/** 推荐人id:VARCHAR(36) **/
	private String refereeUserId;

	/** 活动id:VARCHAR(36) **/
	private String activitiesId;
	
	/** 推荐人id:VARCHAR(36) **/
	private String applyUserId;
		
	/**申请终端:VARCHAR(36) **/
	private String terminal;

}
