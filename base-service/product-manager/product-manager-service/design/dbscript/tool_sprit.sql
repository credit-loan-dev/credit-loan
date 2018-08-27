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

delete from zipkin_spans where name='post /product/get';
delete from zipkin_annotations where trace_id_high=0;
delete from zipkin_dependencies;

#zipkin_spans
select * from zipkin_spans;

#zipkin_annotations
select * from zipkin_annotations;

#zipkin_dependencies
select * from zipkin_dependencies;