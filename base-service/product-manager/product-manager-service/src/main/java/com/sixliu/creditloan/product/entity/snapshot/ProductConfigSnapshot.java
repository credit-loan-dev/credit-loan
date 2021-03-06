package com.sixliu.creditloan.product.entity.snapshot;


import com.sixliu.creditloan.product.entity.ProductConfig;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 产品快照
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ProductConfigSnapshot extends ProductConfig {

	/**原始产品编码**/
	private String originalId;
}
