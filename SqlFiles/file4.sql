use coforge_db;

create table employees (
	eid numeric primary key,
    ename varchar(20),
    salary numeric,
    email varchar(255),
    mobile varchar(10),
    doj date,
    dob date
);

insert into employees values (1,"Gaurav",7000.0,"gaurav@mail.com","78787878","2026-01-21","2003-01-01");

alter table employees 
modify column eid int not null auto_increment;