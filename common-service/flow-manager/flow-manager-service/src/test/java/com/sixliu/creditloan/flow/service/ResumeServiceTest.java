package com.sixliu.creditloan.flow.service;

import static org.junit.Assert.assertNotNull;

import java.util.HashMap;
import java.util.Map;

import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.repository.DeploymentBuilder;
import org.activiti.engine.runtime.ProcessInstance;
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
    RuntimeService runtimeService;
	
	@Autowired
	RepositoryService repositoryService;
	
	@Test
	public void test() {
		Map<String, Object> variables = new HashMap<>();
        variables.put("applicantName", "John Doe");
        variables.put("email", "john.doe@activiti.com");
        variables.put("phoneNumber", "123456789");
        runtimeService.startProcessInstanceByKey("myProcess", variables);
	}

	@Test
	public void startProcess() throws Exception {
		DeploymentBuilder deploymentBuilder=repositoryService.createDeployment();
		deploymentBuilder.addClasspathResource("flow_model/flow_demo.bpmn");
		String key=deploymentBuilder.deploy().getKey();
		Map<String, Object> variables = new HashMap<>();
        variables.put("applicantName", "John Doe");
        variables.put("email", "john.doe@activiti.com");
        variables.put("phoneNumber", "123456789");
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey(key, variables);
		assertNotNull(processInstance.getId());
		System.out.println("id " + processInstance.getId() + " "
				+ processInstance.getProcessDefinitionId());
	}
}
