package com.sixliu.creditloan.creditlimit;

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
	TAKE_CASH(0),
	/** 消费 **/
	CONSUME(1),
	/** 特殊 **/
	SPECIAL(2);

	private int value;

	CreditlimitType(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}

	public static CreditlimitType valueOf(int value) {
		if (0 == value) {
			return TAKE_CASH;
		} else if (1 == value) {
			return CONSUME;
		} else if (2 == value) {
			return SPECIAL;
		} else {
			throw new IllegalArgumentException();
		}
	}

	/**
	 * 检查贷款期限类型值是否合法
	 * 
	 * @param loanTermType
	 * @return
	 */
	public static boolean check(int creditlimitUseageType) {
		if (creditlimitUseageType < TAKE_CASH.value || creditlimitUseageType > SPECIAL.value) {
			return false;
		}
		return true;
	}

	@MappedTypes(value = CreditlimitType.class)
	@MappedJdbcTypes(value = { JdbcType.INTEGER })
	public static class CreditlimitTypeHandler extends BaseTypeHandler<CreditlimitType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, CreditlimitType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setInt(i, parameter.value());
		}

		@Override
		public CreditlimitType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			int value = rs.getInt(columnName);
			return CreditlimitType.valueOf(value);
		}

		@Override
		public CreditlimitType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			int value = rs.getInt(columnIndex);
			return CreditlimitType.valueOf(value);
		}

		@Override
		public CreditlimitType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			int value = cs.getInt(columnIndex);
			return CreditlimitType.valueOf(value);
		}

	}
}
