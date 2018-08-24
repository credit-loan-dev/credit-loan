package com.sixliu.creditloan.product.dao.credit;

import java.util.List;

import com.sixliu.creditloan.product.entity.credit.CreditApplyFormConfig;

/**
*@author:MG01867
*@date:2018年8月24日
*@E-mail:359852326@qq.com
*@version:
*@describe 授信申请表单配置 数据访问接口
*/
public interface CreditApplyFormConfigDao {

	CreditApplyFormConfig get(String id);
	
	List<CreditApplyFormConfig> listByOwnerId(String ownerId);
	
	int insert(CreditApplyFormConfig creditApplyFormConfig);
}
