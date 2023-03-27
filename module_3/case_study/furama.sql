drop database if exists furama;
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
department_id int,
foreign key(position_id) references employee_position(position_id),
foreign key(level_id) references employee_level(level_id),
foreign key(department_id) references department(department_id)
);
create table customer(
id int primary key,
type_customer_id int,
name_customer varchar(45),
day_of_birth date,
gender bit(1),
id_card varchar(45),
phone_number varchar(45),
email varchar(45),
address varchar(45),
foreign key (type_customer_id) references customer_type(customer_type_id)
);
create table contract(
contract_id int primary key,
start_day datetime,
end_day datetime,
deposit double,
employee_id int,
customer_id int,
service_id int,
foreign key(service_id) references service(service_id),
foreign key(employee_id) references employee(id),
foreign key(customer_id) references customer(id)
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
number_floors int,
foreign key(rental_type_id) references rental_type(rental_type_id),
foreign key(service_type_id) references service_type(service_type_id)
);
create table employee_position(
position_id int primary key,
position_name varchar(45)
);
create table employee_level(
level_id int primary key,
level_name varchar(45)
);
create table department(
department_id int primary key,
department_name varchar(45)
);
create table contract_detail(
contract_detail_id int primary key,
contract_id int,
accompanied_service_id int,
quantity int,
foreign key(accompanied_service_id) references accompanied_service(accompanied_service_id),
foreign key(contract_id) references contract( contract_id)
);
create table accompanied_service(
accompanied_service_id int primary key,
accompanied_service_name varchar(45)
);
create table customer_type(
customer_type_id int primary key,
customer_type_name varchar(45)
);
create table rental_type(
rental_type_id int primary key,
rental_type_name varchar(45)
);
create table service_type(
service_type_id int primary key,
service_type_name varchar(45)
);

