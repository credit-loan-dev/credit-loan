package com.sixliu.creditloan.product.entity.loan;

import com.sixliu.creditloan.product.constant.LoanTermType;
import com.sixliu.creditloan.product.entity.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年8月22日
*@E-mail:359852326@qq.com
*@version:
*@describe 产品-贷款配置
*/
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
public class ProductLoanConfig extends BaseEntity{

	/**产品id**/
	private String productId;
	
	/**贷款申请流程模型id**/
	private String flowJobModleId;
	
	/** 最小单笔贷款金额:VARCHAR(20) **/
	private Double minSingleLoanAmount;

	/** 最大单笔贷款金额:VARCHAR(20) **/
	private Double maxSingleLoanAmount;
	
	/** 单笔贷款期限类型**/
	private LoanTermType loanTermType;
	
	/** 最小单笔贷款期限(数量):INT(3) **/
	private Integer minSingleLoanTerm;

	/** 最大单笔贷款期限(数量):INT(3) **/
	private Integer maxSingleLoanTerm;
}
