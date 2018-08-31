package com.sixliu.creditloan.creditlimit.constant;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

/**
 * @author:MG01867
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 授信额度类型
 */
public enum CreditlimitType {

	/** 取现 **/
	TAKE_CASH,
	/** 消费 **/
	CONSUME,
	/** 特殊 **/
	SPECIAL;

	/**
	 * 检查贷款期限类型值是否合法
	 * 
	 * @param loanTermType
	 * @return
	 */
	public static boolean validate(String value) {
		if (TAKE_CASH.name().equals(value) || CONSUME.name().equals(value) || SPECIAL.name().equals(value)) {
			return true;
		}
		return false;
	}

	@MappedTypes(value = CreditlimitType.class)
	@MappedJdbcTypes(value = {JdbcType.VARCHAR,JdbcType.CHAR})
	public static class CreditlimitTypeHandler extends BaseTypeHandler<CreditlimitType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, CreditlimitType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public CreditlimitType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return CreditlimitType.valueOf(value);
		}

		@Override
		public CreditlimitType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return CreditlimitType.valueOf(value);
		}

		@Override
		public CreditlimitType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return CreditlimitType.valueOf(value);
		}

	}
}
