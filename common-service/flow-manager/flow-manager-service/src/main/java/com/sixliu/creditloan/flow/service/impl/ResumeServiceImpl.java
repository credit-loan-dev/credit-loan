package com.sixliu.creditloan.flow.service.impl;

import org.springframework.stereotype.Service;

import com.sixliu.creditloan.flow.service.ResumeService;

import lombok.extern.slf4j.Slf4j;

/**
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年9月4日 下午10:30:01
 * @version V1.0
 * @Description:TODO
 */
@Slf4j
@Service
public class ResumeServiceImpl implements ResumeService {

	@Override
	public boolean storeResume() {
		log.info("任务已经执行.....................................");
		return true;
	}
}
