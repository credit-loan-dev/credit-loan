package com.sixliu.flow.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.annotations.Results;

import com.sixliu.flow.FlowJob;

/**
 * @author:MG01867
 * @date:2018年8月13日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public interface FlowJobDao {

	String TABLE_NAME="flow_job";
	
	@Insert("<script><selectKey keyProperty='id' resultType='java.lang.String' order='BEFORE'>select uuid()</selectKey>"
			+ "      insert into "+TABLE_NAME+"(`id`,`name`,`remarks`,update_user_id,update_date,create_user_id,create_date)"
			+ "      values(#{id},#{name},#{remarks},#{updateUserId},#{updateDate},#{updateUserId},#{createDate})</script>")
	int insert(FlowJob flowJob);

	@Select("select * from "+TABLE_NAME)
	@Results({ @Result(id = true, property = "id", column = "id"), 
			   @Result(property = "name", column = "name",jdbcType=JdbcType.VARCHAR),
			   @Result(property = "updateUserId", column = "update_user_id" ,jdbcType=JdbcType.VARCHAR),
			   @Result(property = "updateDate", column = "update_date",jdbcType=JdbcType.TIMESTAMP),
			   @Result(property = "createUserId", column = "create_user_id",jdbcType=JdbcType.VARCHAR),
			   @Result(property = "createDate", column = "create_date",jdbcType=JdbcType.TIMESTAMP)})
	FlowJob get(String id);
}
