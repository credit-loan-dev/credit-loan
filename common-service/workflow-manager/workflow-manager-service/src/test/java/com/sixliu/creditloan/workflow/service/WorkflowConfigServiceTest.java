package com.sixliu.creditloan.workflow.service;

import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import com.sixliu.creditloan.workflow.BaseTest;
import com.sixliu.creditloan.workflow.dto.AddWorkflowJobModelDTO;

/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年9月4日 下午10:33:22
 * @version V1.0
 * @Description:TODO
 */
public class WorkflowConfigServiceTest extends BaseTest {

	@Autowired
	WorkflowConfigService workflowConfigService;

	@Test
	public void testSaveWorkflowJobModel() throws Exception {
		AddWorkflowJobModelDTO addWorkflowJobModel = new AddWorkflowJobModelDTO();
		MockHttpServletRequestBuilder mockHttpServletRequestBuilder = MockMvcRequestBuilders
				.post("/config/saveWorkflowJobModel");
		mockHttpServletRequestBuilder.contentType(MediaType.APPLICATION_JSON_UTF8);
		mockHttpServletRequestBuilder.content(toJson(addWorkflowJobModel));
		mockHttpServletRequestBuilder.accept(MediaType.APPLICATION_JSON);
		ResultActions resultActions = mvc.perform(mockHttpServletRequestBuilder);
		resultActions.andExpect(MockMvcResultMatchers.status().isOk())
				.andDo(MockMvcResultHandlers.log())
				.andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON_UTF8))
				.andExpect(MockMvcResultMatchers.content().string(Matchers.notNullValue()));
		String content = resultActions.andReturn().getResponse().getContentAsString();
		checkOk(content);
	}
}
