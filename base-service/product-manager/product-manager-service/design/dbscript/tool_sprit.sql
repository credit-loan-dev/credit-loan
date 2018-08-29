use data_access;
use product_manager;

#产品类型配置
select * from product_type_config;

#产品基础配置
select * from product_config;

#产品基础配置调整
select * from product_config_change;

#产品基础配置快照
select * from product_config_snapshot;

#产品扩展属性
select * from product_attribute_config;

#产品授信配置
select * from product_credit_config;

#产品授信申请表单配置
select * from credit_apply_form_config;

delete from zipkin_spans where name='post /product/get';
delete from zipkin_annotations where trace_id_high=0;
delete from zipkin_dependencies;

#zipkin_spans
select * from zipkin_spans;

#zipkin_annotations
select * from zipkin_annotations;

#zipkin_dependencies
select * from zipkin_dependencies;



CREATE TABLE `loan_price_config` (
  `id` varchar(36) NOT NULL COMMENT '数据id',
  `name` varchar(36) NOT NULL COMMENT '贷款定价名称',
  `product_id` varchar(36) NOT NULL COMMENT '产品id',
  `repayment_strategy` varchar(20) NOT NULL COMMENT '还款策略类型',
  `min_single_loan_amount` decimal(24,2) NOT NULL COMMENT '最小单笔贷款金额',
  `max_single_loan_amount` decimal(24,2) NOT NULL COMMENT '最大单笔贷款金额',
  `loan_term_type` varchar(20) NOT NULL COMMENT '贷款期限类型',
  `min_single_loan_term` int(11) NOT NULL COMMENT '最小单笔贷款期限',
  `max_single_loan_term` int(11) NOT NULL COMMENT '最大单笔贷款期限',
  `poundage_rate` decimal(3,2) NOT NULL COMMENT '手续费率',
  
  `enableLoanExtension` int(1) NOT NULL COMMENT '开启展期',
  `loanExtensionMaxCount` int(11) NOT NULL COMMENT '最大展期次数',
  `loanExtensionMaxTotalTerm` int(11) NOT NULL COMMENT '最大展期累计期数',
  `loanExtensionMaxTerm` int(11) NOT NULL COMMENT '最大展期期数',
  `loanExtensionInterestRate` decimal(3,2) NOT NULL COMMENT '展期利率',
  
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期',
  `create_user_id` varchar(36) NOT NULL COMMENT '创建数据用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品贷款配置';





