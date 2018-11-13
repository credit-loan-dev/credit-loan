package com.sixliu.user.service;

import javax.validation.constraints.NotBlank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sixliu.user.ServiceName;
import com.sixliu.user.dto.AppDTO;

/**
*@author:MG01867
*@date:2018年11月10日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
@FeignClient(ServiceName.SERVICE_NAME)
@Validated
@RequestMapping("/app")
public interface AppService{

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	AppDTO get(@NotBlank(message = "The app's id must be not blank") @RequestParam(name = "id") String id);
	
	@RequestMapping(value = "/getByCode", method = RequestMethod.GET)
	AppDTO getByCode(@NotBlank(message = "The app's code must be not blank") @RequestParam(name = "id") String code);
}
