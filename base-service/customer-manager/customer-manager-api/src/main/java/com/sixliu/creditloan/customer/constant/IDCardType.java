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
 * @date:2018年8月31日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 身份证件类型枚举
 */
public enum IDCardType {

	/** 中国身份证 **/
	CN_IDCARD,

	/** 中国护照 **/
	CN_PASSPORT,

	/** 香港身份证 **/
	HK_IDCARD,

	/** 香港护照 **/
	HK_PASSPORT;

	private static Set<String> cache = new HashSet<>();

	static {
		for (IDCardType item : IDCardType.values()) {
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

	@MappedTypes(value = IDCardType.class)
	@MappedJdbcTypes(value = { JdbcType.VARCHAR, JdbcType.CHAR })
	public static class CustomerTypeHandler extends BaseTypeHandler<IDCardType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, IDCardType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public IDCardType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return IDCardType.valueOf(value);
		}

		@Override
		public IDCardType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return IDCardType.valueOf(value);
		}

		@Override
		public IDCardType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return IDCardType.valueOf(value);
		}

	}
}
