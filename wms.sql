/*
SQLyog Ultimate
MySQL - 5.7.24-log : Database - wms
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`wms` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_bin */;

USE `wms`;

/*Table structure for table `js_supplies` */

DROP TABLE IF EXISTS `js_supplies`;

CREATE TABLE `js_supplies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyCode` varchar(20) DEFAULT NULL COMMENT '商家编码',
  `money` double DEFAULT NULL COMMENT '总金额',
  `payStatus` int(1) DEFAULT NULL COMMENT '结算状态：0.待结算；其他：已结算',
  `buyTime` varchar(20) DEFAULT NULL COMMENT '耗材时间',
  `payTime` datetime DEFAULT NULL COMMENT '结算时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `js_supplies_sku` */

DROP TABLE IF EXISTS `js_supplies_sku`;

CREATE TABLE `js_supplies_sku` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyCode` varchar(20) DEFAULT NULL COMMENT '商家编码',
  `mailNo` varchar(20) DEFAULT NULL COMMENT '运单号',
  `suppliesId` varchar(6) DEFAULT NULL COMMENT '耗材编号',
  `suppliesName` varchar(250) DEFAULT NULL COMMENT '耗材名称',
  `price` double DEFAULT NULL COMMENT '单价',
  `number` int(11) DEFAULT NULL COMMENT '耗材数量',
  `money` double DEFAULT NULL COMMENT '金额',
  `buyTime` datetime DEFAULT NULL COMMENT '耗材时间',
  `type` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `log_r_inventory` */

DROP TABLE IF EXISTS `log_r_inventory`;

CREATE TABLE `log_r_inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parentId` int(10) DEFAULT NULL COMMENT '库存表id',
  `storage` varchar(30) DEFAULT NULL COMMENT '库位',
  `sum` int(10) DEFAULT NULL COMMENT '操作数量',
  `type` varchar(5) DEFAULT NULL COMMENT '操作状态 上架、冻结、移库',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `createTime` datetime DEFAULT NULL COMMENT '操作时间',
  `orderNo` varchar(30) DEFAULT NULL COMMENT '订单号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2391762 DEFAULT CHARSET=utf8;

/*Table structure for table `log_t_company` */

DROP TABLE IF EXISTS `log_t_company`;

CREATE TABLE `log_t_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operationId` int(11) DEFAULT NULL COMMENT '修改记录ID',
  `usersId` int(11) DEFAULT NULL COMMENT '修改人id',
  `usersName` varchar(200) DEFAULT NULL COMMENT '修改人',
  `createTime` datetime DEFAULT NULL COMMENT '修改时间',
  `content` varchar(250) DEFAULT NULL COMMENT '修改内容',
  PRIMARY KEY (`id`),
  KEY `operationid` (`operationId`),
  CONSTRAINT `operationid` FOREIGN KEY (`operationId`) REFERENCES `t_company` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `log_t_floor` */

DROP TABLE IF EXISTS `log_t_floor`;

CREATE TABLE `log_t_floor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operationId` int(11) DEFAULT NULL COMMENT '修改记录ID',
  `usersId` int(11) DEFAULT NULL COMMENT '修改人id',
  `usersName` varchar(200) DEFAULT NULL COMMENT '修改人',
  `createTime` datetime DEFAULT NULL COMMENT '修改时间',
  `content` varchar(250) DEFAULT NULL COMMENT '修改内容',
  PRIMARY KEY (`id`),
  KEY `operationid` (`operationId`),
  CONSTRAINT `log_t_floor_ibfk_1` FOREIGN KEY (`operationId`) REFERENCES `t_company` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `log_t_floor_storage` */

DROP TABLE IF EXISTS `log_t_floor_storage`;

CREATE TABLE `log_t_floor_storage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operationId` int(11) DEFAULT NULL COMMENT '修改记录ID',
  `usersId` int(11) DEFAULT NULL COMMENT '修改人id',
  `usersName` varchar(200) DEFAULT NULL COMMENT '修改人',
  `createTime` datetime DEFAULT NULL COMMENT '修改时间',
  `content` varchar(250) DEFAULT NULL COMMENT '修改内容',
  PRIMARY KEY (`id`),
  KEY `operationid` (`operationId`)
) ENGINE=InnoDB AUTO_INCREMENT=206 DEFAULT CHARSET=utf8;

/*Table structure for table `log_t_modular` */

DROP TABLE IF EXISTS `log_t_modular`;

CREATE TABLE `log_t_modular` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operationId` int(11) DEFAULT NULL COMMENT '修改记录ID',
  `usersId` int(11) DEFAULT NULL COMMENT '修改人id',
  `usersName` varchar(200) DEFAULT NULL COMMENT '修改人',
  `createTime` datetime DEFAULT NULL COMMENT '修改时间',
  `content` varchar(250) DEFAULT NULL COMMENT '修改内容',
  PRIMARY KEY (`id`),
  KEY `operationid` (`operationId`),
  CONSTRAINT `log_t_modular_ibfk_1` FOREIGN KEY (`operationId`) REFERENCES `t_company` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `log_t_modular_button` */

DROP TABLE IF EXISTS `log_t_modular_button`;

CREATE TABLE `log_t_modular_button` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operationId` int(11) DEFAULT NULL COMMENT '修改记录ID',
  `usersId` int(11) DEFAULT NULL COMMENT '修改人id',
  `usersName` varchar(200) DEFAULT NULL COMMENT '修改人',
  `createTime` datetime DEFAULT NULL COMMENT '修改时间',
  `content` varchar(250) DEFAULT NULL COMMENT '修改内容',
  PRIMARY KEY (`id`),
  KEY `operationid` (`operationId`),
  CONSTRAINT `log_t_modular_button_ibfk_1` FOREIGN KEY (`operationId`) REFERENCES `t_company` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `log_t_supplies` */

DROP TABLE IF EXISTS `log_t_supplies`;

CREATE TABLE `log_t_supplies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operationId` int(11) DEFAULT NULL COMMENT '修改记录ID',
  `usersId` int(11) DEFAULT NULL COMMENT '修改人id',
  `usersName` varchar(200) DEFAULT NULL COMMENT '修改人',
  `createTime` datetime DEFAULT NULL COMMENT '修改时间',
  `content` varchar(250) DEFAULT NULL COMMENT '修改内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `log_t_users` */

DROP TABLE IF EXISTS `log_t_users`;

CREATE TABLE `log_t_users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operationId` int(11) DEFAULT NULL COMMENT '修改记录ID',
  `usersId` int(11) DEFAULT NULL COMMENT '修改人id',
  `usersName` varchar(200) DEFAULT NULL COMMENT '修改人',
  `createTime` datetime DEFAULT NULL COMMENT '修改时间',
  `content` varchar(250) DEFAULT NULL COMMENT '修改内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Table structure for table `log_use_supplies` */

DROP TABLE IF EXISTS `log_use_supplies`;

CREATE TABLE `log_use_supplies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parantId` int(11) DEFAULT NULL COMMENT '主表id',
  `suppliesId` varchar(6) DEFAULT NULL COMMENT '耗材编号',
  `suppliesName` varchar(250) DEFAULT NULL COMMENT '耗材名称',
  `number` varchar(20) DEFAULT NULL COMMENT '操作数量',
  `orderNumber` varchar(60) DEFAULT NULL COMMENT '订单号',
  `createTime` datetime DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `r_godownentry` */

DROP TABLE IF EXISTS `r_godownentry`;

CREATE TABLE `r_godownentry` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `godownDh` varchar(20) DEFAULT NULL COMMENT '入库单号',
  `deliveryDh` varchar(20) DEFAULT NULL COMMENT '送货单号',
  `companyCode` varchar(10) DEFAULT NULL COMMENT '商家编码',
  `companyName` varchar(100) DEFAULT NULL COMMENT '商家名称',
  `cases` int(10) DEFAULT NULL COMMENT '总箱数',
  `num` int(10) DEFAULT NULL COMMENT '总数',
  `arrivalTime` datetime DEFAULT NULL COMMENT '到货时间',
  `createTime` datetime DEFAULT NULL COMMENT '新增时间',
  `name` varchar(50) DEFAULT NULL COMMENT '操作人',
  `receiptName` varchar(50) DEFAULT NULL COMMENT '收货人',
  `receiptTime` datetime DEFAULT NULL COMMENT '收货时间',
  `type` varchar(2) DEFAULT NULL COMMENT '状态 0:待收货。1：已收货',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=834 DEFAULT CHARSET=utf8;

/*Table structure for table `r_godownentry_sku` */

DROP TABLE IF EXISTS `r_godownentry_sku`;

CREATE TABLE `r_godownentry_sku` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `godownDh` varchar(20) DEFAULT NULL COMMENT '入库单号',
  `companyCode` varchar(10) DEFAULT NULL COMMENT '商家编码',
  `itemCode` varchar(40) DEFAULT NULL COMMENT '商品条码',
  `sku` varchar(30) DEFAULT NULL COMMENT '料号',
  `sum` int(10) DEFAULT NULL COMMENT '数量',
  `betterUseData` date DEFAULT NULL COMMENT '保质期至',
  `itemName` varchar(300) DEFAULT NULL COMMENT '商品名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33156 DEFAULT CHARSET=utf8;

/*Table structure for table `r_inventory` */

DROP TABLE IF EXISTS `r_inventory`;

CREATE TABLE `r_inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyCode` varchar(10) DEFAULT NULL COMMENT '商家编码',
  `itemName` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `itemCode` varchar(50) DEFAULT NULL COMMENT '商品条码',
  `storage` varchar(30) DEFAULT NULL COMMENT '库位',
  `sum` int(10) DEFAULT NULL COMMENT '首次上架数量',
  `inventory` int(10) DEFAULT NULL COMMENT '库存数',
  `InventoryOccupy` int(10) DEFAULT NULL COMMENT '占用库存',
  `InventoryFrozen` int(10) DEFAULT NULL COMMENT '冻结库存',
  `type` varchar(2) DEFAULT NULL COMMENT '0：正常库存 1：历史库存',
  `betterUseData` date DEFAULT NULL COMMENT '保质期至',
  `omwtype` int(1) DEFAULT NULL COMMENT '是否已推送到oms',
  `itemSku` varchar(30) DEFAULT NULL COMMENT 'Sku',
  `sort` int(1) DEFAULT NULL COMMENT '0储存1捡货',
  `defective` int(10) DEFAULT NULL COMMENT '残次品',
  `shift` int(10) DEFAULT NULL COMMENT '区间转移',
  `isPushDefects` int(1) DEFAULT NULL COMMENT '是否回推残次',
  `createTime` datetime DEFAULT '0000-00-00 00:00:00' COMMENT '创建时间',
  PRIMARY KEY (`id`),
  KEY `type` (`type`),
  KEY `sror` (`storage`)
) ENGINE=InnoDB AUTO_INCREMENT=37014 DEFAULT CHARSET=utf8;

/*Table structure for table `r_plangodownentry` */

DROP TABLE IF EXISTS `r_plangodownentry`;

CREATE TABLE `r_plangodownentry` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `godownDh` varchar(20) DEFAULT NULL COMMENT '入库单号',
  `deliveryDh` varchar(20) DEFAULT NULL COMMENT '送货单号',
  `companyCode` varchar(10) DEFAULT NULL COMMENT '商家编码',
  `companyName` varchar(100) DEFAULT NULL COMMENT '商家名称',
  `cases` int(10) DEFAULT NULL COMMENT '总箱数',
  `num` int(10) DEFAULT NULL COMMENT '总数',
  `arrivalTime` datetime DEFAULT NULL COMMENT '到货时间',
  `createTime` datetime DEFAULT NULL COMMENT '新增时间',
  `name` varchar(50) DEFAULT NULL COMMENT '操作人',
  `receiptName` varchar(50) DEFAULT NULL COMMENT '收货人',
  `receiptTime` datetime DEFAULT NULL COMMENT '收货时间',
  `type` varchar(2) DEFAULT NULL COMMENT '状态 0:未入库。1：已入库',
  `returnType` varchar(2) DEFAULT NULL COMMENT '状态 0:返回。1:未返回',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `r_plangodownentry_sku` */

DROP TABLE IF EXISTS `r_plangodownentry_sku`;

CREATE TABLE `r_plangodownentry_sku` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `godownDh` varchar(50) DEFAULT NULL COMMENT '入库单号',
  `companyCode` varchar(50) DEFAULT NULL COMMENT '商家编码',
  `itemCode` varchar(50) DEFAULT NULL COMMENT '商品条码',
  `sku` varchar(50) DEFAULT NULL COMMENT '料号',
  `sum` int(10) DEFAULT NULL COMMENT '数量',
  `betterUseData` date DEFAULT NULL COMMENT '保质期至',
  `itemName` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `trueSum` int(10) DEFAULT NULL COMMENT '实际到货',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `r_shelves` */

DROP TABLE IF EXISTS `r_shelves`;

CREATE TABLE `r_shelves` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `godownDh` varchar(20) DEFAULT NULL COMMENT '入库单号',
  `companyCode` varchar(10) DEFAULT NULL COMMENT '商家编码',
  `itemCode` varchar(50) DEFAULT NULL COMMENT '商品条码',
  `sku` varchar(30) DEFAULT NULL COMMENT '料号',
  `sum` int(10) DEFAULT NULL COMMENT '数量',
  `betterUseData` date DEFAULT NULL COMMENT '保质期至',
  `receiptName` varchar(50) DEFAULT NULL COMMENT '上架库位',
  `shelveDate` datetime DEFAULT NULL COMMENT '上架时间',
  `name` varchar(50) DEFAULT NULL COMMENT '上架人',
  `itemName` varchar(300) DEFAULT NULL COMMENT '商品名称',
  `type` int(1) DEFAULT NULL COMMENT '0为未上架1为已上架',
  `toStorage` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29841 DEFAULT CHARSET=utf8;

/*Table structure for table `t_check` */

DROP TABLE IF EXISTS `t_check`;

CREATE TABLE `t_check` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `companycode` varchar(20) DEFAULT NULL COMMENT '商家编码',
  `itemname` varchar(200) DEFAULT NULL,
  `itemcode` varchar(52) DEFAULT NULL COMMENT '商品条码',
  `itemsku` varchar(20) DEFAULT NULL,
  `storage` varchar(20) DEFAULT NULL COMMENT '库位',
  `tureinventory` varchar(10) DEFAULT NULL COMMENT '盘点后库存',
  `inventory` varchar(10) DEFAULT NULL COMMENT '原因库存',
  `isdelete` int(1) DEFAULT NULL COMMENT '1已删除',
  `code` varchar(30) DEFAULT NULL COMMENT '盘点标记',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `t_company` */

DROP TABLE IF EXISTS `t_company`;

CREATE TABLE `t_company` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyName` varchar(200) DEFAULT NULL COMMENT '商家名称',
  `companyCode` varchar(10) NOT NULL COMMENT '商家编码',
  `sendName` varchar(200) DEFAULT NULL COMMENT '寄件人',
  `sendPhone` varchar(50) DEFAULT NULL COMMENT '寄件人电话',
  `sendAddress` varchar(250) DEFAULT NULL COMMENT '寄件人地址',
  `createTime` datetime DEFAULT NULL COMMENT '入驻日期',
  `isDelete` int(1) DEFAULT '0' COMMENT '是否删除1为已删，0为未删',
  `delivercompany` varchar(50) DEFAULT NULL COMMENT '发货商家',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=99 DEFAULT CHARSET=utf8;

/*Table structure for table `t_dshk` */

DROP TABLE IF EXISTS `t_dshk`;

CREATE TABLE `t_dshk` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyCode` varchar(20) DEFAULT NULL COMMENT '商家编码',
  `orderNo` varchar(30) DEFAULT NULL COMMENT '订单号',
  `worth` varchar(20) DEFAULT NULL COMMENT '金额',
  `sendName` varchar(50) DEFAULT NULL COMMENT '发件人',
  `sendTel` varchar(20) DEFAULT NULL COMMENT '电话',
  `sendAddress` varchar(255) DEFAULT NULL COMMENT '地址',
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `t_experss_price` */

DROP TABLE IF EXISTS `t_experss_price`;

CREATE TABLE `t_experss_price` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `expressno` varchar(5) DEFAULT NULL COMMENT '快递ID',
  `bourn` varchar(10) DEFAULT NULL COMMENT '收件省',
  `initial` varchar(10) DEFAULT NULL COMMENT '发件省',
  `maxweight` varchar(10) DEFAULT NULL COMMENT '大于3公斤',
  `minweight` varchar(10) DEFAULT NULL COMMENT '小于3公斤',
  `maxnext` varchar(10) DEFAULT NULL COMMENT '大于3公斤续费',
  `minnext` varchar(10) DEFAULT NULL COMMENT '小于3公斤续费',
  `aging` varchar(10) DEFAULT NULL COMMENT '时效',
  `istax` varchar(10) DEFAULT NULL COMMENT '是否含税',
  `type` int(1) DEFAULT NULL COMMENT '运输类型',
  `bournBy` varchar(10) DEFAULT NULL COMMENT '备用省',
  PRIMARY KEY (`id`),
  KEY `expressID` (`expressno`)
) ENGINE=InnoDB AUTO_INCREMENT=125 DEFAULT CHARSET=utf8;

/*Table structure for table `t_experss_put` */

DROP TABLE IF EXISTS `t_experss_put`;

CREATE TABLE `t_experss_put` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `expressno` varchar(5) DEFAULT NULL COMMENT '快递ID',
  `bourn` varchar(10) DEFAULT NULL COMMENT '收件省',
  `initial` varchar(10) DEFAULT NULL COMMENT '发件省',
  `maxweight` varchar(10) DEFAULT NULL COMMENT '大于3公斤',
  `minweight` varchar(10) DEFAULT NULL COMMENT '小于3公斤',
  `maxnext` varchar(10) DEFAULT NULL COMMENT '大于3公斤续费',
  `minnext` varchar(10) DEFAULT NULL COMMENT '小于3公斤续费',
  `aging` varchar(10) DEFAULT NULL COMMENT '时效',
  `istax` varchar(10) DEFAULT NULL COMMENT '是否含税',
  `type` int(1) DEFAULT NULL COMMENT '运输类型',
  `bournBy` varchar(255) DEFAULT NULL COMMENT '备用省',
  PRIMARY KEY (`id`),
  KEY `expressID` (`expressno`)
) ENGINE=InnoDB AUTO_INCREMENT=156 DEFAULT CHARSET=utf8;

/*Table structure for table `t_express` */

DROP TABLE IF EXISTS `t_express`;

CREATE TABLE `t_express` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `express` varchar(3) DEFAULT NULL COMMENT '快递编号',
  `expressName` varchar(20) DEFAULT NULL COMMENT '快递名称',
  `isUse` varchar(1) DEFAULT NULL COMMENT '1：是，0：否',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Table structure for table `t_floor` */

DROP TABLE IF EXISTS `t_floor`;

CREATE TABLE `t_floor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `floorNumber` varchar(3) DEFAULT NULL COMMENT '楼层编码',
  `floorName` varchar(50) DEFAULT NULL COMMENT '楼层名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Table structure for table `t_floor_storage` */

DROP TABLE IF EXISTS `t_floor_storage`;

CREATE TABLE `t_floor_storage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `floorNumber` varchar(3) DEFAULT NULL,
  `storage` varchar(30) DEFAULT NULL COMMENT '库位',
  `createTime` datetime DEFAULT NULL COMMENT '新增时间',
  `type` varchar(1) DEFAULT NULL COMMENT '库位状态:0空闲：1：占用',
  `sprt` int(1) DEFAULT NULL COMMENT '0储存1捡货',
  PRIMARY KEY (`id`),
  KEY `type` (`type`),
  KEY `storge` (`storage`)
) ENGINE=InnoDB AUTO_INCREMENT=5234 DEFAULT CHARSET=utf8;

/*Table structure for table `t_item` */

DROP TABLE IF EXISTS `t_item`;

CREATE TABLE `t_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyCode` varchar(10) DEFAULT NULL COMMENT '商家编码',
  `companyName` varchar(200) DEFAULT NULL COMMENT '商家名称',
  `itemName` varchar(200) DEFAULT NULL COMMENT '商品名称',
  `itemCode` varchar(40) DEFAULT NULL COMMENT '商品条码',
  `specifications` varchar(30) DEFAULT NULL COMMENT '商品规格',
  `unit` varchar(10) DEFAULT NULL COMMENT '单位',
  `sku` varchar(20) DEFAULT NULL COMMENT '料号',
  `weight` varchar(10) DEFAULT NULL COMMENT '重量',
  `createTime` datetime DEFAULT NULL COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31181 DEFAULT CHARSET=utf8;

/*Table structure for table `t_kcjg` */

DROP TABLE IF EXISTS `t_kcjg`;

CREATE TABLE `t_kcjg` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) DEFAULT NULL COMMENT '名字',
  `bm` varchar(20) CHARACTER SET latin1 DEFAULT NULL COMMENT '编码',
  `sum` int(5) DEFAULT NULL COMMENT '数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

/*Table structure for table `t_modular` */

DROP TABLE IF EXISTS `t_modular`;

CREATE TABLE `t_modular` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modularId` varchar(50) DEFAULT NULL COMMENT '模块ID',
  `modularName` varchar(200) DEFAULT NULL COMMENT '模块名称',
  `createTime` datetime DEFAULT NULL COMMENT '新增日期',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;

/*Table structure for table `t_modular_button` */

DROP TABLE IF EXISTS `t_modular_button`;

CREATE TABLE `t_modular_button` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modularId` varchar(50) DEFAULT NULL COMMENT '模块ID',
  `buttonId` varchar(20) DEFAULT NULL COMMENT '按钮id',
  `buttonName` varchar(200) DEFAULT NULL COMMENT '按钮名称',
  `createTime` datetime DEFAULT NULL COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order` */

DROP TABLE IF EXISTS `t_order`;

CREATE TABLE `t_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderNo` varchar(50) DEFAULT NULL COMMENT '订单号',
  `mailNo` varchar(20) DEFAULT NULL COMMENT '运单号',
  `companyCode` varchar(20) DEFAULT NULL COMMENT '商家编码',
  `receiveMan` varchar(60) DEFAULT NULL COMMENT '收件人姓名',
  `receiveManPhone` varchar(50) DEFAULT NULL COMMENT '收件人电话',
  `receiveManAddress` varchar(200) DEFAULT NULL COMMENT '收件人地址',
  `receiveProvince` varchar(20) DEFAULT NULL COMMENT '收件人省',
  `receiveCity` varchar(20) DEFAULT NULL COMMENT '收件人市',
  `receiveCounty` varchar(20) DEFAULT NULL COMMENT '收件人区县',
  `sendName` varchar(20) DEFAULT NULL COMMENT '发件人姓名',
  `sendTel` varchar(20) DEFAULT NULL COMMENT '发件人电话',
  `sendAddress` varchar(200) DEFAULT NULL COMMENT '发件人地址',
  `itemCount` int(11) DEFAULT NULL COMMENT '商品数量',
  `expressCode` varchar(10) DEFAULT NULL COMMENT '快递编码',
  `orderStatus` int(1) DEFAULT NULL COMMENT '订单状态',
  `orderStep` int(1) DEFAULT NULL COMMENT '订单步骤',
  `batchNo` varchar(20) DEFAULT NULL COMMENT '波次号',
  `weight` varchar(20) DEFAULT NULL COMMENT '总重量(g)',
  `weightTime` datetime DEFAULT NULL COMMENT '称重时间',
  `weightUserId` int(11) DEFAULT NULL COMMENT '称重操作员',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `isDeleted` int(1) DEFAULT NULL COMMENT '是否删除',
  `itemName` varchar(255) DEFAULT NULL COMMENT '商品名称',
  `signStatus` int(1) unsigned zerofill DEFAULT '0' COMMENT '签收状态 0 待签收，1已签收',
  `signDate` datetime DEFAULT NULL COMMENT '签收时间',
  `signPrescription` varchar(10) DEFAULT NULL COMMENT '签收时效',
  `logisticsTrack` varchar(255) DEFAULT NULL COMMENT '物流轨迹',
  `markDestination` varchar(255) DEFAULT NULL,
  `billProvideSiteName` varchar(255) DEFAULT NULL,
  `billProvideSiteCode` varchar(50) DEFAULT NULL,
  `isclosing` int(1) DEFAULT NULL COMMENT '是否结算',
  `shipping` int(1) DEFAULT NULL COMMENT '1',
  `duihao` varchar(20) DEFAULT NULL,
  `fuheDate` datetime DEFAULT NULL COMMENT '复合时间',
  PRIMARY KEY (`id`),
  KEY `I_T_ORDER_ORDERSTEP` (`orderStep`) USING BTREE,
  KEY `I_T_ORDER_ORDERNO` (`orderNo`) USING BTREE,
  KEY `I_T_ORDER_BATCHNO` (`batchNo`) USING BTREE,
  KEY `I_T_ORDER_MAILNO` (`mailNo`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_batch` */

DROP TABLE IF EXISTS `t_order_batch`;

CREATE TABLE `t_order_batch` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `batchNo` varchar(20) DEFAULT NULL,
  `isPrint` int(1) DEFAULT NULL,
  `isPick` int(1) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `isDeleted` int(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18544 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_batch_pick_list` */

DROP TABLE IF EXISTS `t_order_batch_pick_list`;

CREATE TABLE `t_order_batch_pick_list` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderNo` varchar(50) DEFAULT NULL,
  `mailNo` varchar(50) DEFAULT NULL,
  `batchNo` varchar(50) DEFAULT NULL,
  `itemCode` varchar(50) DEFAULT NULL,
  `itemName` varchar(200) DEFAULT NULL,
  `pickCount` int(11) DEFAULT NULL,
  `pickStorageLocation` varchar(50) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `isDeleted` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1583432 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_closing` */

DROP TABLE IF EXISTS `t_order_closing`;

CREATE TABLE `t_order_closing` (
  `id` int(50) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `orderNo` varchar(20) DEFAULT NULL COMMENT '订单号',
  `companyNo` varchar(10) DEFAULT NULL COMMENT '商家号',
  `bourn` varchar(10) DEFAULT NULL COMMENT '收件地',
  `initial` varchar(10) DEFAULT NULL COMMENT '发件地',
  `weight` double(10,2) DEFAULT NULL COMMENT '重',
  `experssno` varchar(20) DEFAULT NULL COMMENT '快递码',
  `type` int(1) DEFAULT NULL COMMENT '收款状态',
  `money` double(10,2) DEFAULT NULL COMMENT '收钱',
  `createTime` datetime DEFAULT NULL,
  `endTime` datetime DEFAULT NULL,
  `experss` varchar(10) DEFAULT NULL,
  `outMoney` double(10,2) DEFAULT NULL COMMENT '付钱',
  `outTime` datetime DEFAULT NULL COMMENT '付钱时间',
  `outtype` int(1) DEFAULT NULL COMMENT '付款砖太',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_sku` */

DROP TABLE IF EXISTS `t_order_sku`;

CREATE TABLE `t_order_sku` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderNo` varchar(50) DEFAULT NULL,
  `mailNo` varchar(20) DEFAULT NULL,
  `itemSku` varchar(50) DEFAULT NULL,
  `itemCode` varchar(50) DEFAULT NULL,
  `itemName` varchar(200) DEFAULT NULL,
  `itemCount` int(11) DEFAULT NULL,
  `unitPrice` varchar(10) DEFAULT NULL,
  `allPrice` varchar(10) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  `isDeleted` int(1) DEFAULT NULL,
  `tgxt` varchar(1) DEFAULT NULL COMMENT '特管系统推送标记',
  PRIMARY KEY (`id`),
  KEY `T_ORDER_SKU_ORDERNO` (`orderNo`) USING BTREE,
  KEY `mailNo` (`mailNo`)
) ENGINE=InnoDB AUTO_INCREMENT=1583667 DEFAULT CHARSET=utf8;

/*Table structure for table `t_order_supplies` */

DROP TABLE IF EXISTS `t_order_supplies`;

CREATE TABLE `t_order_supplies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyCode` varchar(20) DEFAULT NULL COMMENT '商家编码',
  `mailNo` varchar(20) DEFAULT NULL COMMENT '运单号',
  `suppliesId` varchar(20) DEFAULT NULL COMMENT '耗材编号',
  `suppliesName` varchar(200) DEFAULT NULL COMMENT '耗材名称',
  `price` varchar(20) DEFAULT NULL COMMENT '耗材单价',
  `suppliesNum` int(11) DEFAULT NULL COMMENT '耗材数量',
  `isToZtz` int(1) DEFAULT NULL COMMENT '是否被ZTZ拉取数据',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `isDeleted` int(1) DEFAULT NULL COMMENT '是否删除',
  `type` int(1) DEFAULT NULL COMMENT '消耗；回归',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `t_qjzy` */

DROP TABLE IF EXISTS `t_qjzy`;

CREATE TABLE `t_qjzy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyCode` varchar(50) DEFAULT NULL,
  `itemName` varchar(50) DEFAULT NULL,
  `itemSku` varchar(200) DEFAULT NULL,
  `num` int(11) DEFAULT NULL,
  `receivedAddress` varchar(255) DEFAULT NULL,
  `receiver` varchar(20) DEFAULT NULL,
  `type` int(1) DEFAULT NULL COMMENT '状态 1-为已交接 0-未交接',
  `createTime` datetime DEFAULT NULL,
  `storage` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Table structure for table `t_selectpack` */

DROP TABLE IF EXISTS `t_selectpack`;

CREATE TABLE `t_selectpack` (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) DEFAULT NULL COMMENT '名称',
  `status` int(1) DEFAULT NULL COMMENT '状态 0 未启用，1已启用',
  `bm` varchar(10) DEFAULT NULL COMMENT '编码 控件编码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Table structure for table `t_supplies` */

DROP TABLE IF EXISTS `t_supplies`;

CREATE TABLE `t_supplies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `suppliesId` varchar(50) DEFAULT NULL COMMENT '耗材编号',
  `suppliesName` varchar(250) DEFAULT NULL COMMENT '耗材名称',
  `type` varchar(40) DEFAULT NULL COMMENT '类型',
  `suppliesType` varchar(100) DEFAULT NULL COMMENT '耗材类别',
  `price` varchar(20) DEFAULT NULL COMMENT '单价',
  `number` int(20) DEFAULT NULL COMMENT '数量',
  `spec` varchar(40) DEFAULT NULL COMMENT '规格',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;

/*Table structure for table `t_template` */

DROP TABLE IF EXISTS `t_template`;

CREATE TABLE `t_template` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `templateNumber` varchar(10) DEFAULT NULL COMMENT '模板编号',
  `templateName` varchar(50) DEFAULT NULL COMMENT '模板名称',
  `templateData` text COMMENT '模板内容',
  `category` varchar(20) DEFAULT NULL COMMENT '类别',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

/*Table structure for table `t_template_20200528b` */

DROP TABLE IF EXISTS `t_template_20200528b`;

CREATE TABLE `t_template_20200528b` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `templateNumber` varchar(10) DEFAULT NULL COMMENT '模板编号',
  `templateName` varchar(50) DEFAULT NULL COMMENT '模板名称',
  `templateData` text COMMENT '模板内容',
  `category` varchar(20) DEFAULT NULL COMMENT '类别',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=44 DEFAULT CHARSET=utf8;

/*Table structure for table `t_template_20210401a` */

DROP TABLE IF EXISTS `t_template_20210401a`;

CREATE TABLE `t_template_20210401a` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `templateNumber` varchar(10) DEFAULT NULL COMMENT '模板编号',
  `templateName` varchar(50) DEFAULT NULL COMMENT '模板名称',
  `templateData` text COMMENT '模板内容',
  `category` varchar(20) DEFAULT NULL COMMENT '类别',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8;

/*Table structure for table `t_users` */

DROP TABLE IF EXISTS `t_users`;

CREATE TABLE `t_users` (
  `id` int(50) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) DEFAULT NULL COMMENT '用户名',
  `password` varchar(50) DEFAULT NULL COMMENT '密码',
  `name` varchar(200) DEFAULT NULL COMMENT '名称',
  `modular` varchar(2000) DEFAULT NULL COMMENT '模块按钮权限',
  `companyCode` varchar(2000) DEFAULT NULL COMMENT '数据权限',
  `createTime` datetime DEFAULT NULL COMMENT '新增日期',
  `isDelete` int(1) DEFAULT '0' COMMENT '1为已删，0为未删',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Table structure for table `webport` */

DROP TABLE IF EXISTS `webport`;

CREATE TABLE `webport` (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `Url` varchar(120) DEFAULT NULL,
  `tab` varchar(20) DEFAULT NULL COMMENT '表名',
  `Code` varchar(15) DEFAULT NULL COMMENT '标识',
  `bm` varchar(30) DEFAULT NULL COMMENT '条件编码',
  `tj` varchar(100) DEFAULT NULL COMMENT '条件',
  `addr` varchar(30) DEFAULT NULL COMMENT '<q0:importZTZItem>地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
