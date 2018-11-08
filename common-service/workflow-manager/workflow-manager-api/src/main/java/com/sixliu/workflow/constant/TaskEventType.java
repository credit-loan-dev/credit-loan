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
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年8月20日 下午7:52:16
 * @version V1.0
 * @Description:流程任务事件类型,监听事件的listener都是独立运行
 */
public enum TaskEventType {

	/** 流程任务创建 **/
	CREATED,

	/** 流程审批通过 **/
	PASSED,

	/** 流程任务拒绝 **/
	REJECTED,

	/** 流程任务驳回 **/
	OVERRULED,

	/** 流程任务转移 **/
	TRANSFERRED,

	/** 流程任务取消 **/
	CANCELED;

	private final static Set<String> names;

	static {
		names = new HashSet<>(TaskEventType.values().length);
		for (TaskEventType item : TaskEventType.values()) {
			names.add(item.name());
		}
	}

	public static boolean validate(String value) {
		return names.contains(value);
	}

	@MappedTypes(value = TaskEventType.class)
	@MappedJdbcTypes(value = { JdbcType.VARCHAR, JdbcType.CHAR })
	public static class TaskStatusHandler extends BaseTypeHandler<TaskEventType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, TaskEventType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public TaskEventType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return valueOf(value);
		}

		@Override
		public TaskEventType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return valueOf(value);
		}

		@Override
		public TaskEventType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return valueOf(value);
		}

	}

}
