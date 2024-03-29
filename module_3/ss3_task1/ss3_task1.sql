drop database if exists ss3_task1;
create database ss3_task1;
use ss3_task1;
create table classroom (
    class_id int not null auto_increment primary key,
    class_name varchar(60) not null,
    start_day datetime not null,
    status bit
);
create table student(
student_id int not null auto_increment primary key,
    student_name varchar(30) not null,
    address     varchar(50),
    phone       varchar(20),
    status      bit,
    class_id  int not null,
    foreign key (class_id) references classroom (class_id)
);
create table student_subject(
sub_id int not null auto_increment primary key,
    sub_name varchar(30) not null,
    credit  tinyint  not null default 1 check ( credit >= 1 ),
    status  bit   default 1
);
create table mark(
	mark_id    int not null auto_increment primary key,
    sub_id     int not null,
    student_id int not null,
    mark      float   default 0 check ( mark between 0 and 100),
    exam_times tinyint default 1,
    unique (sub_id, student_id),
    foreign key (sub_id) references student_subject (sub_id),
    foreign key (student_id) references student (student_id)
);
insert into classroom (class_id, class_name, start_day, status)
values (1, 'A1', '2008-12-20', 1);
insert into classroom (class_id, class_name, start_day, status)
values (2, 'A2', '2008-12-22', 1);
insert into classroom (class_id, class_name, start_day, status)
values (3, 'B3', current_date, 0);
insert into student (student_name, address, phone, status, class_id)
values ('Hung', 'Ha Noi', '0912113113', 1, 1);
insert into student (student_name, address, status, class_id)
values ('Hoa', 'Hai phong', 1, 1);
insert into student (student_name, address, phone, status, class_id)
values ('Manh', 'HCM', '0123123123', 0, 2);
insert into student_subject (sub_id,sub_name,credit,status)
values (1, 'CF', 5, 1),
       (2, 'C', 6, 1),
       (3, 'HDJ', 5, 1),
       (4, 'RDBMS', 10, 1);
insert into mark (sub_id, student_id, mark, exam_times)
values (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
select *from student 
where student_name like 'h%';
select*from classroom
where month(start_day) ='12';
select*from student_subject
where credit>=3 and credit<=5;
set sql_safe_updates=0;
update student set class_id=2 where student_name="hung";
set sql_safe_updates=1;

select*from student;


select student.student_name,student_subject.sub_name,mark.mark from student
inner join student_subject
on student.student_id=student_subject.sub_id
inner join mark
on student_subject.sub_id=mark.mark_id
order by mark desc;



