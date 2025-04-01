CREATE DATABASE BOOKINFO;
create schema book;
create table book (
                                        id int primary key ,
                                        name varchar(40) not null ,
    press varchar(40) not null ,
    author varchar(40) not null
    );
insert into book values (1,'解忧杂货店','南海出版公司','东野圭吾');