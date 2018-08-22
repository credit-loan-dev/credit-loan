package com.sixliu.creditloan.product.entity.loan;

import com.sixliu.creditloan.product.LoanTermType;
import com.sixliu.creditloan.product.entity.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
*@author:MG01867
*@date:2018年8月22日
*@E-mail:359852326@qq.com
*@version:
*@describe 产品-贷款配置
*/
@Data
@EqualsAndHashCode(callSuper = false)
public class ProductLoanConfig extends BaseEntity{

	/**产品id**/
	private String productId;
	
	/** 最小单笔贷款金额:VARCHAR(20) **/
	private Integer minSingleLoanAmount;

	/** 最大单笔贷款金额:VARCHAR(20) **/
	private Integer maxSingleLoanAmount;
	
	/** 单笔贷款期限类型**/
	private LoanTermType loanTermType;
	
	/** 最小单笔贷款期限(数量):INT(3) **/
	private Integer minSingleLoanTerm;

	/** 最大单笔贷款期限(数量):INT(3) **/
	private Integer maxSingleLoanTerm;
	
	/**贷款申请流程模型id**/
	private String loanFlowModleId;
}
