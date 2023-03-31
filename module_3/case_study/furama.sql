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
name_customer varchar(45),
day_of_birth date,
gender bit(1),
id_card varchar(45),
phone_number varchar(45),
email varchar(45),
address varchar(45),
type_customer_id int,
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
room_standard varchar(50),
others_convenient varchar(45),
pool_aria double,
number_floors int,
rental_type_id int,
service_type_id int,
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
quantity int,
contract_id int,
accompanied_service_id int,
foreign key(accompanied_service_id) references accompanied_service(accompanied_service_id),
foreign key(contract_id) references contract( contract_id)
);
create table accompanied_service(
accompanied_service_id int primary key,
accompanied_service_name varchar(45),
cost double,
unit varchar(45),
status varchar(45)
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


insert into  employee_position(position_id,position_name)
values (1,"Quản Lý"), (2,"Nhân Viên");
select * from employee_position;


insert into employee_level (level_id,level_name)
values (1,"Trung Cấp"),(2,"Cao Đẳng"),(3,"Đại Học"),(4,"Sau Đại Học");
select * from employee_level;


insert into department(department_id,department_name)
values (1,"Sale-Marketing"),(2,"Hành chính"),(3,"Phục vụ"),(4,"Quản lý");
select * from department;


insert into employee(id,name, day_of_birth, id_card, salary, phone_number, email, address, position_id, level_id, department_id)
values 	(1,'Nguyễn Văn An', '1970-11-07', '456231786', 10000000, '0901234121', 'annguyen@gmail.com', '295 Nguyễn Tất Thành, Đà Nẵng', 1, 3, 1),
		(2,'Lê Văn Bình', '1997-04-09', '654231234', 7000000, '0934212314', 'binhlv@gmail.com', '22 Yên Bái, Đà Nẵng', 1, 2, 2),
		(3,'Hồ Thị Yến', '1995-12-12', '999231723', 14000000, '0412352315', 'thiyen@gmail.com', 'K234/11 Điện Biên Phủ, Gia Lai', 1, 3, 2),
		(4,'Võ Công Toản', '1980-04-04', '123231365',	17000000, '0374443232',	'toan0404@gmail.com', '77 Hoàng Diệu, Quảng Trị', 1, 4,	4),
		(5,'Nguyễn Bỉnh Phát', '1999-12-09', '454363232',	6000000, '0902341231', 'phatphat@gmail.com', '43 Yên Bái, Đà Nẵng',	2, 1, 1),
		(6,'Khúc Nguyễn An Nghi',	'2000-11-08', '964542311', 7000000,	'0978653213', 'annghi20@gmail.com',	'294 Nguyễn Tất Thành, Đà Nẵng', 2,	2, 3),
		(7,'Nguyễn Hữu Hà',	'1993-01-01', '534323231', 8000000,	'0941234553', 'nhh0101@gmail.com', '4 Nguyễn Chí Thanh, Huế', 2, 3,	2),
		(8,'Nguyễn Hà Đông', '1989-09-03', '234414123',	9000000, '0642123111', 'donghanguyen@gmail.com', '111 Hùng Vương, Hà Nội', 2, 4, 4),
		(9,'Tòng Hoang', '1982-09-03', '256781231',	6000000, '0245144444', 'hoangtong@gmail.com', '213 Hàm Nghi, Đà Nẵng', 2, 4, 4),
		(10,'Nguyễn Công Đạo', '1994-01-08', '755434343', 8000000, '0988767111', 'nguyencongdao12@gmail.com', '6 Hoà Khánh, Đồng Nai', 2, 3, 2);
select * from employee;


insert into customer_type(customer_type_id,customer_type_name)
values (1,"Diamond"),(2,"Platinium"),(3,"Gold"),(4,"Silver"),(5,"Member");
select * from customer_type;


insert into customer (id,name_customer, day_of_birth, gender, id_card, phone_number, email, address,type_customer_id)
values (1,'Nguyễn Thị Hào', '1970-11-07', 0, '643431213',	'0945423362', 'thihao07@gmail.com',	'23 Nguyễn Hoàng, Đà Nẵng', 5),
	   (2,'Phạm Xuân Diệu', '1992-08-08', 1, '865342123', '0954333333', 'xuandieu92@gmail.com', 'K77/22 Thái Phiên, Quảng Trị',3),
	   (3,'Trương Đình Nghệ', '1990-02-27', 1,	'488645199', '0373213122', 'nghenhan2702@gmail.com', 'K323/12 Ông Ích Khiêm, Vinh',1),
	   (4,'Dương Văn Quan', '1981-07-08', 1, '543432111', '0490039241', 'duongquan@gmail.com',	'K453/12 Lê Lợi, Đà Nẵng',1),
       (5,'Hoàng Trần Nhi Nhi', '1995-12-09', 0, '795453345', '0312345678', 'nhinhi123@gmail.com',	'224 Lý Thái Tổ, Gia Lai',4),
       (6,'Tôn Nữ Mộc Châu', '2005-12-06',	0, '732434215',	'0988888844', 'tonnuchau@gmail.com', '37 Yên Thế, Đà Nẵng',4),
       (7,'Nguyễn Mỹ Kim',	'1984-04-08', 0, '856453123', '0912345698',	'kimcuong84@gmail.com',	'K123/45 Lê Lợi, Hồ Chí Minh',1),
       (8,'Nguyễn Thị Hào', '1999-04-08', 0, '965656433', '0763212345', 'haohao99@gmail.com',	'55 Nguyễn Văn Linh, Kon Tum',3),
       (9,'Trần Đại Danh',	'1994-07-01', 1, '432341235', '0643343433',	'danhhai99@gmail.com', '24 Lý Thường Kiệt, Quảng Ngãi',1),
       (10,'Nguyễn Tâm Đắc', '1989-07-01', 1, '344343432', '0987654321', 'dactam@gmail.com', '22 Ngô Quyền, Đà Nẵng',2);
select * from customer;


insert into rental_type (rental_type_id,rental_type_name)
values (1,"year"),(2,"month"),(3,"day"),(4,"hour");
select * from rental_type;

insert into service_type(service_type_id,service_type_name)
values (1,"Villa"),(2,"House"),(3,"Room");
select * from service_type;

insert into service(service_id,service_name, aria, rental_costs, max_peope, room_standard, others_convenient, pool_aria, number_floors, rental_type_id, service_type_id)
values 	(1,'Villa Beach Front', 25000, 10000000, 10 , 'vip', 'Có hồ bơi', 500, 4, 3, 1),
		(2,'House Princess 01', 14000, 5000000, 7, 'vip', 'Có thêm bếp nướng', null, 3, 2, 2),
		(3,'Room Twin 01', 5000, 1000000, 2, 'normal', 'Có tivi', null, null, 4, 3),
		(4,'Villa No Beach Front', 22000, 9000000, 8,'normal', 'Có hồ bơi', 300, 3, 3, 1),
		(5,'House Princess 02',	10000, 4000000,	5, 'normal', 'Có thêm bếp nướng',	null, 2, 3, 2),
		(6,'Room Twin 02', 3000, 900000, 2, 'normal',	'Có tivi', null, null, 4, 3);
select * from service;

insert into accompanied_service(accompanied_service_id,accompanied_service_name, cost, unit, status)
values 	(1,'Karaoke', 10000, 'giờ',	'tiện nghi, hiện tại'),
		(2,'Thuê xe máy', 10000, 'chiếc', 'hỏng 1 xe'),
		(3,'Thuê xe đạp', 20000, 'chiếc', 'tốt'),
		(4,'Buffet buổi sáng', 15000, 'suất', 'đầy đủ đồ ăn, tráng miệng'),
		(5,'Buffet buổi trưa', 90000, 'suất', 'đầy đủ đồ ăn, tráng miệng'),
		(6,'Buffet buổi tối', 16000, 'suất', 'đầy đủ đồ ăn, tráng miệng');
select * from accompanied_service;

insert into contract (contract_id,start_day,end_day,deposit,employee_id,customer_id,service_id)
values 	(1,'2020-12-08', '2020-12-08', 0, 3, 1,3),
		(2,'2020-07-14', '2020-07-21', 200000, 7, 3, 1),
		(3,'2021-03-15', '2021-03-17', 50000, 3, 4, 2),
		(4,'2021-01-14', '2021-01-18', 100000, 7, 5, 5),
		(5,'2021-07-14', '2021-07-15', 0, 7, 2, 6),
		(6,'2021-06-01', '2021-06-03', 0, 7, 7, 6),
		(7,'2021-09-02', '2021-09-05', 100000, 7, 4, 4),
		(8,'2021-06-17', '2021-06-18', 150000, 3, 4, 1),
		(9,'2020-11-19', '2020-11-19', 0, 3, 4, 3),
		(10,'2021-04-12', '2021-04-14', 0, 10, 3, 5),
		(11,'2021-04-25', '2021-04-25', 0, 2, 2, 1),
		(12,'2021-05-25', '2021-05-27', 0, 7, 10, 1);
select * from contract;

insert into contract_detail(contract_detail_id,quantity, contract_id , accompanied_service_id)
values 	(1,5,2,4),
		(2,8,2,5),
        (3,15,2,6),
        (4,1,3,1),
        (5,11,3,2),
        (6,1,1,3),
        (7,2,1,2),
        (8,2,12,2);
select * from contract_detail;

-- 2.Hiển thị thông tin của tất cả nhân viên có trong hệ thống 
-- có tên bắt đầu là một trong các ký tự “H”, “T” hoặc “K” và có tối đa 15 kí tự.
select * from employee
where name like '% h%' or name like '% t%' or name like '% k%' and length(name)<=15;

-- 3.Hiển thị thông tin của tất cả khách hàng có độ tuổi từ 18 đến 50 tuổi và có địa chỉ ở “Đà Nẵng” hoặc “Quảng Trị”.
select *  from  customer
where ((year(curdate())-year(day_of_birth))>18 and (year(curdate())-year(day_of_birth))<50) and (address like '%Đà Nẵng%' or address like '%Quảng Trị%');


-- 4.Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
select customer.id ,customer.name_customer ,count(contract.contract_id) as number_booking from customer_type
join customer on customer_type.customer_type_id=customer.type_customer_id
join contract on customer.id=contract.customer_id
where customer_type.customer_type_name='Diamond'
group by customer.id
order by id;


-- Hiển thị ma_khach_hang, ho_ten, ten_loai_khach,ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien
-- (Với tổng tiền được tính theo công thức như sau: Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet)
-- cho tất cả các khách hàng đã từng đặt phòng. (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
select customer.id,customer.name_customer,customer_type.customer_type_name,contract.contract_id,
service.service_name,contract.start_day,contract.end_day,service.rental_costs+ifnull((contract_detail.quantity*accompanied_service.cost),0) as total from customer_type 
join customer on customer_type.customer_type_id=customer.type_customer_id
join contract on customer.id=contract.customer_id
left join contract_detail on contract.contract_id=contract_detail.contract_id
left join accompanied_service on contract_detail.accompanied_service_id=accompanied_service.accompanied_service_id
join service  on contract.service_id=service.service_id
group by customer.id
order by customer.id;






