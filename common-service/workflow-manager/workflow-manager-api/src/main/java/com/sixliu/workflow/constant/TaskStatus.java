package com.sixliu.workflow.constant;

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
 * @date:2018年7月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程作业任务状态
 */
public enum TaskStatus {

	/** 待认领 **/
	POOLING,

	/** 待处理 **/
	PENDING,
	
	/** 转移 **/
	TRANSFER,

	/** 通过 **/
	PASS,

	/** 拒绝 **/
	REJECT,

	/** 驳回 **/
	OVERRULE,

	/** 挂起 **/
	HANG_UP;

	private final static Set<String> names;

	static {
		names = new HashSet<>(TaskStatus.values().length);
		for (TaskStatus item : TaskStatus.values()) {
			names.add(item.name());
		}
	}

	public static boolean validate(String value) {
		return names.contains(value);
	}

	@MappedTypes(value = TaskStatus.class)
	@MappedJdbcTypes(value = { JdbcType.VARCHAR, JdbcType.CHAR })
	public static class TaskStatusHandler extends BaseTypeHandler<TaskStatus> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, TaskStatus parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public TaskStatus getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return valueOf(value);
		}

		@Override
		public TaskStatus getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return valueOf(value);
		}

		@Override
		public TaskStatus getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return valueOf(value);
		}

	}
}
