package com.sixliu.creditloan.workflow.service.impl;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sixliu.workflow.service.WorkflowService;

/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年9月7日 下午8:21:22
 * @version V1.0
 * @Description:服务uuid
 */
@RestController
public class WorkflowServiceImpl implements WorkflowService {

	public final static String UUID = java.util.UUID.randomUUID().toString();
	
	@Value("${spring.cloud.client.ip-address}")
	private String ip;

	@Value("${server.port}")
	private int port;
	
	private String url;
	
	@PostConstruct
	public void init() {
		this.url=String.format("http://%s:%s/%s/%s",ip,port,WorkflowService.URL_PRE,UUID);
	}

	@RequestMapping(value = URL_PRE + "/{uuid}", method = RequestMethod.GET)
	@ResponseBody
	@Override
	public boolean check(@PathVariable("uuid") String uuid) {
		return UUID.equals(uuid);
	}
	
	@Override
	public String getUrl() {
		return url;
	}
}
