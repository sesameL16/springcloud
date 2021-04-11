
create database if not exists sesame;
use sesame;
-- cloud-provider-service
CREATE TABLE `payment`(
	`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
	`serial` varchar(200) DEFAULT '',
	PRIMARY KEY (`id`)
)engine=Innodb default charset=utf8mb4;