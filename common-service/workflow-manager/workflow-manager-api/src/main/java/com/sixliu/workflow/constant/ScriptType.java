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
*@date:2018年11月8日
*@email:359852326@qq.com
*@version:
*@describe 脚本类型
*/
public enum ScriptType {

	/**java class**/
	JAVA_CLASS;
	
	private final static Set<String> names;

	static {
		names = new HashSet<>(ScriptType.values().length);
		for (ScriptType item : ScriptType.values()) {
			names.add(item.name());
		}
	}

	public static boolean validate(String value) {
		return names.contains(value);
	}

	@MappedTypes(value = ScriptType.class)
	@MappedJdbcTypes(value = { JdbcType.VARCHAR, JdbcType.CHAR })
	public static class Handler extends BaseTypeHandler<ScriptType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, ScriptType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public ScriptType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return valueOf(value);
		}

		@Override
		public ScriptType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return valueOf(value);
		}

		@Override
		public ScriptType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return valueOf(value);
		}
	}
}
