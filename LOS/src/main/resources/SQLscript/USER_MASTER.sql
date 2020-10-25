/*
SQLyog Community Edition- MySQL GUI v8.02 
MySQL - 5.5.24 : Database - los
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`los` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `los`;

/*Table structure for table `user_master` */

DROP TABLE IF EXISTS `user_master`;

CREATE TABLE `user_master` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `LOGINID` varchar(500) DEFAULT NULL,
  `FIRSTNAME` varchar(500) DEFAULT NULL,
  `LASTNAME` varchar(500) DEFAULT NULL,
  `EMAILID` varchar(500) DEFAULT NULL,
  `MOBILENO` varchar(500) DEFAULT NULL,
  `ACTIVESTATUS` varchar(10) DEFAULT NULL,
  `ISADMIN` varchar(10) DEFAULT NULL,
  `AUTOLOGIN` varchar(10) DEFAULT NULL,
  `branchCode` varchar(255) DEFAULT NULL,
  `ssoLogin` bit(1) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `user_master` */

insert  into `user_master`(`ID`,`LOGINID`,`FIRSTNAME`,`LASTNAME`,`EMAILID`,`MOBILENO`,`ACTIVESTATUS`,`ISADMIN`,`AUTOLOGIN`,`branchCode`,`ssoLogin`) values (1,'sudhir123','sudhir','Mahajan','sudhirgmail.com','95034007787','Y','0','0','123','\0');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
