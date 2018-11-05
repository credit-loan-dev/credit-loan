package com.sixliu.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.user.dto.UserRoleDTO;
import com.sixliu.user.repository.dao.UserRoleDao;
import com.sixliu.user.service.UserRoleService;

/**
*@author:MG01867
*@date:2018年11月5日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired
	private UserRoleDao userRoleDao;
	
	@Override
	public List<UserRoleDTO> listByRoleId(String roleId) {
		userRoleDao.listByRoleId(roleId);
		return null;
	}

}
