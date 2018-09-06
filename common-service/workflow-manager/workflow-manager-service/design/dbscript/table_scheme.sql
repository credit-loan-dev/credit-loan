CREATE TABLE `workflow_job_model` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `name` varchar(20) NOT NULL COMMENT '流程作业模型名称',
  `create_role_id` varchar(20) NOT NULL COMMENT '创建该流程作业模型作业的角色',
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='流程作业模型表';

CREATE TABLE `workflow_task_model` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `name` varchar(20) NOT NULL COMMENT '流程作业模型名称',
  `job_model_id` varchar(36) NOT NULL COMMENT '流程作业模型id',
  `phase` int(11) NOT NULL COMMENT '流程阶段',
  `type` varchar(20) NOT NULL COMMENT '任务类型',
  `worker` varchar(100) NOT NULL COMMENT '任务工人,当类型为自动时，该字段表示java class.否则为处理角色',
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`),
  UNIQUE KEY `job_phase_UNIQUE` (`job_model_id`,`phase`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='流程任务模型表';


CREATE TABLE `workflow_job` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `name` varchar(20) NOT NULL COMMENT '流程作业名称',
  `model_id` varchar(36) NOT NULL COMMENT '流程作业模型id',
  `status` varchar(20) NOT NULL COMMENT '状态',
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8MB4 COMMENT='流程作业表';

CREATE TABLE `workflow_task` (
  `id` varchar(36) NOT NULL COMMENT '数据id:业务无关性',
  `name` varchar(20) NOT NULL COMMENT '流程作业模型名称',
  `job_id` varchar(36) NOT NULL COMMENT '流程作业模型id',
  `model_id` varchar(36) NOT NULL COMMENT '流程作业任务模型id',
  `phase` int(11) NOT NULL COMMENT '流程阶段',
  `type` varchar(20) NOT NULL COMMENT '任务类型',
  `worker` varchar(100) NOT NULL COMMENT '任务工人,当类型为自动时，该字段表示java class.否则为处理角色',
  `owner_user_id` varchar(20) NOT NULL COMMENT '任务处理用户',
  `status` varchar(20) NOT NULL COMMENT '任务状态',
  `inner_opinion` varchar(20) NOT NULL COMMENT '内部意见',
  `outer_opinion` varchar(20) NOT NULL COMMENT '外部意见',
  `remarks` varchar(100) DEFAULT NULL COMMENT '数据备注',
  `version` int(11) NOT NULL DEFAULT '0' COMMENT '数据版本',
  `update_user_id` varchar(36) NOT NULL COMMENT '数据更新用户id',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '数据更新日期id',
  `create_user_id` varchar(36) NOT NULL COMMENT '数据创建用户id',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '数据创建日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='流程任务表';
