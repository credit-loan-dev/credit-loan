package com.sixliu.creditloan.workflow.constant;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

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
	MANUAL,

	/** 流程作业任务自动审批处理类型 **/
	AUTO;
	
	private final static Set<String> names;

	static {
		names = new HashSet<>(TaskType.values().length);
		for (TaskType item : TaskType.values()) {
			names.add(item.name());
		}
	}

	public static boolean validate(String value) {
		return names.contains(value);
	}

	@MappedTypes(value=TaskType.class) 
	@MappedJdbcTypes(value = { JdbcType.VARCHAR, JdbcType.CHAR })
	public static class TaskTypeHandler extends BaseTypeHandler<TaskType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, TaskType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public TaskType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return TaskType.valueOf(value);
		}

		@Override
		public TaskType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return TaskType.valueOf(value);
		}

		@Override
		public TaskType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return TaskType.valueOf(value);
		}

	}
}
