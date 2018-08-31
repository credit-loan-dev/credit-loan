package com.sixliu.creditloan.credit.base.check;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sixliu.creditloan.credit.dto.CreditApplyDTO;
import com.sixliu.creditloan.creditlimit.service.CreditlimitManagerClient;
import com.sixliu.creditloan.customer.service.CustomerManagerService;
import com.sixliu.creditloan.order.service.OrderManagerService;
import com.sixliu.creditloan.product.service.ProductConfigService;

/**
 * @author:MG01867
 * @date:2018年8月7日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Component
public class CreditApplyPreCheckManager implements CreditApplyPreCheck {

	@Autowired
	private CustomerManagerService customerManagerService;

	@Autowired
	private ProductConfigService productConfigService;

	@Autowired
	private CreditlimitManagerClient creditlimitManagerClient;

	@Autowired
	private OrderManagerService orderManagerService;

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
		List<CreditApplyPreCheck> creditApplyPreChecks=creditApplyPreCheckCache.get(productId);
		if(null==creditApplyPreChecks) {
			synchronized (creditApplyPreCheckCache) {
				creditApplyPreChecks=creditApplyPreCheckCache.get(productId);
				if(null==creditApplyPreChecks) {
					creditApplyPreChecks=new ArrayList<>();
					creditApplyPreChecks.add(new CreditPreCheckForCustomer(customerManagerService, creditlimitManagerClient));
					creditApplyPreChecks.add(new CreditPreCheckForProduct(productConfigService, creditlimitManagerClient, orderManagerService));
					creditApplyPreCheckCache.put(productId, creditApplyPreChecks);
				}
			}
		}
		return creditApplyPreChecks;
	}
}
