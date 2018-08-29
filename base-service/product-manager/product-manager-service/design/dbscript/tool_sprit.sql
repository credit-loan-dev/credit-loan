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


CREATE TABLE `product_loan_config` (
  `id` varchar(36) NOT NULL COMMENT '数据id',
  `product_id` varchar(36) NOT NULL COMMENT '产品id',
  `flow_job_modle_id` varchar(36) NOT NULL COMMENT '贷款申请流程模型id',
  `minSingleLoanAmount` decimal(24,2) NOT NULL COMMENT '最小单笔贷款金额',
  `maxSingleLoanAmount` decimal(24,2) NOT NULL COMMENT '最小单笔贷款金额',
  `loanTermType` varchar(20) NOT NULL COMMENT '贷款期限类型',
  `minSingleLoanTerm` int(11) NOT NULL DEFAULT '0' COMMENT '属性值',
  `maxSingleLoanTerm` int(11) NOT NULL DEFAULT '0' COMMENT '属性值',
  `remarks` varchar(100) DEFAULT NULL COMMENT '备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期',
  `create_user_id` varchar(36) NOT NULL COMMENT '创建数据用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='产品授信申请表单配置';