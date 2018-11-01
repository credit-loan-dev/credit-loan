use user_manager;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `name` varchar(20) NOT NULL COMMENT '用户名',
  `nickname` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `password` varchar(20) NOT NULL COMMENT '用户密码',
  `mobile_no` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `email` varchar(40) DEFAULT NULL COMMENT '邮箱地址',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  `update_user_id` varchar(32) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期',
  `create_user_id` varchar(32) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='用户表';
