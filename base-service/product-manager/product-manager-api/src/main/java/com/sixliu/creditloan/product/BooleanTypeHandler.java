//package com.sixliu.creditloan.product;
//
//import java.sql.CallableStatement;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//import org.apache.ibatis.type.BaseTypeHandler;
//import org.apache.ibatis.type.JdbcType;
//import org.apache.ibatis.type.MappedJdbcTypes;
//import org.apache.ibatis.type.MappedTypes;
//
///**
//*@author:MG01867
//*@date:2018年8月28日
//*@E-mail:359852326@qq.com
//*@version:
//*@describe //TODO
//*/
//@MappedTypes(value=Boolean.class) 
//@MappedJdbcTypes(value= {JdbcType.INTEGER})
//public class BooleanTypeHandler extends BaseTypeHandler<Boolean> {
//
//	@Override
//	public void setNonNullParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType)
//			throws SQLException {
//		ps.setInt(i,parameter?1:0);
//	}
//
//	@Override
//	public Boolean getNullableResult(ResultSet rs, String columnName) throws SQLException {
//		int value = rs.getInt(columnName);
//		return 1==value?true:false;
//	}
//
//	@Override
//	public Boolean getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
//		int value = rs.getInt(columnIndex);
//		return 1==value?true:false;
//	}
//
//	@Override
//	public Boolean getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
//		int value = cs.getInt(columnIndex);
//		return 1==value?true:false;
//	}
//
//}