package com.sixliu.creditloan.product.entity.creditlimi;

import com.sixliu.creditloan.creditlimit.CreditlimitType;
import com.sixliu.creditloan.product.entity.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年7月30日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 产品-额度配置
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CreditlimitConfig extends BaseEntity {
	
	/**名称**/
	private String name;
	
	/**产品id**/
	private String productId;
	
	/**是否循环额度:INT(1)**/
	private Boolean loopCreditlimit;
	
	/**是否支持提高额度:INT(1)**/
	private Boolean increaseCreditlimit;
	
	/**是否支持降低额度:INT(1)**/
	private Boolean decreaseCreditlimit;
	
	/**是否关联客户基础额度:INT(1)**/
	private Boolean linkCustomerBaseCreditlimit;

	/**用途**/
	private CreditlimitType type;
	
	/**占用授信额度比例**/
	private Double ratio;
	
	/**风险级**/
	private Integer riskLevel;
	
	/** 最小授信额度**/
	private Double minCreditlimit;

	/** 最大授信额度 **/
	private Double maxCreditlimit;
	
	/**授信有效月数**/
	private Integer effectiveMonths;
}
