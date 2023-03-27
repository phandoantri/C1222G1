create database test;
use test;
create table student(
id int primary key auto_increment,
name varchar(50),
age int
);
insert into student(name,age)
values("phan doan s",15);
select *from student;
set sql_safe_updates=0;
delete from student
where id=1;
set sql_safe_updates=1;
update student
set name="aaa"
where id=6;

alter table student add email varchar(50);
alter table student drop email;
update student 
set email="tri" where id=2;
delete from student where id=2;
alter table student
drop name ;
alter table student add name varchar(50);


