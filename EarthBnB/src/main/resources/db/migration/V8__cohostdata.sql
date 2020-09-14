create table cohostdata (
    id BIGINT not null,
    nameone TEXT,
    imageurlone TEXT,
    nametwo TEXT,
    imageurltwo TEXT,
    primary key(id)
);
insert into cohostdata (
    id,
    nameone,
    imageurlone,
    nametwo,
    imageurltwo
    ) values (
    15,
    "Terry Cruise",
    "https://images.unsplash.com/photo-1598992156182-cc4fa54fdb52?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1834&q=80",
    "Joe Cruise",
    "https://images.unsplash.com/photo-1597935108244-a6458c2ba6d9?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=562&q=80"
    );
insert into cohostdata (
    id,
    nameone,
    imageurlone,
    nametwo,
    imageurltwo
    ) values (
    16,
    "Tony Montana",
    "https://images.unsplash.com/photo-1598265003867-c3ddef58e560?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1050&q=80",
    null,
    null
    );
