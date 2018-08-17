package com.sixliu.flow;

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
 * @date:2018年7月6日
 * @E-mail:359852326@qq.com
 * @version:
 * @describe 流程作业任务状态
 */
public enum TaskStatus {

	/** 待认领 **/
	POOLING(0),
	
	/** 待处理 **/
	PENDING(1),
	
	/** 转移 **/
	TRANSFER(2),
	
	/** 通过 **/
	PASS(3),
	
	/** 拒绝 **/
	REJECT(4),
	
	/** 驳回 **/
	OVERRULE(5),
	
	/** 挂起 **/
	HANG_UP(6);
	
	private final int value;

	private TaskStatus(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}

	public static TaskStatus valueOf(int value) {
		if (0 == value) {
			return POOLING;
		} else if (1 == value) {
			return PENDING;
		} else if (2 == value) {
			return TRANSFER;
		} else if (3 == value) {
			return PASS;
		} else if (4 == value) {
			return REJECT;
		}else if (5 == value) {
			return OVERRULE;
		}else if (6 == value) {
			return HANG_UP;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@MappedTypes(value=TaskStatus.class) 
	@MappedJdbcTypes(value= {JdbcType.INTEGER})
	public static class TaskStatusHandler extends BaseTypeHandler<TaskStatus> {
		

		@Override
		public void setNonNullParameter(PreparedStatement ps, int i, TaskStatus parameter, JdbcType jdbcType)
				throws SQLException {
			ps.setInt(i, parameter.value());
		}

		@Override
		public TaskStatus getNullableResult(ResultSet rs, String columnName) throws SQLException {
			int value = rs.getInt(columnName);
			return valueOf(value);
		}

		@Override
		public TaskStatus getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
			int value = rs.getInt(columnIndex);
			return valueOf(value);
		}

		@Override
		public TaskStatus getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
			int value = cs.getInt(columnIndex);
			return valueOf(value);
		}

	}
}
