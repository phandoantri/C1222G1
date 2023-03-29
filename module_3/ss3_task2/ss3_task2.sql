drop database if exists ss3_task2;
create database ss3_task2;
use ss3_task2;
create table customer(
id int primary key,
customer_name varchar(45),
age int
);
create table order_product(
order_id int primary key,
customer_id int,
order_date date,
order_total_prime double,
foreign key(customer_id) references customer(id)
);
create table product(
product_id int primary key,
product_name varchar(45),
product_prime double
);
create table order_detail(
order_id int,
product_id int,
order_quality varchar(45),
primary key(order_id,product_id),
foreign key(order_id) references order_product(order_id),
foreign key(product_id) references product(product_id)
);
insert into customer (id,customer_name,age)
values (1,'minh quan',10);
insert into customer (id,customer_name,age)
values (2,'ngoc oanh',20);
insert into customer (id,customer_name,age)
values (3,'hong ha',50);
insert into order_product (order_id,customer_id,order_date,order_total_prime)
values (1,1,'2006-03-21',null);
insert into order_product (order_id,customer_id,order_date,order_total_prime)
values (2,2,'2006-03-23',null);
insert into order_product (order_id,customer_id,order_date,order_total_prime)
values (3,1,'2006-03-16',null);
insert into product (product_id,product_name,product_prime)
values (1,'may giat',3);
insert into product (product_id,product_name,product_prime)
values (2,'tu lanh',5);
insert into product (product_id,product_name,product_prime)
values (3,'dieu hoa',7);
insert into product (product_id,product_name,product_prime)
values (4,'quat',1);
insert into product (product_id,product_name,product_prime)
values (5,'bep dien',2);
insert into order_detail (order_id,product_id,order_quality)
values (1,1,3);
insert into order_detail (order_id,product_id,order_quality)
values (1,3,7);
insert into order_detail (order_id,product_id,order_quality)
values (1,4,2);
insert into order_detail (order_id,product_id,order_quality)
values (2,1,1);
insert into order_detail (order_id,product_id,order_quality)
values (3,1,8);
insert into order_detail (order_id,product_id,order_quality)
values (2,5,4);
insert into order_detail (order_id,product_id,order_quality)
values (2,3,3);
select order_id,order_date,order_total_prime from order_product;
select customer.customer_name,product.product_name from customer
inner join order_product on customer.id=order_product.customer_id
inner join product on order_product.customer_id=product.product_id;

select customer_name from customer
left join order_product on order_product.customer_id=customer.id
where customer.id not in  (select order_product.customer_id from order_product);

select order_detail.order_id,order_product.order_date,sum(product.product_prime*order_detail.order_quality) as prime_total from customer
inner join order_product on customer.id=order_product.customer_id
inner join order_detail on order_product.order_id=order_detail.order_id
inner join product on order_detail.product_id=product.product_id
group by order_id;






