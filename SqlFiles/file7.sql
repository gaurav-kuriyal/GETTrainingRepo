create database customerDb;

create table customers (
	custId numeric primary key,
    custName varchar(50),
    address varchar(50),
    mobile varchar(10),
    email varchar(255)
);

insert into customers values (1,"Gaurav","Hyderabad","776767667","gaurav@mail.com");