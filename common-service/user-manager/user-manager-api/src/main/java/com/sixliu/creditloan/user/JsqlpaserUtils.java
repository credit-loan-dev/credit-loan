package com.sixliu.creditloan.user;

import net.sf.jsqlparser.schema.Table;
import net.sf.jsqlparser.statement.select.Join;
import net.sf.jsqlparser.statement.select.PlainSelect;

import java.util.ArrayList;
import java.util.Iterator;

public class JsqlpaserUtils {

    @SuppressWarnings("static-access")
	public static String buildSqlByPermission(PlainSelect select, DataScope dataScope){

        ArrayList<DataScope.ConditionTuple> conditionTuples = dataScope.getPremissionConditions();

        StringBuilder sql = new StringBuilder();
        if (select.isUseBrackets()) {
            sql.append("(");
        }
        sql.append("SELECT ");

        if (select.getOracleHint() != null) {
            sql.append(select.getOracleHint()).append(" ");
        }

        if (select.getSkip() != null) {
            sql.append(select.getSkip()).append(" ");
        }

        if (select.getFirst() != null) {
            sql.append(select.getFirst()).append(" ");
        }

        if (select.getDistinct() != null) {
            sql.append(select.getDistinct()).append(" ");
        }
        if (select.getTop() != null) {
            sql.append(select.getTop()).append(" ");
        }
        if (select.getMySqlSqlCalcFoundRows()) {
            sql.append("SQL_CALC_FOUND_ROWS").append(" ");
        }
        sql.append(select.getStringList(select.getSelectItems()));

        if (select.getIntoTables() != null) {
            sql.append(" INTO ");
            for (Iterator<Table> iter = select.getIntoTables().iterator(); iter.hasNext();) {
                sql.append(iter.next().toString());
                if (iter.hasNext()) {
                    sql.append(", ");
                }
            }
        }

        if (select.getFromItem() != null) {
            sql.append(" FROM ").append(select.getFromItem());
            for(DataScope.ConditionTuple conditionTuple : conditionTuples){
                if(DataScope.QueryType.JOIN == conditionTuple.queryType){
                    sql.append(conditionTuple.premiFrom);
                }
            }
            if (select.getJoins() != null) {
                Iterator<Join> it = select.getJoins().iterator();
                while (it.hasNext()) {
                    Join join = it.next();
                    if (join.isSimple()) {
                        sql.append(", ").append(join);
                    } else {
                        sql.append(" ").append(join);
                    }
                }
            }
            if (select.getWhere() != null) {
                sql.append(" WHERE ").append(select.getWhere());
                for(DataScope.ConditionTuple conditionTuple : conditionTuples){
                    sql.append(" AND ");
                    sql.append(conditionTuple.premiCondition);
                }
            }else{
                for(DataScope.ConditionTuple conditionTuple : conditionTuples){
                    sql.append(conditionTuple.premiCondition);
                }
            }
            if (select.getOracleHierarchical() != null) {
                sql.append(select.getOracleHierarchical().toString());
            }
            sql.append(select.getFormatedList(select.getGroupByColumnReferences(), "GROUP BY"));
            if (select.getHaving() != null) {
                sql.append(" HAVING ").append(select.getHaving());
            }
            sql.append(select.orderByToString(select.isOracleSiblings(), select.getOrderByElements()));
            if (select.getLimit() != null) {
                sql.append(select.getLimit());
            }
            if (select.getOffset() != null) {
                sql.append(select.getOffset());
            }
            if (select.getFetch() != null) {
                sql.append(select.getFetch());
            }
            if (select.isForUpdate()) {
                sql.append(" FOR UPDATE");

                if (select.getForUpdateTable() != null) {
                    sql.append(" OF ").append(select.getForUpdateTable());
                }

                if (select.getWait() != null) {
                    // Wait's toString will do the formatting for us
                    sql.append(select.getWait());
                }
            }
        } else {
            //without from
            if (select.getWhere() != null) {
                sql.append(" WHERE ").append(select.getWhere());
            }
        }
        if (select.isUseBrackets()) {
            sql.append(")");
        }
        return sql.toString();

    }

    public static void main(String[] args) {

    }
}
