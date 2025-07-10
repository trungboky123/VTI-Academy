create database TestingSystem;
use TestingSystem;

create table Department(
Department_ID int auto_increment primary key,
Department_Name varchar(30) not null unique key
);

create table Job_Position(
Position_ID  int auto_increment primary key,
Position_Name varchar(30) not null unique key
);

create table Account(
Account_ID int auto_increment primary key,
Account_Username varchar(30) not null,
Department_ID int not null,
Position_ID int not null,
Create_Date date not null,
foreign key(Department_ID) references Department(Department_ID),
foreign key(Position_ID) references Job_Position(Position_ID)
);

create table Job_Group(
Group_ID int auto_increment primary key,
Group_Name varchar(30) not null,
Creator_ID int not null, 
Creator_Date date not null
);

create table Group_Account(
Group_ID int not null,
Account_ID int not null,
Join_Date date not null,
primary key(Group_ID, Account_ID),
foreign key(Group_ID) references Job_Group(Group_ID)
);

create table Type_Question(
Type_ID int auto_increment primary key,
Type_Name enum('Essay', 'Multiple-Choice') not null	
);

create table Category_Question(
Category_ID int auto_increment primary key,
Category_Name varchar(30) not null
);

create table Question(
Question_ID int auto_increment primary key,
Content text not null,
Category_ID int not null,
Type_ID int not null,
Creator_ID 	int not null,
Create_Date date not null,
foreign key(Category_ID) references Category_Question(Category_ID),
foreign key(Type_ID) references Type_Question(Type_ID)
);

create table Answer(
Answer_ID int auto_increment primary key,
Content text not null,
Question_ID int not null,
isCorrect enum('True', 'False'),
foreign key(Question_ID) references Question(Question_ID)
); 

create table Exam(
Exam_ID int auto_increment primary key,
Code varchar(30) not null,
Title varchar(30) not null,
Category_ID int not null,
Duration tinyint not null,
Creator_ID int not null,
Create_Date date not null
);

create table Exam_Question(
Exam_ID int not null,
Question_ID int not null,
primary key(Exam_ID, Question_ID),
foreign key(Exam_ID) references Exam(Exam_ID),
foreign key(Question_ID) references Question(Question_ID)
);
