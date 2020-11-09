/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 10.4.11-MariaDB : Database - los
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`los` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `los`;

/*Table structure for table `facility_master` */

DROP TABLE IF EXISTS `facility_master`;

CREATE TABLE `facility_master` (
  `id` bigint(20) NOT NULL,
  `activeStatus` varchar(255) DEFAULT NULL,
  `capUtilized` varchar(255) DEFAULT NULL,
  `caplimit` varchar(255) DEFAULT NULL,
  `effectiveFrom` varchar(255) DEFAULT NULL,
  `effectiveTill` varchar(255) DEFAULT NULL,
  `facilityCode` varchar(255) DEFAULT NULL,
  `facilityType` varchar(255) DEFAULT NULL,
  `loanType` varchar(255) DEFAULT NULL,
  `thresholdLimit` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `facility_master` */

insert  into `facility_master`(`id`,`activeStatus`,`capUtilized`,`caplimit`,`effectiveFrom`,`effectiveTill`,`facilityCode`,`facilityType`,`loanType`,`thresholdLimit`) values 
(12,'primary','ncbdj','uiei','yuebvg','jiks','true','code','nbhgj','true');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
