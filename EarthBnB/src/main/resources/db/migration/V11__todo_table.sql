create table todo (
id bigint not null auto_increment,
img varchar(300),
rating decimal(6,3),
reviews int(10),
title varchar(100),
category varchar(100),
price decimal(12,4),
location varchar(20),
favorite boolean default false,
info varchar(800),
primary key(id)
);