-- ----------------------------
--  Table structure for `post`
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `id` bigint(22) NOT NULL AUTO_INCREMENT,
  `theme` varchar(255) DEFAULT NULL,
  `creater_id` bigint(22) DEFAULT NULL,
  `creater_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
--  Records of `post`
-- ----------------------------
INSERT INTO `post` VALUES ('1', '帖子1', '1111111', '李想');
