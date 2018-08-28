package com.sixliu.creditloan.product.entity;

import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author:MG01867
 * @date:2018年6月15日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 贷款产品配置: 1.基础配置 2.额度配置 3.授信配置 4.贷款配置
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ProductConfig extends BaseEntity {

	/** 产品编码:VARCHAR(20) **/
	private String code;

	/** 产品名称:VARCHAR(20) **/
	private String name;

	/** 产品类型:VARCHAR(36) **/
	private String typeId;

	/** 产品优先级:INT(4) **/
	private Integer priority;

	/** 产品额度id **/
	private String creditlimitId;

	/** 是否有效:INT(1) **/
	private Boolean effective;

	/** 生效日期:TIMESTAMP **/
	private Date effectiveDate;

	/** 过期日期:TIMESTAMP **/
	private Date expireDate;
}
