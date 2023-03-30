drop database if exists ss5_task1;
create database ss5_task1;
use ss5_task1;
create table product(
id int primary key,
product_code int,
product_name varchar(45),
product_price double,
product_amount int,
product_description varchar(45),
product_status int
);
insert into product (id, product_code, product_name, product_price, product_amount, product_description, product_status)
value (1, 101, 'candy', 10000, 10, 'sugar', 0),
	(2, 102, 'cake', 20000, 5, 'sweet', 1),
    (3, 103, 'chocolate', 30000, 6, 'bitter', 1),
    (4, 104, 'milk', 15000, 3, 'tasty', 2),
    (5, 105, 'cocacola', 15000, 9, 'gas', 0);
-- truoc khi su dung index row=12,type=ALL
explain select * from product
where product_name='candy';

create unique index index_product_code on product(product_code);
create index index_product_code1 on product(product_name,product_price);

-- sau khi su dung index row=1,type=ref
explain select * from product
where product_name='candy';  


-- tao bang view
create view v_product as
select product_code,product_name,product_price,product_status from product;
select * from v_product;
 
 -- update view
 update v_product set product_name='abc'
 where product_name='candy';
 
-- delete view
 delete from v_product
 where product_name='cake';
 
 -- SP
  delimiter //
	create procedure show_product()
    begin
    select * from product;
    end;// 
 delimiter;
 call show_product();
 
 
 -- tao moi 
 
 delimiter //
	create procedure add_product()
    begin
    insert into product(product_code, 
    product_name, 
    product_price, 
    product_amount, 
    product_description, 
    product_status)
    values (6, 'sting', 10000, 1, 'sweet', 0);
    end;//
 delimiter;
 call add_product();
 
 
 -- sua doi
 delimiter //
	create procedure edit_product() 
    begin
    set sql_safe_updates = 0;
    update product
    set product_description = 'abc'
    where id = 3;
    set sql_safe_updates = 1;
    end;//
  delimiter;
 call edit_product();
 
 
-- xoa
 delimiter //
	create procedure delete_product()
    begin
    set sql_safe_updates = 0;
    delete from product
    where id = 3;
    set sql_safe_updates = 1;
    end; // 
delimiter ;
 call delete_product();
