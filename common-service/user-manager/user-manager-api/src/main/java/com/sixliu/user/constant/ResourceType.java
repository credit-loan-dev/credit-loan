package com.sixliu.user.constant;

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
 * @date:2018年10月31日
 * @email:359852326@qq.com
 * @version:
 * @describe 资源类型
 */
public enum ResourceType {

	/** 数据类型资源 **/
	DATA,
	/** 接口类型资源 **/
	FUNCTION,
	/** 菜单类型资源 **/
	MENU,
	/** 应用类型资源 **/
	APP;

	private final static Set<String> names;

	static {
		names = new HashSet<>(ResourceType.values().length);
		for (ResourceType item : ResourceType.values()) {
			names.add(item.name());
		}
	}

	public static boolean validate(String value) {
		return names.contains(value);
	}

	@MappedTypes(value = ResourceType.class)
	@MappedJdbcTypes(value = { JdbcType.VARCHAR, JdbcType.CHAR })
	public static class ResourceTypeHandler extends BaseTypeHandler<ResourceType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, ResourceType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public ResourceType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return ResourceType.valueOf(value);
		}

		@Override
		public ResourceType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return ResourceType.valueOf(value);
		}

		@Override
		public ResourceType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return ResourceType.valueOf(value);
		}

	}
}
