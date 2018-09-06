package com.sixliu.creditloan.workflow;

import static org.junit.Assert.assertFalse;

import java.util.TimeZone;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.sixliu.creditloan.workflow.StartUp;

/**
 * @author:MG01867
 * @date:2018年2月5日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StartUp.class,webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public abstract class BaseTest{
	
	protected static final Logger log = LoggerFactory.getLogger(BaseTest.class);
	
	static {
		final TimeZone zone = TimeZone.getTimeZone("GMT+8 "); // 获取中国时区
		TimeZone.setDefault(zone); // 设置时区
	}
	
	protected static void checkOk(Object ob) {
		assertFalse(false);
	}

}
