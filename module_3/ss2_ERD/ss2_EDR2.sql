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
product_service double
);
create table order_detail(
order_id int,
product_id int,
order_quality varchar(45),
primary key(order_id,product_id),
foreign key(order_id) references order_product(order_id),
foreign key(product_id) references product(product_id)
);