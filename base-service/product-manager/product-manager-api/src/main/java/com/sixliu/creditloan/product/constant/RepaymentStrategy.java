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
 * @describe 还款策略类型:VARCHAR(20)
 */
public enum RepaymentStrategy {

	/** 等本等息 **/
	ECEI,
	/** 等额本息 **/
	ACPI,
	/** 等额本金 **/
	AC;

	public static boolean validate(String value) {
		if (ECEI.name().equals(value) || ACPI.name().equals(value) || AC.name().equals(value)) {
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
			ps.setString(i, parameter.name());
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
