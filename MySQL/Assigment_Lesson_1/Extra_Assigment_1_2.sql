-- exercise 1
create database Freshers;
use Freshers;

create table Trainee(
Trainee_ID int auto_increment primary key,
Full_Name varchar(30),
Birth_Date date,
Gender enum('male', 'female', 'unknown'),
ET_IQ tinyint unsigned,
ET_Gmath tinyint unsigned,
ET_English tinyint unsigned,
Training_Class varchar(20),
Evaluation_Notes TEXT,
VTI_Account varchar(30) not null unique
);	

-- exercise 2
create table Data_1(
ID int auto_increment primary key,
Name varchar(30) not null,
Code char(5) not null,
Modify_Date datetime not null
);

-- exercise 3
create table Data_2(
ID int auto_increment primary key
);