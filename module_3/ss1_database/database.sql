use c1222g1_module3;
create table class(
id int primary key auto_increment,
name varchar(50)
);
create table teacher(
id int primary key auto_increment,
name varchar(50),
age int,
country varchar(50)
);