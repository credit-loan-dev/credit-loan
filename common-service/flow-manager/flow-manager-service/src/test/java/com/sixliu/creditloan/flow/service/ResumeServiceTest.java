package com.sixliu.creditloan.flow.service;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RuntimeService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.sixliu.creditloan.flow.BaseTest;

/**    
 * @author: sixliu
 * @email:  359852326@qq.com
 * @date:   2018年9月4日 下午10:33:22   
 * @version V1.0 
 * @Description:TODO
 */
public class ResumeServiceTest extends BaseTest{

	@Autowired
	ResumeService resumeService;
	
	@Autowired
    RuntimeService runtimeService;
	
	@Test
	public void test() {
		Map<String, Object> variables = new HashMap<>();
        variables.put("applicantName", "John Doe");
        variables.put("email", "john.doe@activiti.com");
        variables.put("phoneNumber", "123456789");
        runtimeService.startProcessInstanceByKey("myProcess", variables);
	}
}
