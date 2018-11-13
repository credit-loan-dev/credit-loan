package com.sixliu.credit.account.entity;

import java.util.Date;

import com.sixliu.credit.account.common.AccountStatus;
import com.sixliu.credit.account.common.AccountType;
import com.sixliu.credit.account.common.CurrencyType;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年7月10日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Account extends AuditBaseEntity {

	/** 账户编码 **/
	private String code;
	
	/** 账户类型 **/
	private AccountType type;
	
	/** 账户状态 **/
	private AccountStatus status;
	
	/** 交易密码 **/
	private String transactPassword;

	/** 货币类型 **/
	private CurrencyType currencyType;
	
	/** 授信金额 **/
	private Double creditAmount;

	/** 剩余金额=授信金额,剩余金额=剩余金额-已使用金额 **/
	private Double surplusAmount;

	/** 冻结金额 **/
	private Double freezeAmount;

	/** 可用金额=剩余金额-冻结金额 **/
	private Double availableAmount;

	/** 已使用金额+=已使用金额 **/
	private Double usedAmount;
	
	/** 过期日期 **/
	private Date expireDate;
	
}
