create database test_java;
use test_java;
create table user(
	   Id int auto_increment primary key,
       Full_Name varchar(30) not null,
       Email varchar(30) unique not null,
       Password varchar(50) not null,
       Role enum('Admin', 'Employee') not null,
       Years_Of_Experience tinyint not null default 0,
       Pro_Skill varchar(100) null
);