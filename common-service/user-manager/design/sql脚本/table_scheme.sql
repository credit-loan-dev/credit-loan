use user_manager;
CREATE TABLE `user` (
  `id` varchar(32) NOT NULL,
  `name` varchar(20) NOT NULL COMMENT '用户名',
  `nickname` varchar(20) DEFAULT NULL COMMENT '用户昵称',
  `password` varchar(20) NOT NULL COMMENT '用户密码',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  `update_user_id` varchar(32) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期',
  `create_user_id` varchar(32) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_uk1` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='用户表';


CREATE TABLE `role` (
  `id` varchar(32) NOT NULL,
  `name` varchar(20) NOT NULL COMMENT '角色名称',
  `depth` int(11) NOT NULL DEFAULT '0' COMMENT '层级深度',
  `parent_id` varchar(20) DEFAULT NULL COMMENT '父角色id',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  `update_user_id` varchar(32) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期',
  `create_user_id` varchar(32) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_uk1` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='角色表';


CREATE TABLE `resource` (
  `id` varchar(32) NOT NULL,
  `name` varchar(20) NOT NULL COMMENT '资源名称',
  `type` varchar(20) NOT NULL COMMENT '资源类型',
  `path` varchar(100) NOT NULL COMMENT '资源路径',
  `depth` int(11) NOT NULL DEFAULT '0' COMMENT '层级深度',
  `parent_id` varchar(20) DEFAULT NULL COMMENT '父资源id',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  `update_user_id` varchar(32) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期',
  `create_user_id` varchar(32) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `resource_uk1` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='资源表';

CREATE TABLE `role_resource` (
  `id` varchar(32) NOT NULL,
  `role_id` varchar(20) NOT NULL COMMENT '角色id',
  `resource_id` varchar(20) NOT NULL COMMENT '资源id',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  `update_user_id` varchar(32) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期',
  `create_user_id` varchar(32) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_resource_uk1` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='角色资源表';

CREATE TABLE `user_role` (
  `id` varchar(32) NOT NULL,
  `user_id` varchar(20) NOT NULL COMMENT '用户id',
  `role_id` varchar(20) DEFAULT NULL COMMENT '角色id',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `is_deleted` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除',
  `update_user_id` varchar(32) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期',
  `create_user_id` varchar(32) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_role_uk1` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='用户角色表';
