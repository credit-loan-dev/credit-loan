package com.sixliu.user.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sixliu.user.ServiceName;
import com.sixliu.user.dto.ResourceDTO;
import com.sixliu.user.dto.UserDTO;
import com.sixliu.user.validation.AddValidationGroup;

/**
*@author:MG01867
*@date:2018年11月6日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
@FeignClient(ServiceName.SERVICE_NAME)
@Validated
@RequestMapping("/resource")
public interface ResourceService {

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	String add(@Validated(value = { AddValidationGroup.class }) @RequestBody UserDTO user);
	
	@RequestMapping(value = "/listByAppId", method = RequestMethod.POST)
	List<ResourceDTO> listByAppId(@RequestParam(name="appId") String appId);
}
