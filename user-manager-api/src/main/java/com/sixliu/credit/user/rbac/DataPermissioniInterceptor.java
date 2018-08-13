package com.sixliu.credit.user.rbac;


import net.sf.jsqlparser.parser.CCJSqlParserUtil;
import net.sf.jsqlparser.statement.Statement;
import net.sf.jsqlparser.statement.select.PlainSelect;
import net.sf.jsqlparser.statement.select.Select;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlSource;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.util.CollectionUtils;

import java.util.Properties;

/**
 * 数据权限拦截器
 */
@Intercepts({
        @Signature(type = Executor.class, method = "query", args = { MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class })
})
public class DataPermissioniInterceptor implements Interceptor {

    public static Properties properties;


    @Override
    public Object intercept(Invocation invocation) throws Throwable {

        DataScope dataScope = DataScope.getDataScope();

        if(dataScope!=null && !CollectionUtils.isEmpty(dataScope.getPremissionConditions())) {
            MappedStatement mappedStatement = (MappedStatement) invocation.getArgs()[0];
            invocation.getArgs()[0] = buildNewMappedStatement(mappedStatement, dataScope);
        }

        return invocation.proceed();
    }

    private MappedStatement buildNewMappedStatement(MappedStatement mappedStatement, DataScope dataScope){

        MappedStatement.Builder builder = new MappedStatement.Builder(mappedStatement.getConfiguration(), mappedStatement.getId(), new SqlSource() {
            @Override
            public BoundSql getBoundSql(Object parameterObject) {
                try {
                    BoundSql boundSql=mappedStatement.getBoundSql(parameterObject);
                    String newSql = buildNewSql(boundSql.getSql(), dataScope);
                    BoundSql newBoundSql = new BoundSql(mappedStatement.getConfiguration(),newSql, boundSql.getParameterMappings(), boundSql.getParameterObject());
                    return newBoundSql;
                }finally {
                    dataScope.clear();
                }
            }
        } , mappedStatement.getSqlCommandType());

        builder.resource(mappedStatement.getResource());
        builder.fetchSize(mappedStatement.getFetchSize());
        builder.statementType(mappedStatement.getStatementType());
        builder.keyGenerator(mappedStatement.getKeyGenerator());
        builder.timeout(mappedStatement.getTimeout());
        builder.parameterMap(mappedStatement.getParameterMap());
        builder.resultSetType(mappedStatement.getResultSetType());
        builder.cache(mappedStatement.getCache());
        builder.flushCacheRequired(mappedStatement.isFlushCacheRequired());
        builder.useCache(mappedStatement.isUseCache());
        builder.resultMaps(mappedStatement.getResultMaps());
        builder.databaseId(mappedStatement.getDatabaseId());
        builder.resultSets(mappedStatement.getResultSets()!=null?join(mappedStatement.getResultSets(), ","):null);
        builder.keyColumn(mappedStatement.getKeyColumns()!=null?join(mappedStatement.getKeyColumns(), ","):null);
        builder.keyProperty(mappedStatement.getKeyProperties()!=null?join(mappedStatement.getKeyProperties(), ","):null);
        builder.lang(mappedStatement.getLang());
        builder.resultOrdered(mappedStatement.isResultOrdered());

        MappedStatement newMappedStatement=builder.build();
        return newMappedStatement;
    }

    private String buildNewSql(String sql, DataScope dataScope){
        Statement statement = null;
        try {
            statement = CCJSqlParserUtil.parse(sql);
            if(statement instanceof Select){
                Select selectStatement = (Select) statement;
                if (selectStatement.getSelectBody() instanceof PlainSelect) {
                    PlainSelect plainSelect = (PlainSelect) selectStatement.getSelectBody();
                    return JsqlpaserUtils.buildSqlByPermission(plainSelect, dataScope);
                } else {
                    //抛出异常
                    throw new RuntimeException("(UNION,INTERSECT,MINUS,EXCEPT,WITH)等函数或者方式都不支持自动添加条件,请关闭自动过滤条件自行添加过滤条件！");
                }
            }
            //抛出异常
            throw new RuntimeException("数据权限,只支持查询!");
        }catch(Exception e){
            throw new RuntimeException("TSQL语句异常! SQL=" + sql, e);
        }
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public static String join(Object[] array, String separator) {
        return array == null ? null : join(array, separator, 0, array.length);
    }

    public static String join(Object[] array, String separator, int startIndex, int endIndex) {
        if (array == null) {
            return null;
        } else {
            if (separator == null) {
                separator = "";
            }

            int noOfItems = endIndex - startIndex;
            if (noOfItems <= 0) {
                return "";
            } else {
                StringBuilder buf = new StringBuilder(noOfItems * 16);

                for(int i = startIndex; i < endIndex; ++i) {
                    if (i > startIndex) {
                        buf.append(separator);
                    }

                    if (array[i] != null) {
                        buf.append(array[i]);
                    }
                }

                return buf.toString();
            }
        }
    }

}
