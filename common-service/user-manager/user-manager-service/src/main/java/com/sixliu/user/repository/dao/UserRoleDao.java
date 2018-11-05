package com.sixliu.user.repository.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.sixliu.user.repository.entity.UserRoleEntity;

/**
*@author:MG01867
*@date:2018年11月1日
*@email:359852326@qq.com
*@version:
*@describe //TODO
*/
public interface UserRoleDao extends BaseDao<UserRoleEntity>{

	
	/**
	 * 通过角色id查询相应的user集合
	 * @param roleId 角色id
	 * @return
	 */
	List<UserRoleEntity> listByRoleId(@Param("roleId") String roleId);
}
