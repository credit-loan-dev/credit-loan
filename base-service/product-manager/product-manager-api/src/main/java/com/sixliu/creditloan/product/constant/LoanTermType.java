package com.sixliu.creditloan.product.constant;

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
 * @date:2018年6月21日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 贷款期限类型:VARCHAR(20)
 */
public enum LoanTermType {

	/** 天 **/
	DAY("D"),
	/** 月 **/
	MONTH("M"),
	/** 季度 **/
	QUARTER("Q"),
	/** 年 **/
	YEAR("Y");

	private String value;

	LoanTermType(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

	public static boolean check(String value) {
		if (DAY.value.equals(value) || MONTH.value.equals(value) || QUARTER.value.equals(value) || YEAR.value.equals(value)) {
			return true;
		}
		return false;
	}

	@MappedTypes(value = LoanTermType.class)
	@MappedJdbcTypes(value = { JdbcType.INTEGER })
	public static class LoanTermTypeHandler extends BaseTypeHandler<LoanTermType> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, LoanTermType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.value());
		}

		@Override
		public LoanTermType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return LoanTermType.valueOf(value);
		}

		@Override
		public LoanTermType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return LoanTermType.valueOf(value);
		}

		@Override
		public LoanTermType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return LoanTermType.valueOf(value);
		}

	}
}
