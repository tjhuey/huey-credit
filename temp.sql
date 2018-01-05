/*
Navicat MySQL Data Transfer

Source Server         : ee
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : temp

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2017-11-30 13:53:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `province_id` int(11) DEFAULT NULL,
  `city_name` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '2', '123', 'erer');
INSERT INTO `city` VALUES ('2', '2', '2334', 'fasf ');
INSERT INTO `city` VALUES ('3', '33', 'ef ', 'df d');
INSERT INTO `city` VALUES ('4', '4', '1', '1');
INSERT INTO `city` VALUES ('5', '5', '1', '1');
INSERT INTO `city` VALUES ('6', '6', '1', '1');
INSERT INTO `city` VALUES ('7', '7', '1', '1');
INSERT INTO `city` VALUES ('8', '3', '1', '1');
INSERT INTO `city` VALUES ('9', '9', '1', '1');
INSERT INTO `city` VALUES ('10', '0', '1', '1');
INSERT INTO `city` VALUES ('11', '1', '00', '1');
INSERT INTO `city` VALUES ('12', '0', '1', '1');
INSERT INTO `city` VALUES ('13', '1', '00', '1');
INSERT INTO `city` VALUES ('14', '1', '0000', '1');
INSERT INTO `city` VALUES ('15', '1', '00', '0');
INSERT INTO `city` VALUES ('16', '0', '0', '0');
INSERT INTO `city` VALUES ('17', '0', '0', '0');
INSERT INTO `city` VALUES ('18', '1', null, '1');
INSERT INTO `city` VALUES ('19', '1', '1', '7');
INSERT INTO `city` VALUES ('20', '1', '788', '1');
INSERT INTO `city` VALUES ('21', '78', '1', '1');
INSERT INTO `city` VALUES ('22', '1', '7878', '1');
INSERT INTO `city` VALUES ('23', '1', '7878979', '1');
INSERT INTO `city` VALUES ('24', '1', '1', '1');
