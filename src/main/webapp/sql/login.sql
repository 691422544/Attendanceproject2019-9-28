/*
Navicat MySQL Data Transfer

Source Server         : dsz
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : login

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2019-08-29 17:30:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_test`
-- ----------------------------
DROP TABLE IF EXISTS `t_test`;
CREATE TABLE `t_test` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_test
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('admin0', '123');
INSERT INTO `t_user` VALUES ('admin1', '123');
INSERT INTO `t_user` VALUES ('admin10', '123');
INSERT INTO `t_user` VALUES ('admin11', '123');
INSERT INTO `t_user` VALUES ('admin12', '123');
INSERT INTO `t_user` VALUES ('admin13', '123');
INSERT INTO `t_user` VALUES ('admin14', '123');
INSERT INTO `t_user` VALUES ('admin15', '123');
INSERT INTO `t_user` VALUES ('admin16', 'xxxx');
INSERT INTO `t_user` VALUES ('admin17', '123');
INSERT INTO `t_user` VALUES ('admin18', '123');
INSERT INTO `t_user` VALUES ('admin19', '123');
INSERT INTO `t_user` VALUES ('admin2', '123');
INSERT INTO `t_user` VALUES ('admin21', '123');
INSERT INTO `t_user` VALUES ('admin22', '123');
INSERT INTO `t_user` VALUES ('admin23', '123');
INSERT INTO `t_user` VALUES ('admin24', '123');
INSERT INTO `t_user` VALUES ('admin25', '123');
INSERT INTO `t_user` VALUES ('admin26', '123');
INSERT INTO `t_user` VALUES ('admin27', '123');
INSERT INTO `t_user` VALUES ('admin28', '123');
INSERT INTO `t_user` VALUES ('admin29', '123');
INSERT INTO `t_user` VALUES ('admin3', '123');
INSERT INTO `t_user` VALUES ('admin4', '123');
INSERT INTO `t_user` VALUES ('admin5', '123');
INSERT INTO `t_user` VALUES ('admin6', '123');
INSERT INTO `t_user` VALUES ('admin7', '123');
INSERT INTO `t_user` VALUES ('admin8', '123');
