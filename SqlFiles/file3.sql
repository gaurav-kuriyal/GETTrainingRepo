use classicmodels;

select c.customernumber, c.customername, o.ordernumber, o.orderdate from customers c inner join orders o on c.customernumber = o.customernumber order by c.customernumber;

select count(customernumber) from customers;
select count(*) from orders;
select customernumber from orders order by customernumber;

select * from orders where customernumber = null;

select o.productCode, o.orderNumber, p.productCode, p.productName from orderdetails o inner join products p ;

select * from orders;
select * from products;

select o.orderNumber,o.orderDate, p.paymentDate, p.amount from orders o inner join payments p;

select pr.productName,od.productCode,o.orderNumber,o.orderDate, p.paymentDate, p.amount from orders o inner join payments p on p.paymentDate = o.orderDate inner join orderdetails od on od.orderNumber=o.ordernumber inner join products pr on od.productCode = pr.productCode order by p.amount desc;

select count(*) from orders o inner join payments p on p.paymentDate = o.orderDate inner join orderdetails od on od.orderNumber=o.ordernumber inner join products pr on od.productCode = pr.productCode;

select c.customernumber, o.ordernumber, od.productcode, od.quantityordered from customers c inner join orders o on o.customernumber=c.customernumber inner join orderdetails od where o.ordernumber=od.ordernumber;

select c.customernumber, c.customername, o.ordernumber, o.orderdate from customers c left join orders o on c.customernumber = o.customernumber;

select o.status from orders o group by o.status;

select c.customerNumber, c.customerName, p.amount from customers c left join payments p on c.customerNumber = p.customerNumber order by p.amount;

select * from employees e right join offices o on e.officeCode = o.officeCode where o.officeCode > 3;

select count(*) from customers;
start transaction;
SET FOREIGN_KEY_CHECKS = 0;
SET FOREIGN_KEY_CHECKS = 1;

delete from customers where customerNumber>150;

select c.customerNumber, c.customerName , p.* from customers c left join payments p on p.customerNumber=c.customerNumber;

rollback;