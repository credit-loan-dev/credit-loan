package com.sixliu.workflow.constant;

import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author: MG01867
 * @date: 2018/9/28
 * @email: 359852326@qq.com
 * @version:
 * @describe 自动审批worker类型
 */
public enum WorkerType {

    /**
     * 本地class
     **/
    LOCAL_CLASS,

    /**
     * 远程url
     **/
    REMOTE_URL;

    private final static Set<String> names;

    static {
        names = new HashSet<>(WorkerType.values().length);
        for (WorkerType item : WorkerType.values()) {
            names.add(item.name());
        }
    }

    public static boolean validate(String value) {
        return names.contains(value);
    }

    @MappedTypes(value = WorkerType.class)
    @MappedJdbcTypes(value = {JdbcType.VARCHAR, JdbcType.CHAR})
    public static class WorkerTypeHandler extends BaseTypeHandler<WorkerType> {

        @Override
        public void setNonNullParameter(PreparedStatement ps, int i, WorkerType parameter, JdbcType jdbcType)
                throws SQLException {
            ps.setString(i, parameter.name());
        }

        @Override
        public WorkerType getNullableResult(ResultSet rs, String columnName) throws SQLException {
            String value = rs.getString(columnName);
            return WorkerType.valueOf(value);
        }

        @Override
        public WorkerType getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
            String value = rs.getString(columnIndex);
            return WorkerType.valueOf(value);
        }

        @Override
        public WorkerType getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
            String value = cs.getString(columnIndex);
            return WorkerType.valueOf(value);
        }

    }
}
