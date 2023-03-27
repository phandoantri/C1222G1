create database furama;
use furama;
create table employee(
id int primary key,
name varchar(45),
day_of_birth date,
id_card varchar(45),
salary double,
phone_number varchar(45),
email varchar(45),
address varchar(45),
position_id int,
level_id int,
department_id int
);
create table customer(
id int primary key,
type_customer_id int,
name varchar(45),
day_of_birth date,
gender bit(1),
id_card varchar(45),
phone_number varchar(45),
email varchar(45),
address varchar(45)
);
create table contract(
contract_id int primary key,
start_day datetime,
end_day datetime,
deposit double,
employee_id int,
customer_id int,
service_id int
);
create table service(
service_id int primary key,
service_name varchar(45),
aria int,
rental_costs double,
max_peope int,
rental_type_id int,
service_type_id int,
room_standard varchar(50),
others_convenient varchar(45),
pool_aria double,
number_floors int
);
