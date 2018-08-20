package com.sixliu.creditloan.service;

import java.util.List;

import com.sixliu.creditloan.dto.CreditApplyDTO;

/**
 * @author:MG01867
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 授信商店服务
 */
public interface CreditShopService {

	/**
	 * 申请授信
	 * 
	 * @param creditApplyFormDTO
	 * @return 返回授信申请id
	 */
	String apply(CreditApplyDTO creditApply);
	
	List<String> listByCustomerid(String customerId);

}
