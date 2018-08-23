package com.sixliu.creditloan.product.entity.change;


import com.sixliu.creditloan.product.entity.ProductConfig;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 产品变更日志
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ProductConfigChange extends ProductConfig {

	/**原始产品编码**/
	private String originalId;
}
