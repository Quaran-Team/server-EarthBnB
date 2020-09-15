create table reservations (
id bigint not null auto_increment,
resdate text,
locationid int,
primary key(id)
);

insert into reservations (
resdate,
locationid
    ) values (
    '2020-10-24',
    1
    );

insert into reservations (
resdate,
locationid
    ) values (
    '2020-11-24',
    2
    );

insert into reservations (
resdate,
locationid
    ) values (
    '2020-12-24',
    3
    );

insert into reservations (
resdate,
locationid
    ) values (
    '2020-9-24',
    4
    );