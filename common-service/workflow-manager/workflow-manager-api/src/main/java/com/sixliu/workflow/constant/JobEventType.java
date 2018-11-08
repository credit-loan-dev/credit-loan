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
 * @Description:流程job事件
 */
public enum JobEventType {

	/**流程创建 **/
	CREATED,

	/**通过结束**/
	PASS_ENDED,
	
	/**拒绝结束**/
	REJECT_ENDED,
	
	/**取消结束**/
	CANCEL_ENDED;
	
	private final static Set<String> names;

	static {
		names = new HashSet<>(JobEventType.values().length);
		for (JobEventType item : JobEventType.values()) {
			names.add(item.name());
		}
	}

	public static boolean validate(String value) {
		return names.contains(value);
	}

	@MappedTypes(value = JobEventType.class)
	@MappedJdbcTypes(value = { JdbcType.VARCHAR, JdbcType.CHAR })
	public static class TaskStatusHandler extends BaseTypeHandler<JobEventType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, JobEventType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public JobEventType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return valueOf(value);
		}

		@Override
		public JobEventType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return valueOf(value);
		}

		@Override
		public JobEventType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return valueOf(value);
		}

	}

}
