package com.sixliu.credit.rbac;

import org.springframework.util.StringUtils;

import java.util.ArrayList;

public class DataScope {

    private static ThreadLocal<DataScope> dataScope = new ThreadLocal<>();

    private ArrayList<ConditionTuple> premissionConditions = new ArrayList();


    public static DataScope getDataScope() {
        if(dataScope.get()==null){
            dataScope.set(new DataScope());
        }
        return dataScope.get();
    }

    public void filter(DataType dataType, PremissionType premissionType){
        filter(null, dataType, premissionType, QueryType.JOIN);
    }

    public void filter(DataType dataType, PremissionType premissionType, QueryType queryType){
        filter(null, dataType, premissionType, queryType);
    }

    public void clear(){
        premissionConditions = null;
    }

    public void filter(String alias, DataType dataType, PremissionType premissionType, QueryType queryType){

        alias= StringUtils.hasText(alias)?alias+".":"";

        ConditionTuple conditionTuple = null;
        if(queryType== QueryType.EXISTS) {

            String formAlias = dataType.alias;

            String premiCondition = "(SELECT 1 FROM %s {alias} WHERE {alias}.ctrl_type='%s' AND %s in ({codes}) AND {alias}.ctrl_data=%s)";
            premiCondition = String.format(premiCondition, dataType.getValue(), alias+premissionType.getValue(), dataType.getCode(), alias+premissionType.getCode());
            premiCondition = premiCondition.replace("{alias}", formAlias);
            premiCondition = premiCondition.replace("{codes}", "'corpAdmin', 'dept'");

            conditionTuple = new ConditionTuple(dataType, premiCondition, queryType);

        }else if(queryType== QueryType.JOIN) {

            String formAlias = dataType.alias+"_"+premissionConditions.size();

            String premiFrom = " INNER JOIN %s {alias} on ({alias}.ctrl_type='%s' AND {alias}.ctrl_data=%s)";
            premiFrom = String.format(premiFrom, dataType.getValue(), premissionType.getValue(), alias+premissionType.getCode());
            premiFrom = premiFrom.replace("{alias}", formAlias);

            String premiCondition =  "{alias}.%s in ({codes})";
            premiCondition = String.format(premiCondition, dataType.getCode());
            premiCondition = premiCondition.replace("{alias}", formAlias);
            premiCondition = premiCondition.replace("{codes}", "'corpAdmin', 'dept'");

            conditionTuple = new ConditionTuple(dataType, premiFrom, premiCondition, queryType);
        }
        premissionConditions.add(conditionTuple);
    }

    public enum PremissionType{

        OFFICE("Office", "office_code"), COMPANY("Company", "company_code"), PRODUCT("Product", "product_code");

        private String value;
        private String code;

        PremissionType(String value, String code){
            this.value = value;
            this.code = code;
        }
        public String getValue() {
            return value;
        }
        public String getCode(){
            return code;
        }
    }

    public enum DataType{
        USER("sys_user_data_scope", "user_code", "suds"), ROLE("sys_role_data_scope", "role_code", "srds");

        private String value;
        private String code;
        private String alias;

        DataType(String value, String code, String alias){
            this.value = value;
            this.code = code;
            this.alias = alias;
        }
        public String getValue() {
            return value;
        }
        public String getCode() {
            return code;
        }
        public String getAlias(){
            return alias;
        }
    }

    public enum QueryType{
        EXISTS, JOIN;
    }

    public class ConditionTuple{

        public DataType dataType;
        public QueryType queryType;
        public String premiFrom;
        public String premiCondition;


        public ConditionTuple(DataType dataType, String premiCondition, QueryType queryType){
            this.dataType = dataType;
            this.premiCondition = premiCondition;
            this.queryType = queryType;
        }

        public ConditionTuple(DataType dataType, String premiFrom, String premiCondition, QueryType queryType){
            this.dataType = dataType;
            this.premiFrom = premiFrom;
            this.premiCondition = premiCondition;
            this.queryType = queryType;
        }

        public String toString(){
            return "(" + dataType + ", " + premiCondition + ")";
        }
    }

    public ArrayList<ConditionTuple> getPremissionConditions() {
        return premissionConditions;
    }

}
