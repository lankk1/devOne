/*
Navicat MySQL Data Transfer

Source Server         : Linux-test
Source Server Version : 50636
Source Host           : 192.168.0.22:3306
Source Database       : dev_db

Target Server Type    : MYSQL
Target Server Version : 50636
File Encoding         : 65001

Date: 2017-10-11 20:52:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for core_user
-- ----------------------------
DROP TABLE IF EXISTS dev_db.core_user;
CREATE TABLE dev_db.core_user (
  user_id int(11) NOT NULL AUTO_INCREMENT COMMENT'主键',
  user_name varchar(50) DEFAULT '' COMMENT '用户姓名',
  user_sex int(4) DEFAULT 0 COMMENT '用户性别,0女,1男,2未知',
  user_married int(4) DEFAULT 0 COMMENT '用户婚否,0未婚,1已婚,2未知',
  user_birth date DEFAULT NULL COMMENT '用户生日',
  user_id_no varchar(30) DEFAULT '' COMMENT'身份证号码',
  user_phone varchar(30) DEFAULT '' COMMENT'联系电话',
  user_second_phone varchar(30) DEFAULT '' COMMENT'备用电话',
  user_urgent_phone varchar(30) DEFAULT '' COMMENT'紧急联系电话',
  user_password varchar(255) DEFAULT '' COMMENT '登录密码',
  user_create_time datetime DEFAULT NULL COMMENT '创建时间',
  user_update_time datetime DEFAULT NULL COMMENT '更新时间',
  user_comment varchar(255) DEFAULT '' COMMENT'备注信息',
  user_status int(4) DEFAULT 0 COMMENT'用户状态,0初始',
  user_deleted int(4) DEFAULT 0 COMMENT'用户是否被删除,0未删除',
  PRIMARY KEY (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户信息表';


-- ----------------------------
-- Table structure for core_user_family
-- ----------------------------
DROP TABLE IF EXISTS dev_db.core_user_family;
CREATE TABLE dev_db.core_user_family (
  family_id int(11) NOT NULL AUTO_INCREMENT COMMENT'主键',
  family_name varchar(50) DEFAULT '' COMMENT '家人姓名',
  family_relation int(4) DEFAULT 0 COMMENT'与用户的关系,0无任何关系,1本人,2夫妻',
  family_sex int(4) DEFAULT 0 COMMENT '家人性别,0女,1男,2未知',
  family_married int(4) DEFAULT 0 COMMENT '家人婚否,0未婚,1已婚,2未知',
  family_id_no varchar(30) DEFAULT '' COMMENT'身份证号码',
  family_phone varchar(30) DEFAULT '' COMMENT'联系电话',
  family_create_time datetime DEFAULT NULL COMMENT '创建时间',
  family_update_time datetime DEFAULT NULL COMMENT '更新时间',
  family_comment varchar(255) DEFAULT '' COMMENT'备注信息',
  family_status int(4) DEFAULT 0 COMMENT'家人状态,0初始',
  family_deleted int(4) DEFAULT 0 COMMENT'家人是否被删除,0未删除',
  PRIMARY KEY (family_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='家人信息表';
