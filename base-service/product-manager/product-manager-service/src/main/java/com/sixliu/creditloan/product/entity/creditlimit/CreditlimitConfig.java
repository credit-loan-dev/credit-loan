package com.sixliu.creditloan.product.entity.creditlimit;

import com.sixliu.creditloan.product.entity.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年7月30日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 产品-额度基础配置
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CreditlimitConfig extends BaseEntity {
	
	/**产品id**/
	private String productId;
	
	/** 产品额度id **/
	private String productCreditlimitId;
	
	/** 渠道额度id **/
	private String channelCreditlimitId;
	
	/** 关联客户基础额度**/
	private String linkCustomerBaseCreditlimit;
	
	/**是否循环额度:INT(1)**/
	private Boolean loopCreditlimit;
	
	/**是否支持提高额度:INT(1)**/
	private Boolean increaseCreditlimit;
	
	/**是否支持降低额度:INT(1)**/
	private Boolean decreaseCreditlimit;
	
	/** 最小授信额度**/
	private Double minCreditlimit;

	/** 最大授信额度 **/
	private Double maxCreditlimit;
	
	/**授信有效月数**/
	private Integer effectiveMonths;
}
