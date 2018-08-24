CREATE TABLE product_manager.`product_type_config` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `parent_id` varchar(36) DEFAULT NULL COMMENT '产品父类型数据id',
  `name` varchar(20) NOT NULL COMMENT '产品类型名称',
  `depth` int(11) NOT NULL COMMENT '产品类型深度',
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='产品类型表';

CREATE TABLE product_manager.`product_config` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `code` varchar(10) NOT NULL COMMENT '产品编码',
  `name` varchar(20) NOT NULL COMMENT '产品名称',
  `type_id` varchar(36) NOT NULL COMMENT '产品类型id',
  `priority` int(4) NOT NULL COMMENT '产品优先级',
  `effective` varchar(45) NOT NULL,
  `effective_date` datetime NOT NULL COMMENT '有效开始日期',
  `expire_date` varchar(45) NOT NULL,
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `code_name_UNIQUE` (`code`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='产品基础配置表';

CREATE TABLE product_manager.`product_config_change` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `original_id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `code` varchar(10) NOT NULL COMMENT '产品编码',
  `name` varchar(20) NOT NULL COMMENT '产品名称',
  `type_id` varchar(36) NOT NULL COMMENT '产品类型id',
  `priority` int(4) NOT NULL COMMENT '产品优先级',
  `effective` varchar(45) NOT NULL,
  `effective_date` datetime NOT NULL COMMENT '有效开始日期',
  `expire_date` varchar(45) NOT NULL,
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `code_name_UNIQUE` (`code`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='产品基础配置调整表';

CREATE TABLE product_manager.`product_config_snapshot` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `original_id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `code` varchar(10) NOT NULL COMMENT '产品编码',
  `name` varchar(20) NOT NULL COMMENT '产品名称',
  `type_id` varchar(36) NOT NULL COMMENT '产品类型id',
  `priority` int(4) NOT NULL COMMENT '产品优先级',
  `effective` varchar(45) NOT NULL,
  `effective_date` datetime NOT NULL COMMENT '有效开始日期',
  `expire_date` varchar(45) NOT NULL,
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `code_name_UNIQUE` (`code`,`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='产品基础配置快照表';

CREATE TABLE product_manager.`product_attribute_config` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `owner_id` varchar(36) NOT NULL COMMENT '产品id',
  `group` varchar(20) NOT NULL DEFAULT '1' COMMENT '扩展属性组',
  `index` int(11) NOT NULL COMMENT '扩展属性组索引',
  `name` varchar(20) NOT NULL COMMENT '产品扩展属性名称',
  `value` varchar(200) NOT NULL COMMENT '产品扩展属性值',
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='产品配置扩展属性表';

CREATE TABLE product_manager.`product_credit_config` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `product_id` varchar(36) NOT NULL COMMENT '产品id',
  `creditApply_mutex_type` int(11) NOT NULL DEFAULT '1' COMMENT '授信申请互斥类型',
  `use_blacklist_group_id` varchar(36) NOT NULL COMMENT '使用黑名单组id',
  `loop_creditlimit` int(1) NOT NULL COMMENT '是否循环额度',
  `increase_creditlimit` int(1) NOT NULL COMMENT '是否支持提高额度',
  `decrease_creditlimit` int(1) NOT NULL COMMENT '是否支持降低额度',
  `link_customer_base_creditlimit` int(1) NOT NULL COMMENT '是否关联客户基础额度',
  `credit_apply_max_months` int(11) NOT NULL COMMENT '授信申请最大持续月数',
  `credit_apply_flow_modle_id` varchar(36) NOT NULL COMMENT '授信申请流程模型',
  `credit_apply_reject_influence_days` int(11) NOT NULL COMMENT '授信申请拒绝影响天数',
  `min_creditlimit` int(11) NOT NULL COMMENT '最小授信额度',
  `max_creditlimit` int(11) NOT NULL COMMENT '最大授信额度',
  `creditlimit_effective_months` int(11) NOT NULL COMMENT '授信额度有效月数',
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `product_id_UNIQUE` (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='产品授信配置表';