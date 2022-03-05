/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : mybatis_practice

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2022-03-05 18:46:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_dept
-- ----------------------------
DROP TABLE IF EXISTS `t_dept`;
CREATE TABLE `t_dept` (
  `did` int(11) NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`did`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_dept
-- ----------------------------
INSERT INTO `t_dept` VALUES ('1', 'A');
INSERT INTO `t_dept` VALUES ('2', 'B');
INSERT INTO `t_dept` VALUES ('3', 'C');

-- ----------------------------
-- Table structure for t_emp
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp` (
  `eid` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `did` int(11) DEFAULT NULL,
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_emp
-- ----------------------------
INSERT INTO `t_emp` VALUES ('1', '张三', '12', '男', '123@qq.com', '1');
INSERT INTO `t_emp` VALUES ('2', '李四', '31', '男', '123@qq.com', '2');
INSERT INTO `t_emp` VALUES ('3', '王五', '56', '女', '123@qq.com', '3');
INSERT INTO `t_emp` VALUES ('4', '赵六', '76', '男', '123@qq.com', '1');
INSERT INTO `t_emp` VALUES ('5', '田七', '23', '女', '123@qq.com', '2');
INSERT INTO `t_emp` VALUES ('6', 'a', null, null, null, null);
INSERT INTO `t_emp` VALUES ('7', 'b', null, null, null, null);
INSERT INTO `t_emp` VALUES ('8', 'c', null, null, null, null);
INSERT INTO `t_emp` VALUES ('9', 'd', null, null, null, null);
INSERT INTO `t_emp` VALUES ('13', 'h', null, null, null, null);
INSERT INTO `t_emp` VALUES ('14', 'i', null, '', '', null);
INSERT INTO `t_emp` VALUES ('15', 'j', null, '', '', null);
INSERT INTO `t_emp` VALUES ('16', 'k', null, '', '', null);
INSERT INTO `t_emp` VALUES ('17', '张三', null, '', '', null);
INSERT INTO `t_emp` VALUES ('18', '李四', null, '', '', null);
INSERT INTO `t_emp` VALUES ('19', '王五', null, '', '', null);
INSERT INTO `t_emp` VALUES ('20', '张三', null, '', '', null);
INSERT INTO `t_emp` VALUES ('21', '李四', null, '', '', null);
INSERT INTO `t_emp` VALUES ('22', '王五', null, '', '', null);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` char(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '王六', 'aaa', '23', '男', '123@qq.com');
INSERT INTO `t_user` VALUES ('3', 'aaa', 'aaa', '23', '男', '123@qq.com');
INSERT INTO `t_user` VALUES ('5', '5', '5', '5', '男', '5');
INSERT INTO `t_user` VALUES ('6', '6', '6', '6', '男', '6');
INSERT INTO `t_user` VALUES ('7', '7', '7', '7', '男', '7');
INSERT INTO `t_user` VALUES ('8', 'aaa', 'aaa', '8', '8', 'aaa');
INSERT INTO `t_user` VALUES ('9', 'aaa', 'aaa', '9', '男', 'aa');
INSERT INTO `t_user` VALUES ('11', '11', '11', '11', '11', '11');
INSERT INTO `t_user` VALUES ('12', '12', '12', '12', '12', '12');
INSERT INTO `t_user` VALUES ('13', '13', '13', '13', '13', '13');
INSERT INTO `t_user` VALUES ('15', '15', '15', '15', '15', '15');
INSERT INTO `t_user` VALUES ('16', 'lisi', '123', '23', '男', '123@qq.com');
