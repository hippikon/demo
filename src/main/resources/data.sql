create table users(username varchar2(10) primary key, password varchar(50), enabled boolean);
insert into users(username, password, enabled) values ('archie','{noop}password123', true);
insert into users(username, password, enabled) values ('jughead','{noop}password123', false);

create table authorities(id bigint auto_increment, username varchar2(10) , authority varchar(10), enabled boolean);
insert into authorities(username, authority, enabled) values ('archie','USER', true);
insert into authorities(username, authority, enabled) values ('jughead','USER', false);

