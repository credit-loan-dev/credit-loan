package com.sixliu.creditloan.flow.constant;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;


/**
 * @author:MG01867
 * @date:2018年7月23日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe //TODO
 */
public enum TaskType {

	/** 流程作业任务人工手动审批类型 **/
	MANUAL(0),

	/** 流程作业任务自动审批处理类型 **/
	AUTO(1);
	
	private int value;

	TaskType(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}

	public static TaskType valueOf(int value) {
		if (0 == value) {
			return MANUAL;
		} else if (1 == value) {
			return AUTO;
		}else {
			throw new IllegalArgumentException();
		}
	}
	
	@MappedTypes(value=TaskType.class) 
	@MappedJdbcTypes(value= {JdbcType.INTEGER})
	public static class TaskTypeHandler extends BaseTypeHandler<TaskType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, TaskType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setInt(i, parameter.value());
		}

		@Override
		public TaskType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			int value = rs.getInt(columnName);
			return TaskType.valueOf(value);
		}

		@Override
		public TaskType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			int value = rs.getInt(columnIndex);
			return TaskType.valueOf(value);
		}

		@Override
		public TaskType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			int value = cs.getInt(columnIndex);
			return TaskType.valueOf(value);
		}

	}
}
