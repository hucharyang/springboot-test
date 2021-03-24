CREATE DATABASE IF NOT EXISTS /*!32312 IF NOT EXISTS*/`studb` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `studb`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '学号',
  `name` varchar(20) NOT NULL COMMENT '姓名',
  `age` int(11) DEFAULT NULL COMMENT '年龄',
  `gender` varchar(20) DEFAULT NULL COMMENT '性别',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `birthday` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '生日',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=60 DEFAULT CHARSET=utf8 COMMENT='学生信息';

/*Data for the table `student` */

insert  into `student`(`id`,`name`,`age`,`gender`,`address`,`birthday`) values (1,'张三',18,'男','南京','2019-06-20 11:53:04'),(2,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(3,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(15,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(16,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(18,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(21,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(22,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(23,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(24,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(25,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(28,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(30,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(31,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(32,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(33,'wanho5',26,'男','南京','2019-05-05 13:53:53'),(51,'test1111',18,'女','南京','2019-05-14 15:35:18'),(53,'test1111',18,'女','南京','2019-05-14 15:38:50'),(54,'1',1,'1','1','2019-05-15 14:18:49'),(55,'2',2,'2','2','2019-05-15 14:19:14'),(56,'3',3,'3','3','2019-05-15 14:20:34'),(57,'4',4,'4','4','2018-08-08 00:00:00'),(58,'55',5,'5','5','2019-09-09 00:00:00');
