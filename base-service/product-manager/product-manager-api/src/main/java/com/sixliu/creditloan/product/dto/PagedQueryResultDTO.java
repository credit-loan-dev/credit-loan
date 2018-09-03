package com.sixliu.creditloan.product.dto;

import java.util.List;

import lombok.Data;

/**
*@author:MG01867
*@date:2018年9月3日
*@E-mail:359852326@qq.com
*@version:
*@describe 分页查询结果
*/
@Data
public class PagedQueryResultDTO<T>{

	private Integer index;
	
	private Integer size;
	
	private Integer totalSize;
	
	private List<T> datas;
}
