package com.sixliu.creditloan.product.dto;


import javax.validation.constraints.Min;

import lombok.Data;

/**
*@author:MG01867
*@date:2018年9月3日
*@E-mail:359852326@qq.com
*@version:
*@describe 分页查询DTO
*/
@Data
public class ProductConfigPagedQueryDTO{

	@Min(value=0,message="The index must be >=0")
	private Integer index;
	
	@Min(value=1,message="The index must be >=1")
	private Integer size;
}
