/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : ry-test

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 13/07/2021 18:50:34
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for good
-- ----------------------------
DROP TABLE IF EXISTS `good`;
CREATE TABLE `good`  (
  `good_id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `good_no` varchar(63) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '商品编号',
  `good_name` varchar(63) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '商品名称',
  `good_num` int(10) UNSIGNED ZEROFILL NOT NULL COMMENT '商品库存',
  `good_price` decimal(10, 2) UNSIGNED NULL DEFAULT NULL COMMENT '商品价格',
  `good_sell` int(10) UNSIGNED ZEROFILL NOT NULL COMMENT '商品销售量',
  `good_scrap` int(10) UNSIGNED ZEROFILL NULL DEFAULT NULL COMMENT '商品总报废量',
  `good_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '商品信息',
  PRIMARY KEY (`good_id`) USING BTREE,
  INDEX `idx_good_no`(`good_no`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of good
-- ----------------------------

-- ----------------------------
-- Table structure for member
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member`  (
  `member_id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `member_no` varchar(63) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '会员编号',
  `member_name` varchar(63) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '会员姓名',
  `member_num` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_bin NOT NULL COMMENT '会员联系方式',
  `member_score` int NOT NULL COMMENT '会员积分',
  `member_info` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '会员其他信息',
  PRIMARY KEY (`member_id`) USING BTREE,
  INDEX `idx_good_no`(`member_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of member
-- ----------------------------

-- ----------------------------
-- Table structure for purch
-- ----------------------------
DROP TABLE IF EXISTS `purch`;
CREATE TABLE `purch`  (
  `purch_id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `purch_goodno` varchar(63) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '进货商品编号',
  `purch_cost` decimal(10, 2) NOT NULL COMMENT '进货单价',
  `purch_num` int(10) UNSIGNED ZEROFILL NOT NULL COMMENT '进货数量',
  `purch_date` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '进货日期',
  PRIMARY KEY (`purch_id`) USING BTREE,
  INDEX `fk_purch_goodno`(`purch_goodno`) USING BTREE,
  CONSTRAINT `fk_purch_goodno` FOREIGN KEY (`purch_goodno`) REFERENCES `good` (`good_no`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of purch
-- ----------------------------

-- ----------------------------
-- Table structure for scrap
-- ----------------------------
DROP TABLE IF EXISTS `scrap`;
CREATE TABLE `scrap`  (
  `scrap_id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `scrap_goodno` varchar(63) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '报损商品编号',
  `scrap_num` int(10) UNSIGNED ZEROFILL NOT NULL COMMENT '报损数量',
  `scrap_date` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '报损日期',
  `scrap_reason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '报损原因',
  PRIMARY KEY (`scrap_id`) USING BTREE,
  INDEX `fk_scrap_goodno`(`scrap_goodno`) USING BTREE,
  CONSTRAINT `fk_scrap_goodno` FOREIGN KEY (`scrap_goodno`) REFERENCES `good` (`good_no`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of scrap
-- ----------------------------

-- ----------------------------
-- Table structure for sell
-- ----------------------------
DROP TABLE IF EXISTS `sell`;
CREATE TABLE `sell`  (
  `sell_id` int NOT NULL AUTO_INCREMENT COMMENT 'id',
  `sell_goodno` varchar(63) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '销售商品编号',
  `sell_price` decimal(10, 2) NOT NULL COMMENT '销售价格',
  `sell_num` int(10) UNSIGNED ZEROFILL NOT NULL COMMENT '销售数量',
  `sell_date` timestamp NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '销售日期',
  PRIMARY KEY (`sell_id`) USING BTREE,
  INDEX `fk_sell_goodno`(`sell_goodno`) USING BTREE,
  CONSTRAINT `fk_sell_goodno` FOREIGN KEY (`sell_goodno`) REFERENCES `good` (`good_no`) ON DELETE SET NULL ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sell
-- ----------------------------

-- ----------------------------
-- Triggers structure for table purch
-- ----------------------------
DROP TRIGGER IF EXISTS `trig_purch_insert`;
delimiter ;;
CREATE TRIGGER `trig_purch_insert` AFTER INSERT ON `purch` FOR EACH ROW IF NEW.`purch_goodno` IS NOT NULL THEN
		UPDATE `good` SET `good_num`=`good_num`+NEW.`purch_num` WHERE `good_no`=NEW.`purch_goodno`;
END IF
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table scrap
-- ----------------------------
DROP TRIGGER IF EXISTS `trig_scrap_insert`;
delimiter ;;
CREATE TRIGGER `trig_scrap_insert` AFTER INSERT ON `scrap` FOR EACH ROW IF NEW.`scrap_goodno` IS NOT NULL THEN
		UPDATE `good` SET `good_num`=`good_num`-NEW.`scrap_num` WHERE `good_no`=NEW.`scrap_goodno`;
END IF
;;
delimiter ;

-- ----------------------------
-- Triggers structure for table sell
-- ----------------------------
DROP TRIGGER IF EXISTS `trig_sell_insert`;
delimiter ;;
CREATE TRIGGER `trig_sell_insert` AFTER INSERT ON `sell` FOR EACH ROW IF NEW.`sell_goodno` IS NOT NULL THEN
		UPDATE `good` SET `good_num`=`good_num`-NEW.`sell_num` WHERE `good_no`=NEW.`sell_goodno`;
		UPDATE `good` SET `good_sell`=`good_sell`+1 WHERE `good_no`=NEW.`sell_goodno`;
END IF
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
