package com.sixliu.credit.account.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author:MG01867
 * @date:2018年7月12日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 交易日志
 */

@Data
@EqualsAndHashCode(callSuper = false)
public class TransactionLog extends BaseEntity {
	
	/** 交易Id **/
	private String TransactionId;
	
	/** 账户id **/
	private String fromAccountId;
	
	/** 账户id **/
	private String toAccountId;

	/** 交易金额 **/
	private Double amount;

	/** 是否回溯:1是，0否 **/
	private boolean backdata;
}
