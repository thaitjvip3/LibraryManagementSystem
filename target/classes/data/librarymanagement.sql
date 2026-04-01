/*
 Navicat Premium Data Transfer

 Source Server         : DataBase
 Source Server Type    : MySQL
 Source Server Version : 100413
 Source Host           : localhost:3306
 Source Schema         : librarymanagement

 Target Server Type    : MySQL
 Target Server Version : 100413
 File Encoding         : 65001

 Date: 15/05/2021 14:46:59
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for books
-- ----------------------------
DROP TABLE IF EXISTS `books`;
CREATE TABLE `books`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_fag` int(11) NULL DEFAULT NULL,
  `author` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `code` int(11) NOT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `material_type` int(11) NOT NULL,
  `publish_date` date NOT NULL,
  `publish_place` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `publisher` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `status` int(11) NOT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for material_types
-- ----------------------------
DROP TABLE IF EXISTS `material_types`;
CREATE TABLE `material_types`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_fag` int(11) NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_number` int(11) NOT NULL,
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pat_blocked_tracking
-- ----------------------------
DROP TABLE IF EXISTS `pat_blocked_tracking`;
CREATE TABLE `pat_blocked_tracking`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `action_date` date NOT NULL,
  `action_type` int(11) NOT NULL,
  `active_fag` int(11) NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `patron_id` int(11) NOT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pat_patron
-- ----------------------------
DROP TABLE IF EXISTS `pat_patron`;
CREATE TABLE `pat_patron`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_fag` int(11) NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `creation_date` date NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `expiration_date` date NOT NULL,
  `fax` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `sex` int(11) NOT NULL,
  `status` int(11) NOT NULL,
  `type_id` int(11) NOT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  `updation_date` date NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of pat_patron
-- ----------------------------
INSERT INTO `pat_patron` VALUES (1, 0, 'binh dinh', '123', 'admin', '2021-05-15', '2021-05-15', NULL, 'tranvantinh117@gmail.com', '2021-05-15', NULL, NULL, 'van tinh', '', 0, 0, 12345, 'admin', '2021-05-15', '2021-05-15', 123);
INSERT INTO `pat_patron` VALUES (2, 0, 'binh dinh', '123', 'admin', '2021-05-15', '2021-05-15', NULL, 'tranvantinh117@gmail.com', '2021-05-15', NULL, NULL, 'van tinh', '', 0, 0, 12345, 'admin', '2021-05-15', '2021-05-15', 123);
INSERT INTO `pat_patron` VALUES (3, 0, 'binh dinh', '123', 'admin', '2021-05-15', '2021-05-15', NULL, 'tranvantinh117@gmail.com', '2021-05-15', NULL, NULL, 'van tinh', '', 0, 0, 12345, 'admin', '2021-05-15', '2021-05-15', 123);
INSERT INTO `pat_patron` VALUES (4, 0, 'binh dinh', '123', 'admin', '2021-05-15', '2021-05-15', NULL, 'tranvantinh117@gmail.com', '2021-05-15', NULL, NULL, 'van tinh', '', 1, 0, 12345, 'admin', '2021-05-15', '2021-05-15', 123);
INSERT INTO `pat_patron` VALUES (5, 0, 'binh dinh', '123', 'admin', '2021-05-15', '2021-05-15', NULL, 'tranvantinh117@gmail.com', '2021-05-15', NULL, NULL, 'van tinh', '', 1, 1, 12345, 'admin', '2021-05-15', '2021-05-15', 123);
INSERT INTO `pat_patron` VALUES (6, 0, 'binh dinh', '123', 'admin', '2021-05-15', '2021-05-15', NULL, 'tranvantinh117@gmail.com', '2021-05-15', NULL, NULL, 'van tinh', '', 2, 1, 12345, 'admin', '2021-05-15', '2021-05-15', 123);

-- ----------------------------
-- Table structure for pat_patron_types
-- ----------------------------
DROP TABLE IF EXISTS `pat_patron_types`;
CREATE TABLE `pat_patron_types`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_fag` int(11) NULL DEFAULT NULL,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_number` int(11) NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for pat_renew_card_logs
-- ----------------------------
DROP TABLE IF EXISTS `pat_renew_card_logs`;
CREATE TABLE `pat_renew_card_logs`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_fag` int(11) NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `new_due_date` date NOT NULL,
  `old_due_date` date NOT NULL,
  `patron_id` int(11) NOT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for port_author
-- ----------------------------
DROP TABLE IF EXISTS `port_author`;
CREATE TABLE `port_author`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_fag` int(11) NULL DEFAULT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_number` int(11) NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for port_category
-- ----------------------------
DROP TABLE IF EXISTS `port_category`;
CREATE TABLE `port_category`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_fag` int(11) NULL DEFAULT NULL,
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_number` int(11) NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for port_contact
-- ----------------------------
DROP TABLE IF EXISTS `port_contact`;
CREATE TABLE `port_contact`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_fag` int(11) NULL DEFAULT NULL,
  `body` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `full_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for port_news
-- ----------------------------
DROP TABLE IF EXISTS `port_news`;
CREATE TABLE `port_news`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_fag` int(11) NULL DEFAULT NULL,
  `author_id` int(11) NOT NULL,
  `body` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `category_id` int(11) NOT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `publish_date` date NOT NULL,
  `status` int(11) NOT NULL,
  `summany` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `total_view` int(11) NULL DEFAULT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for user_infos
-- ----------------------------
DROP TABLE IF EXISTS `user_infos`;
CREATE TABLE `user_infos`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `active_fag` int(11) NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `birthdate` date NOT NULL,
  `create_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` date NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `full_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `image` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `is_active` bit(1) NOT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `role` int(11) NOT NULL,
  `sex` int(11) NOT NULL,
  `update_by` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `update_date` date NULL DEFAULT NULL,
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
