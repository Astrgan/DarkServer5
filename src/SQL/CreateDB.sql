drop database if exists films;
CREATE DATABASE clips CHARACTER SET utf8 COLLATE utf8_unicode_ci;
use clips;
create table clips(
  id_clip int not null auto_increment,
  comment_clip varchar(1000),
  poster varchar(500),
  path varchar(500),
  preview varchar(500),
  PRIMARY KEY ( id_clip )
)ENGINE=InnoDB CHARACTER SET=UTF8;