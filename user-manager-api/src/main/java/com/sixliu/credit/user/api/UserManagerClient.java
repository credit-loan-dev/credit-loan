package com.sixliu.credit.user.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sixliu.credit.user.dto.UserDTO;


/**
*@author:MG01867
*@date:2018年8月13日
*@E-mail:359852326@qq.com
*@version:
*@describe 用户管理客户端接口
*/
@FeignClient("user-manager")
public interface UserManagerClient {

	/**
	 * 通过用户id 获取用户
	 * @param userId
	 * @return
	 */
	@RequestMapping(value = "/user-manager/get", method = RequestMethod.POST)
	UserDTO get(String userId);
	
	/**
	 * 通过角色id查询该角色下的用户
	 * @param roleId
	 * @return
	 */
	@RequestMapping(value = "/user-manager/listUserByRoleId", method = RequestMethod.POST)
	List<UserDTO> listUserByRoleId(String roleId);
}
