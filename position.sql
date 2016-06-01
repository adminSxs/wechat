/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : wechat

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2016-05-27 15:55:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `position`
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) DEFAULT NULL,
  `salary` varchar(20) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `nature` varchar(10) DEFAULT NULL,
  `experience` varchar(20) DEFAULT NULL,
  `education` varchar(5) DEFAULT NULL,
  `number` int(11) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `introduce` text,
  `culture` text,
  `scope` text,
  `worksRequire` text,
  `worksContent` text,
  `worksTime` text,
  `teamBuild` text,
  `promotion` text,
  `worksEnv` varchar(1000) DEFAULT NULL,
  `connect` text,
  `createTime` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of position
-- ----------------------------
