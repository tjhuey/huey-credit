/*
Navicat MySQL Data Transfer

Source Server         : ee
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : temp

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2018-01-05 15:09:43
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

-- ----------------------------
-- Table structure for time_line
-- ----------------------------
DROP TABLE IF EXISTS `time_line`;
CREATE TABLE `time_line` (
  `timeline_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `content` varchar(888) DEFAULT NULL COMMENT '内容',
  PRIMARY KEY (`timeline_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of time_line
-- ----------------------------
INSERT INTO `time_line` VALUES ('9', '2017-11-27 00:00:00', 'SpringBoot研究，简单追踪源码，大部分同Spring。\n核心spring.factories(auto) 以及main方法启动的方法栈');
INSERT INTO `time_line` VALUES ('10', '2017-11-28 10:19:02', 'LayUI 官方文档简单了解，并简单引入测试 <br>');
INSERT INTO `time_line` VALUES ('11', '2017-11-29 00:00:00', 'Springboot整合Mybatis和LayUI <br>\n用freemarker做数据绑定');
INSERT INTO `time_line` VALUES ('12', '2017-11-30 00:00:00', '工具类 复制与迁移 doing <br><br>\n代码生成 ok <br><br>\n分页后台封装，layui+pagehelper+mybatis 测试 ok');
INSERT INTO `time_line` VALUES ('13', '2017-12-01 00:00:00', '1.base 类引入 <br><br>\n2.layui表单测试 ok');
INSERT INTO `time_line` VALUES ('14', '2017-12-01 00:00:32', '测通accordicion-menu组件');
INSERT INTO `time_line` VALUES ('15', '2018-01-05 10:26:55', '周五啦 哈哈');
