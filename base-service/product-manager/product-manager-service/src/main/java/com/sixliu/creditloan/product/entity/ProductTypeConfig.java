package com.sixliu.creditloan.product.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 产品类型
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ProductTypeConfig extends BaseEntity {

	/** 产品父类型数据id:VARCHAR(36) **/
	private String parentId;

	/** 产品类型名称:VARCHAR(20) **/
	private String name;
	
	/** 产品类型深度:int(11) **/
	private Integer depth;
}
