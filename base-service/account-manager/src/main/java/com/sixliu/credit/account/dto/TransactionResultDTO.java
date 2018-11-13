package com.sixliu.credit.account.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author:MG01867
 * @date:2018年7月5日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TransactionResultDTO {

	private String transferId;
	private boolean result;
	private String notice;
}
