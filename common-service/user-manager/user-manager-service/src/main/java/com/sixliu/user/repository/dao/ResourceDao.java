package com.sixliu.user.repository.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sixliu.user.repository.entity.ResourceEntity;

/**
*@author:MG01867
*@date:2018年11月1日
*@email:359852326@qq.com
*@version:
*@describe 资源实体数据访问接口
*/
public interface ResourceDao extends BaseDao<ResourceEntity>{

	List<ResourceEntity> listByAppId(@Param("appId") String appId);
}
