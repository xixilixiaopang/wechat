--
--    Copyright 2010-2016 the original author or authors.
--
--    Licensed under the Apache License, Version 2.0 (the "License");
--    you may not use this file except in compliance with the License.
--    You may obtain a copy of the License at
--
--       http://www.apache.org/licenses/LICENSE-2.0
--
--    Unless required by applicable law or agreed to in writing, software
--    distributed under the License is distributed on an "AS IS" BASIS,
--    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
--    See the License for the specific language governing permissions and
--    limitations under the License.
--

-- // create_sys_user_table
-- Migration SQL that makes the change goes here.
CREATE TABLE `sys_user` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `openid` varchar(28) DEFAULT NULL COMMENT '小程序的用户openid',
  `nickname` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `avatarurl` varchar(100) DEFAULT NULL COMMENT '用户头像',
  `gender` tinyint(1) DEFAULT NULL COMMENT '性别  0-男、1-女',
  `country` varchar(100) DEFAULT NULL COMMENT '所在国家',
  `province` varchar(100) DEFAULT NULL COMMENT '省份',
  `city` varchar(100) DEFAULT NULL COMMENT '城市',
  `language` varchar(100) DEFAULT NULL COMMENT '语种',
  `ctime` datetime DEFAULT NULL COMMENT '创建/注册时间',
  `mobile` varchar(50) DEFAULT NULL COMMENT '手机号码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小程序用户表';



-- //@UNDO
-- SQL to undo the change goes here.

drop table sys_user;
