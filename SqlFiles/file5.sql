use coforge_db;

create table account (
	accNo int primary key,
    accHolderName varchar(50) not null,
    accType varchar(10) not null,
    balance double not null
);

insert into account (accNo,accHolderName,accType,balance) values
(5001,'Gaurav','savings',500000),
(5002,'Amit','current',80000);

select * from account;