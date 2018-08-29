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
 * @date:2018年8月29日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 还款策略类型
 */
public enum RepaymentStrategy {

	/** 等本等息 **/
	ECEI("ECEI"),
	/** 等额本息 **/
	ACPI("ACPI"),
	/** 等额本金 **/
	AC("AC");

	private String value;

	RepaymentStrategy(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}
	
	public static boolean check(String value) {
		if (ECEI.value.equals(value) || ACPI.value.equals(value) || AC.value.equals(value)) {
			return true;
		}
		return false;
	}

	@MappedTypes(value = RepaymentStrategy.class)
	@MappedJdbcTypes(value = { JdbcType.VARCHAR })
	public static class LoanTermTypeHandler extends BaseTypeHandler<RepaymentStrategy> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, RepaymentStrategy parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.value());
		}

		@Override
		public RepaymentStrategy getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return RepaymentStrategy.valueOf(value);
		}

		@Override
		public RepaymentStrategy getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return RepaymentStrategy.valueOf(value);
		}

		@Override
		public RepaymentStrategy getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return RepaymentStrategy.valueOf(value);
		}
	}
}
