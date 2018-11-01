package com.sixliu.user.repository.dao;

import com.sixliu.user.repository.entity.BaseEntity;

/**
 * @author:MG01867
 * @date:2018年10月31日
 * @email:359852326@qq.com
 * @version:
 * @describe 数据访问基础接口
 */
public interface BaseDao<T extends BaseEntity> {

	/**
	 * 根据id获取数据
	 * 
	 * @param id 数据id
	 * @return 返回匹配的数据实体
	 */
	T get(String id);

	/**
	 * 新增数据实体
	 * 
	 * @param t 数据实体
	 * @return 返回新增影响行数
	 */
	int add(T t);

	/**
	 * 更新数据实体
	 * 
	 * @param t 数据实体
	 * @return 返回更新影响行数
	 */
	int update(T t);

	/**
	 * 根据实体id删除数据
	 * 
	 * @param id           数据id
	 * @param version      数据版本
	 * @param updateUserId 用戶id
	 * @return 返回影响行数
	 */
	int delete(String id, int version, String updateUserId);
}
