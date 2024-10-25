drop table if exists tblUser;
drop table if exists tblOrder;
drop table if exists item;
drop table if exists orderItemLink;

create table tblUser(
    userId int primary key auto_increment,
    username varchar(255) not null unique,
    password varchar(255)
);

create table tblOrder(
    orderId int primary key auto_increment,
    orderUserId int not null,
    total double,
    date varchar(255)
);

create table item(
    itemId int primary key auto_increment,
    name varchar(255) not null unique,
    price double not null
);

CREATE TABLE orderItemLink (
    orderNum INT,
    itemId INT,
    amount INT,
    PRIMARY KEY (orderNum, itemId)
);