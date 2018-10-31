package com.sixliu.user.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sixliu.user.ServiceName;
import com.sixliu.user.dto.UserDTO;


/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe 用户管理客户端接口
*/
@FeignClient(ServiceName.SERVICE_NAME)
@Validated
public interface UserManagerService {

	/**
	 * 通过用户id 获取用户
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/user-manager/get", method = RequestMethod.POST)
	UserDTO get(@RequestParam(name="userId") String userId);
	
	/**
	 * 通过角色id查询该角色下的用户
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value = "/user-manager/listUserByRoleId", method = RequestMethod.POST)
	List<UserDTO> listUserByRoleId(@RequestParam(name="userId") String roleId);
	
	
	@RequestMapping(value = "/user-manager/get", method = RequestMethod.POST)
	UserDTO confirmAndgetUser(@RequestParam(name="userId") String userId,@RequestParam(name="subordinateRoleId") String subordinateRoleId);
}
