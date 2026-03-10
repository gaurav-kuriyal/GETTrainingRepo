create database coforge_db;
use coforge_db;

create table student (
	stdId integer primary key,
    studentName varchar(20),
    marks numeric
);

describe student;

alter table student 
add column mobile varchar(10);
alter table student 
add constraint uq_key unique(mobile);

alter table student 
add column mobile varchar(10),
add constraint uq_key unique(mobile);

alter table student
drop constraint uq_key;

rename table student to student_table;
rename table student_table to student;

alter table student rename column mobile to mobile_number;

drop table student;

create user user1 identified by 'user@123';
grant all privileges on coforge_db.* to user1;