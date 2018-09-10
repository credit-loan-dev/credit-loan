package com.sixliu.creditloan.product.service.impl;

import javax.validation.constraints.NotBlank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.creditloan.product.converter.ProductDTOConverter;
import com.sixliu.creditloan.product.dao.ProductConfigDao;
import com.sixliu.creditloan.product.dao.snapshot.ProductConfigSnapshotDao;
import com.sixliu.creditloan.product.dto.ProductCreditDTO;
import com.sixliu.creditloan.product.dto.ProductCreditSnapshotDTO;
import com.sixliu.creditloan.product.entity.ProductConfig;
import com.sixliu.creditloan.product.entity.snapshot.ProductConfigSnapshot;
import com.sixliu.creditloan.product.exception.AppException;
import com.sixliu.creditloan.product.service.ProductForCreditLoanService;

/**
*@author:MG01867
*@date:2018年6月15日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
@RestController
public class ProductForCreditServiceImpl implements ProductForCreditLoanService{

	final static Logger log = LoggerFactory.getLogger(ProductForCreditServiceImpl.class);

	@Autowired
	private ProductConfigDao productConfigDao;
	
	@Autowired
	private ProductConfigSnapshotDao productConfigSnapshotDao;
	
	@Override
	public ProductCreditDTO getProductCreditConfig(String id) {
		ProductConfig productConfig=productConfigDao.get(id);
		return ProductDTOConverter.convert(productConfig);
	}


	@Override
	public String generateProductSnapshot(String productId) {
		ProductConfig productConfig=productConfigDao.get(productId);
		if(null==productConfig) {
			throw new AppException(String.format("The product[%s] is illegal", productId));
		}
		ProductConfigSnapshot productConfigSnapshot=new ProductConfigSnapshot();
		BeanUtils.copyProperties(productConfig, productConfigSnapshot);
		productConfigSnapshot.setId(null);
		productConfigSnapshot.setOriginalId(productConfig.getId());
		productConfigSnapshotDao.insert(productConfigSnapshot);
		return productConfigSnapshot.getId();
	}


	@Override
	public ProductCreditSnapshotDTO getProductSnapshot(
			@NotBlank(message = "The productSnapshot's Id must be non blank") String productSnapshotId) {
		// TODO Auto-generated method stub
		return null;
	}
}
