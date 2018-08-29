package com.sixliu.creditloan.credit.base.check;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.sixliu.creditloan.credit.dto.CreditApplyDTO;

/**
 * @author:MG01867
 * @date:2018年8月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Component
public class CreditApplyPreCheckManager implements CreditApplyPreCheck {


	private Map<String, List<CreditApplyPreCheck>> creditApplyPreCheckCache = new HashMap<>();

	@Override
	public void check(CreditApplyDTO creditApplyDTO) {
		List<CreditApplyPreCheck> creditApplyPreChecks=getCreditApplyPreChecks(creditApplyDTO.getProductId());
		if(null==creditApplyPreChecks) {
			throw new IllegalArgumentException("");
		}
		for(int i=0,size=creditApplyPreChecks.size();i<size;i++) {
			CreditApplyPreCheck creditApplyPreCheck=creditApplyPreChecks.get(0);
			creditApplyPreCheck.check(creditApplyDTO);
		}
	}
	
	private List<CreditApplyPreCheck> getCreditApplyPreChecks(String productId){
		return creditApplyPreCheckCache.get(productId);
	}
}
