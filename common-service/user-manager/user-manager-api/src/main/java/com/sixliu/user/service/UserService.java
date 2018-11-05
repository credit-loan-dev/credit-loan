package com.sixliu.user.service;

import javax.validation.constraints.NotBlank;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sixliu.user.ServiceName;
import com.sixliu.user.dto.UserDTO;
import com.sixliu.user.validation.AddValidationGroup;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 用户管理客户端接口
 */
@FeignClient(ServiceName.SERVICE_NAME)
@Validated
@RequestMapping("/user")
public interface UserService {

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	String add(@Validated(value = { AddValidationGroup.class }) @RequestBody UserDTO user);

	/**
	 * 通过用户id 获取用户
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/get", method = RequestMethod.GET)
	UserDTO get(@NotBlank(message = "The user's id must be not blank") @RequestParam(name = "id") String id);
}
