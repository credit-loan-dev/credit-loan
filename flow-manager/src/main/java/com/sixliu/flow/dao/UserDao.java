package com.sixliu.flow.dao;

import java.util.List;

import com.sixliu.flow.User;

/**
*@author:MG01867
*@date:2018年8月17日
*@E-mail:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface UserDao {

	User get(String userId);
	
	List<User> listUserByRoleId(String roleId);
	
	User confirmAndgetUser(String userId,String subordinateRoleId);
}
