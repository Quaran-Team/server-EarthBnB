create table locations (
id bigint not null auto_increment,
rating decimal,
numberofratings int,
superhost boolean,
price decimal,
street varchar(70),
city varchar(30),
state_territory varchar(30),
country varchar(30),
international boolean,
zip int(5),
title varchar(50),
host varchar(50),
guests int(3),
beds int(3),
bedrooms int(3),
bathrooms int(3),
primary key(id)
);

alter table locations add column roomspace varchar(100) after bathrooms;
alter table locations add column favorite boolean default false after roomspace;

