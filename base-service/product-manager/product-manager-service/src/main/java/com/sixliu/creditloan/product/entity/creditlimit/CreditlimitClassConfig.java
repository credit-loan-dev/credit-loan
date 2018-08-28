package com.sixliu.creditloan.product.entity.creditlimit;

import com.sixliu.creditloan.creditlimit.CreditlimitType;
import com.sixliu.creditloan.product.entity.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
*@author:MG01867
*@date:2018年8月28日
*@E-mail:359852326@qq.com
*@version:
*@describe 产品-额度类别配置
*/
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CreditlimitClassConfig extends BaseEntity {
	
	/**产品id**/
	private String productId;
	
	/**用途**/
	private CreditlimitType type;
	
	/**占用授信额度比例**/
	private Double ratio;
	
	/**风险级**/
	private Integer riskLevel;

}