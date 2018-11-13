package com.sixliu.credit.account.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年11月13日
 * @email:359852326@qq.com
 * @version:
 * @describe 交易时-账户快照
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class AccountSnapshot extends Account {

	/** 交易id **/
	private String TransactionId;

	/** 原始账户id **/
	private String originalId;

	/** 原始账户数据版本 **/
	private int originalVersion;
}
