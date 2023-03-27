create database ss1_database;
create table class_room(
id int primary key auto_increment,
name varchar(50)
);
create table teacher(
id int primary key auto_increment,
name varchar(50),
age int,
country varchar(50)
);