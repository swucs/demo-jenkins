DROP TABLE IF exists user;

CREATE TABLE user (
    id INT PRIMARY KEY,
    email VARCHAR(30),
    name VARCHAR(30),
    tel VARCHAR(30)
);

DROP TABLE IF exists product;

CREATE TABLE product (
    id INT PRIMARY KEY,
    no VARCHAR(5),
    name VARCHAR(50)
);