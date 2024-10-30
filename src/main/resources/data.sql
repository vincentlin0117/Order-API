drop table if exists orderItemLink;
drop table if exists tblUser;
drop table if exists tblOrder;
drop table if exists item;


create table tblUser(
    userId int primary key auto_increment,
    username varchar(255) not null unique,
    password varchar(255)
);

create table tblOrder(
    orderNum int primary key auto_increment,
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
    PRIMARY KEY (orderNum, itemId),
    FOREIGN KEY (orderNum) REFERENCES tblOrder(orderNum) ON DELETE CASCADE,
    FOREIGN KEY (itemId) REFERENCES item(itemId) ON DELETE CASCADE
);

-- Insert test data into tblUser
INSERT INTO tblUser (username, password) VALUES 
('john_doe', 'password123'),
('jane_smith', 'securePass!'),
('alice_jones', 'myPassword'),
('bob_brown', '1234abcd');

-- Insert test data into tblOrder
INSERT INTO tblOrder (orderUserId, total, date) VALUES 
(1, 50.75, '2024-10-28'),
(2, 23.45, '2024-10-29'),
(3, 15.99, '2024-10-29'),
(1, 120.00, '2024-10-30');

-- Insert test data into item
INSERT INTO item (name, price) VALUES 
('Apple', 0.99),
('Banana', 0.50),
('Carrot', 0.30),
('Doughnut', 1.50);

-- Insert test data into orderItemLink
INSERT INTO orderItemLink (orderNum, itemId, amount) VALUES 
(1, 1, 3),
(1, 2, 5),
(2, 3, 7),
(3, 4, 1),
(4, 2, 10),
(4, 4, 2);
