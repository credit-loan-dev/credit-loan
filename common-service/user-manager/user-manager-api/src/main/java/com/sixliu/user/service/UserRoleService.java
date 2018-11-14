package com.sixliu.user.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sixliu.user.ServiceName;
import com.sixliu.user.dto.UserRoleDTO;

/**
*@author:MG01867
*@date:2018年11月5日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
@FeignClient(ServiceName.SERVICE_NAME)
@Validated
@RequestMapping("/user_role")
public interface UserRoleService {

	@RequestMapping(value = "/getByUserIdAndRoleId", method = RequestMethod.POST)
	UserRoleDTO getByUserIdAndRoleId(@RequestParam(name="userId") String userId,@RequestParam(name="roleId") String roleId);
	
	@RequestMapping(value = "/listByRoleId", method = RequestMethod.POST)
	List<UserRoleDTO> listByRoleId(@RequestParam(name="roleId") String roleId);
	
	@RequestMapping(value = "/listByUserId", method = RequestMethod.POST)
	List<UserRoleDTO> listByUserId(@RequestParam(name="userId") String userId);
}
