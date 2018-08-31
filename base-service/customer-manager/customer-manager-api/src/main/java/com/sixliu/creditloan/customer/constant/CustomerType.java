package com.sixliu.creditloan.customer.constant;

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
 * @date:2018年8月22日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 客户类型枚举
 */
public enum CustomerType {

	/** 个人类型客户 **/
	PERSONAL,

	/** 公司类型客户 **/
	COMPANY,

	/** 政府类型客户 **/
	GOV;

	private static Set<String> cache = new HashSet<>();

	static {
		for (CustomerType item : CustomerType.values()) {
			cache.add(item.name());
		}
	}

	public static boolean validate(String value) {
		if (cache.contains(value)) {
			return true;
		} else {
			return false;
		}
	}

	@MappedTypes(value = CustomerType.class)
	@MappedJdbcTypes(value = { JdbcType.VARCHAR, JdbcType.CHAR })
	public static class CustomerTypeHandler extends BaseTypeHandler<CustomerType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, CustomerType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public CustomerType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return CustomerType.valueOf(value);
		}

		@Override
		public CustomerType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return CustomerType.valueOf(value);
		}

		@Override
		public CustomerType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return CustomerType.valueOf(value);
		}

	}
}
