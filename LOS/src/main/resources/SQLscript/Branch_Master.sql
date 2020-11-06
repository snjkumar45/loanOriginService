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

/*Table structure for table `address` */

DROP TABLE IF EXISTS `address`;

CREATE TABLE `address` (
  `id` bigint(20) NOT NULL,
  `activeStatus` varchar(255) DEFAULT NULL,
  `addressLineOne` varchar(255) DEFAULT NULL,
  `addressLineTwo` varchar(255) DEFAULT NULL,
  `branchCode` varchar(255) DEFAULT NULL,
  `branchName` varchar(255) DEFAULT NULL,
  `branchType` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `currency` varchar(255) DEFAULT NULL,
  `district` varchar(255) DEFAULT NULL,
  `location` varchar(255) DEFAULT NULL,
  `mappedBranch` varchar(255) DEFAULT NULL,
  `postal_zip` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `address` */

insert  into `address`(`id`,`activeStatus`,`addressLineOne`,`addressLineTwo`,`branchCode`,`branchName`,`branchType`,`country`,`currency`,`district`,`location`,`mappedBranch`,`postal_zip`) values 
(6,'true','one','switz','switz','newzej','tyghghg','jhgjg','gghg','jhjfgf','dhan','fdfdff','78788'),
(8,'true','one','switz','switz','newzej','tyghghg','jhgjg','gghg','jhjfgf','dhan','fdfdff','78788');

/*Table structure for table `branch_holidays` */

DROP TABLE IF EXISTS `branch_holidays`;

CREATE TABLE `branch_holidays` (
  `id` bigint(20) NOT NULL,
  `weekHalfDays` varchar(255) DEFAULT NULL,
  `weeklyOff` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `branch_holidays` */

insert  into `branch_holidays`(`id`,`weekHalfDays`,`weeklyOff`) values 
(9,'son','mon');

/*Table structure for table `branch_master` */

DROP TABLE IF EXISTS `branch_master`;

CREATE TABLE `branch_master` (
  `id` bigint(20) NOT NULL,
  `address_id` bigint(20) DEFAULT NULL,
  `branchHolidays_id` bigint(20) DEFAULT NULL,
  `branchTimings_id` bigint(20) DEFAULT NULL,
  `communicationDetails_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKn53afer1b9bvlbpuvnvg4k480` (`address_id`),
  KEY `FKlj32arfydhs7uq61debbhc6r9` (`branchHolidays_id`),
  KEY `FK8k77r2kqfdm4uktq5rg8ixbj8` (`branchTimings_id`),
  KEY `FK90fx57bp92e2bryqmk17tg4rq` (`communicationDetails_id`),
  CONSTRAINT `FK8k77r2kqfdm4uktq5rg8ixbj8` FOREIGN KEY (`branchTimings_id`) REFERENCES `branch_timing` (`id`),
  CONSTRAINT `FK90fx57bp92e2bryqmk17tg4rq` FOREIGN KEY (`communicationDetails_id`) REFERENCES `communication_details` (`id`),
  CONSTRAINT `FKlj32arfydhs7uq61debbhc6r9` FOREIGN KEY (`branchHolidays_id`) REFERENCES `branch_holidays` (`id`),
  CONSTRAINT `FKn53afer1b9bvlbpuvnvg4k480` FOREIGN KEY (`address_id`) REFERENCES `address` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `branch_master` */

insert  into `branch_master`(`id`,`address_id`,`branchHolidays_id`,`branchTimings_id`,`communicationDetails_id`) values 
(2,NULL,NULL,NULL,NULL),
(3,NULL,NULL,NULL,NULL),
(4,NULL,NULL,NULL,NULL),
(5,6,NULL,NULL,NULL),
(7,8,9,10,11);

/*Table structure for table `branch_timing` */

DROP TABLE IF EXISTS `branch_timing`;

CREATE TABLE `branch_timing` (
  `id` bigint(20) NOT NULL,
  `branchTimingFrom` varchar(255) DEFAULT NULL,
  `branchTimingTo` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `branch_timing` */

insert  into `branch_timing`(`id`,`branchTimingFrom`,`branchTimingTo`) values 
(10,'11','5');

/*Table structure for table `communication_details` */

DROP TABLE IF EXISTS `communication_details`;

CREATE TABLE `communication_details` (
  `id` bigint(20) NOT NULL,
  `faxNumber` varchar(255) DEFAULT NULL,
  `swiftAddress` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `communication_details` */

insert  into `communication_details`(`id`,`faxNumber`,`swiftAddress`,`telephone`) values 
(11,'78787','gfddgdgf','87787');

/*Table structure for table `hibernate_sequence` */

DROP TABLE IF EXISTS `hibernate_sequence`;

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `hibernate_sequence` */

insert  into `hibernate_sequence`(`next_val`) values 
(12),
(12),
(12),
(12),
(12),
(12);

/*Table structure for table `user_master` */

DROP TABLE IF EXISTS `user_master`;

CREATE TABLE `user_master` (
  `id` bigint(20) NOT NULL,
  `activeStatus` varchar(255) DEFAULT NULL,
  `autoLogin` bit(1) NOT NULL,
  `branchCode` varchar(255) DEFAULT NULL,
  `emailId` varchar(255) DEFAULT NULL,
  `firstName` varchar(255) DEFAULT NULL,
  `isAdmin` bit(1) NOT NULL,
  `lastName` varchar(255) DEFAULT NULL,
  `loginId` varchar(255) DEFAULT NULL,
  `mobileNo` varchar(255) DEFAULT NULL,
  `ssoLogin` bit(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

/*Data for the table `user_master` */

insert  into `user_master`(`id`,`activeStatus`,`autoLogin`,`branchCode`,`emailId`,`firstName`,`isAdmin`,`lastName`,`loginId`,`mobileNo`,`ssoLogin`) values 
(1,'true','','234','s@gmail.com','sanjay','','kumar','aa78','738738','');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
