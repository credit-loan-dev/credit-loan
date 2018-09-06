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
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年8月20日 下午7:52:16
 * @version V1.0
 * @Description:工作流程事件
 */
public enum EventType {

	/**流程任务创建 **/
	TASK_CREATED,

	/**流程审批通过**/
	TASK_PASSED,

	/**流程任务拒绝**/
	TASK_REJECTED,
	
	/**流程任务驳回**/
	TASK_OVERRULED,
	
	/**流程任务转移**/
	TASK_TRANSFERRED,

	/**流程任务取消**/
	TASK_CANCELED;
	
	private final static Set<String> names;

	static {
		names = new HashSet<>(EventType.values().length);
		for (EventType item : EventType.values()) {
			names.add(item.name());
		}
	}

	public static boolean validate(String value) {
		return names.contains(value);
	}

	@MappedTypes(value = EventType.class)
	@MappedJdbcTypes(value = { JdbcType.VARCHAR, JdbcType.CHAR })
	public static class TaskStatusHandler extends BaseTypeHandler<EventType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, EventType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public EventType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return valueOf(value);
		}

		@Override
		public EventType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return valueOf(value);
		}

		@Override
		public EventType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return valueOf(value);
		}

	}

}
