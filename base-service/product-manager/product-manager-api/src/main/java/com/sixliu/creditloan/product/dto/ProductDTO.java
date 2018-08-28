package com.sixliu.creditloan.product.dto;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @author:MG01867
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@Data
public class ProductDTO {

	/**产品编码:VARCHAR(20)**/
	private String id;
	
	/**产品编码:VARCHAR(20)**/
	private String code;
	
	/**产品名称:VARCHAR(20)**/
	private String name;
	
	/**产品类型:VARCHAR(36)**/
	private String typeId;
	
	/**产品优先级:INT(4)**/
	private Integer priority;
	
	/**产品额度id**/
	private String creditlimitId;
	
	/**是否有效:INT(1)**/
	private Boolean effective;
	
	/**生效日期:TIMESTAMP**/
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date effectiveDate;
	
	/**过期日期:TIMESTAMP**/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date expireDate;
}
