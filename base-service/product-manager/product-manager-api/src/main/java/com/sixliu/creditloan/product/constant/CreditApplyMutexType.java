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
 * @date:2018年8月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 授信申请互斥:VARCHAR(20)
 */
public enum CreditApplyMutexType {

	/** 无互斥 **/
	NONE("NONE"),

	/** 跟自己互斥 **/
	FOR_SELF("FOR_SELF"),

	/** 跟同类型产品互斥 **/
	FOR_TYPE("FOR_TYPE"),

	/** 跟所有产品互斥 **/
	FOR_ALL("FOR_ALL");

	private final String value;

	private CreditApplyMutexType(String value) {
		this.value = value;
	}

	public String value() {
		return value;
	}

	@MappedTypes(value=CreditApplyMutexType.class) 
	@MappedJdbcTypes(value= {JdbcType.VARCHAR})
	public static class CreditApplyMutexTypeHandler extends BaseTypeHandler<CreditApplyMutexType> {
		

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, CreditApplyMutexType parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.value());
		}

		@Override
		public CreditApplyMutexType getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return CreditApplyMutexType.valueOf(value);
		}

		@Override
		public CreditApplyMutexType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return CreditApplyMutexType.valueOf(value);
		}

		@Override
		public CreditApplyMutexType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return CreditApplyMutexType.valueOf(value);
		}

	}
}
