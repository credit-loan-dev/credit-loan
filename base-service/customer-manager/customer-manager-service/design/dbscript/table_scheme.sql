CREATE TABLE `customer` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `name` varchar(40) NOT NULL COMMENT '客户名称',
  `type` varchar(20) NOT NULL COMMENT '客户类型',
  `id_card_type` varchar(20) NOT NULL COMMENT '客户身份证件类型',
  `id_card_code` varchar(20) NOT NULL COMMENT '客户身份证件编码',
  `phone_number` varchar(20) NOT NULL COMMENT '客户手机号码',
  `creditlimit_id` varchar(36) NOT NULL COMMENT '客户基础额度id',
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`id_card_type`,`id_card_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='客户表';
