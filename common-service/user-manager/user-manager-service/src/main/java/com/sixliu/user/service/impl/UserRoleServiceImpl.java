package com.sixliu.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class UserRoleServiceImpl implements UserRoleService{

	@Autowired
	private UserRoleDao userRoleDao;
	
	@Override
	public List<UserRoleDTO> listByRoleId(String roleId) {
		userRoleDao.listByRoleId(roleId);
		return null;
	}

	@Override
	public List<UserRoleDTO> listByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserRoleDTO getByUserIdAndRoleId(String userId, String roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}
