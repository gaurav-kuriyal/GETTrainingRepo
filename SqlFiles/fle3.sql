use coforge_db;
use jdcodkf ;

delimiter $$
create procedure get_all_students()
begin
	select * from student;
end $$
delimiter ;

call get_all_students();

delimiter $$
create procedure add_numbers(
in a int,
in b int,
out sum int
)
begin
	set sum = a+b;
end$$
delimiter ;

call add_numbers(10,20,@sum);
select @sum as sum;

delimiter $$
create procedure subtract_numbers(
in a int,
in b int,
out difference int
)
begin
	set difference = a-b;
end$$
delimiter ;

call subtract_numbers(10,20,@difference);
select @difference as difference;

delimiter $$
create procedure multiply_numbers(
in a int,
in b int,
out product int
)
begin
	set product = a*b;
end$$
delimiter ;

call multiply_numbers(10,20,@product);
select @product as product;

delimiter $$
create procedure divide_numbers(
in a int,
in b int,
out division double
)
begin
	set division = a/b;
end$$
delimiter ;

call divide_numbers(2,10,@division);
select @division as division;

use classicmodels;
show tables;

select * from payments;

explain analyze
select * from payments where paymentDate between '2004-01-01' and '2004-01-31';

create index idx_paymentDate on payments(paymentDate);

explain analyze
select * from payments where paymentDate between '2004-01-01' and '2004-01-31';

drop index idx_paymentDate on payments;

create index idx_country on customers(country);

explain analyze
select * from customers where country="USA";

create index idx_country_city on customers(country,city);

explain analyze
select * from customers where country="USA" and city="nyc";

show indexes from customers;