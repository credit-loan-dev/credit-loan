package com.sixliu.user.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.user.BaseTest;
import com.sixliu.user.repository.dao.AppDao;
import com.sixliu.user.repository.entity.AppEntity;

/**
*@author:MG01867
*@date:2018年11月10日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
public class AppDaoTest extends BaseTest{

	@Autowired
	AppDao appDao;
	
	@Test
	public void testAdd() {
		AppEntity app=new AppEntity();
		app.setCode("code");
		app.setSecret("secret");
		app.setRedirectUrl("url");
		app.setScopes("scopes");
		app.setAuthorizedGrantTypes("authorization_code;refresh_token");
		app.setAccessTokenValiditySeconds(3000);
		app.setRefreshTokenValiditySeconds(18000);
		app.setDescribe("测试应用");
		app.setCreateUserId("02460d0de0e811e89e01005056986f0b");
		app.setUpdateUserId("02460d0de0e811e89e01005056986f0b");
		int count=appDao.add(app);
		checkOk(count);
	}

}
