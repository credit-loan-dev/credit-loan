package com.sixliu.user.service.impl;

import javax.validation.ValidationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.user.dto.UserDTO;
import com.sixliu.user.repository.dao.UserDao;
import com.sixliu.user.repository.entity.UserEntity;
import com.sixliu.user.service.UserService;
import com.sixliu.user.util.Convertor;

/**
 * @author:MG01867
 * @date:2018年11月5日
 * @email:359852326@qq.com
 * @version:
 * @describe //TODO
 */
@RestController
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	@Override
	public String add(UserDTO user) {
		UserEntity stockUser=userDao.getByName(user.getName());
		if(null!=stockUser) {
			throw new ValidationException(String.format("The user[name:%s] already exists", user.getName()));
		}
		UserEntity userEntity=Convertor.convert(user, () -> new UserEntity());
		userEntity.setId(null);
		userEntity.setUpdateUserId(user.getCreateUserId());
		userDao.add(userEntity);
		return userEntity.getId();
	}
	
	@Override
	public UserDTO get(String userId) {
		return Convertor.convert(userDao.get(userId), () -> new UserDTO());
	}

	@Override
	public UserDTO getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
}
