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
*@author:MG01867
*@date:2018年7月6日
*@E-mail:359852326@qq.com
*@version:
*@describe 流程作业状态
*/
public enum JobStatus {

	/**开始**/
	STARTED,
	
	/**通过结束**/
	PASS_ENDED,
	
	/**拒绝结束**/
	REJECT_ENDED,
	
	/**取消结束**/
	CANCEL_ENDED;
	
	private final static Set<String> names;
	
	static {
		names=new HashSet<>(JobStatus.values().length);
		for(JobStatus item:JobStatus.values()) {
			names.add(item.name());
		}
	}
	
	public static boolean validate(String value) {
		return names.contains(value);
	}

	@MappedTypes(value = JobStatus.class)
	@MappedJdbcTypes(value = {JdbcType.VARCHAR,JdbcType.CHAR})
	public static class JobStatusHandler extends BaseTypeHandler<JobStatus> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, JobStatus parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public JobStatus getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return JobStatus.valueOf(value);
		}

		@Override
		public JobStatus getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return JobStatus.valueOf(value);
		}

		@Override
		public JobStatus getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return JobStatus.valueOf(value);
		}

	}
}
