/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.5.61 : Database - ssm_maven_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm_maven_db` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `ssm_maven_db`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `s_id` int(11) NOT NULL,
  `s_name` varchar(20) NOT NULL,
  `s_sex` char(1) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `fk_s_t_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`s_id`),
  KEY `fk_s_t` (`fk_s_t_id`),
  CONSTRAINT `fk_s_t` FOREIGN KEY (`fk_s_t_id`) REFERENCES `teacher` (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `student` */

insert  into `student`(`s_id`,`s_name`,`s_sex`,`age`,`email`,`fk_s_t_id`) values (1,'jizhiwei','1',27,'zhiweimr@163.com',1);

/*Table structure for table `teacher` */

DROP TABLE IF EXISTS `teacher`;

CREATE TABLE `teacher` (
  `t_id` int(11) NOT NULL,
  `t_name` varchar(20) NOT NULL,
  `t_age` int(11) DEFAULT NULL,
  `t_email` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `teacher` */

insert  into `teacher`(`t_id`,`t_name`,`t_age`,`t_email`) values (1,'苍井空',24,'cangjing@qq.com'),(2,'姚明',29,'yaoming@qq.com');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
