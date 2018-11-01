package com.sixliu.user;

import static org.junit.Assert.assertFalse;

import java.util.TimeZone;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;
import com.sixliu.user.StartUp;



/**
 * @author:MG01867
 * @date:2018年2月5日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartUp.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class BaseTest extends AbstractJUnit4SpringContextTests {
	
	protected static final Logger log = LoggerFactory.getLogger(BaseTest.class);
	
	static {
		final TimeZone zone = TimeZone.getTimeZone("GMT+8"); // 获取中国时区
		TimeZone.setDefault(zone); // 设置时区
	}
	
	@Autowired
	private WebApplicationContext context;
	protected MockMvc mvc;
	private static Gson gson=new Gson();

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.webAppContextSetup(context).build(); // 构造MockMvc
	}

	protected static void checkOk(Object ob) {
		assertFalse(false);
	}
	
	
	protected static String toJson(Object ob) {
		return gson.toJson(ob);
	}


}
