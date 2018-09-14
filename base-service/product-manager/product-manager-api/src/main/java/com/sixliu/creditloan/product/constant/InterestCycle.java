package com.sixliu.creditloan.product.constant;

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
 * @author: sixliu
 * @email: 359852326@qq.com
 * @date: 2018年9月13日 下午9:26:25
 * @version V1.0
 * @Description:计息周期
 */
public enum InterestCycle {

	/** 按日计息 **/
	DAY,
	/** 按月计息 **/
	MONTH;

	private final static Set<String> names;

	static {
		names = new HashSet<>(InterestCycle.values().length);
		for (InterestCycle item : InterestCycle.values()) {
			names.add(item.name());
		}
	}

	public static boolean validate(String value) {
		return names.contains(value);
	}

	@MappedTypes(value = InterestCycle.class)
	@MappedJdbcTypes(value = { JdbcType.VARCHAR, JdbcType.CHAR })
	public static class InterestCycleHandler extends BaseTypeHandler<InterestCycle> {

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, InterestCycle parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setString(i, parameter.name());
		}

		@Override
		public InterestCycle getNullableResult(ResultSet rs, String columnName) throws SQLException {
			String value = rs.getString(columnName);
			return valueOf(value);
		}

		@Override
		public InterestCycle getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			String value = rs.getString(columnIndex);
			return valueOf(value);
		}

		@Override
		public InterestCycle getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			String value = cs.getString(columnIndex);
			return valueOf(value);
		}

	}

}
