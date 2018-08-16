package com.sixliu.flow.service.impl;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sixliu.flow.dao.FlowTaskModelDao;
import com.sixliu.flow.dto.FlowTaskModelDTO;
import com.sixliu.flow.entity.FlowJobModel;
import com.sixliu.flow.entity.FlowTaskModel;
import com.sixliu.flow.service.FlowConfigService;

/**
*@author:MG01867
*@date:2018年8月15日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程配置服务
*/
@Service
public class FlowConfigServiceImpl implements FlowConfigService{

	@Autowired
	private FlowTaskModelDao flowTaskModelDao;
	
	@Override
	public void addFlowTaskModel(FlowTaskModelDTO flowTaskModelDTO) {
		FlowTaskModel flowTaskModel=new FlowTaskModel();
		BeanUtils.copyProperties(flowTaskModelDTO, flowTaskModel);
		flowTaskModel.setUpdateDate(new Date());
		flowTaskModelDao.insert(flowTaskModel);
	}

	@Override
	public void addFlowJobModel(FlowJobModel flowJobModel) {
		// TODO Auto-generated method stub
		
	}

}
