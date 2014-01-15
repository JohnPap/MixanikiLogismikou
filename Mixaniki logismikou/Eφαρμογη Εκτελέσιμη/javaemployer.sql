/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50532
Source Host           : localhost:3306
Source Database       : javaemployer

Target Server Type    : MYSQL
Target Server Version : 50532
File Encoding         : 65001

Date: 2013-12-16 17:28:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for employees
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(100) DEFAULT NULL,
  `lastname` varchar(100) DEFAULT NULL,
  `tid` int(80) DEFAULT NULL,
  `salary` int(6) DEFAULT NULL,
  `afm` int(12) DEFAULT NULL,
  `dep` varchar(50) DEFAULT NULL,
  `hired` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES ('1', 'ΖΑΚ', 'ΓΑΛΙΦΙΑΝΑΚΗΣ', '123456', '1000', '123456789', 'IT', '2013-12-13 02:35:44');
INSERT INTO `employees` VALUES ('2', 'ΛΕΥΤΕΡΗΣ', 'ΠΑΠΑΔΟΠΟΥΛΟΣ', '654321', '1100', '987456321', 'HR', '2013-11-15 02:36:02');
INSERT INTO `employees` VALUES ('3', 'ΘΑΝΑΣΗΣ', 'ΠΑΠΑΝΑΣΤΑΣΙΟΥ', '147852', '500', '789456321', 'PR', '2013-12-16 02:36:09');
INSERT INTO `employees` VALUES ('4', 'ΛΟΥΚΑΣ', 'ΠΑΠΑΔΗΜΟΣ', '369852', '2000', '123654987', 'CEO', '2013-10-01 02:36:17');
INSERT INTO `employees` VALUES ('5', 'ΔΗΜΗΤΡΗΣ', 'ΔΙΑΜΑΝΤΙΔΗΣ', '789456', '100', '546987123', 'RD', '2013-07-01 02:36:31');
INSERT INTO `employees` VALUES ('6', 'ΓΙΩΡΓΟΣ', 'ΑΝΑΣΤΑΣΙΑΔΗΣ', '654123', '700', '459876321', 'DE', '2013-08-29 02:36:36');
INSERT INTO `employees` VALUES ('7', 'ΒΑΓΓΕΛΗΣ', 'ΚΟΝΤΟΣ', '587964', '650', '582741369', 'SE', '2009-01-15 02:36:47');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(100) DEFAULT NULL,
  `pass` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'admin', 'pass');
