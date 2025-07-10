-- question 1
insert into Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class, Evaluation_Notes, VTI_Account) 
values
('Nguyen Van A', '2000-01-15', 'male', 18, 17, 45, 'C101', 'Good potential', 'nva@vti.com'),
('Tran Thi B', '1999-11-23', 'female', 16, 15, 40, 'C101', 'Quick learner', 'ttb@vti.com'),
('Le Van C', '2001-05-10', 'male', 14, 13, 30, 'C102', 'Needs improvement', 'lvc@vti.com'),
('Pham Thi D', '2000-08-01', 'female', 19, 18, 48, 'C102', 'Excellent performance', 'ptd@vti.com'),
('Hoang Van E', '2002-02-20', 'male', 10, 12, 25, 'C103', 'Struggles with English', 'hve@vti.com'),
('Nguyen Thi F', '2000-12-05', 'female', 20, 19, 50, 'C103', 'Top of the class', 'ntf@vti.com'),
('Dang Van G', '2001-03-14', 'unknown', 12, 10, 22, 'C104', 'Unclear motivation', 'dvg@vti.com'),
('Vo Thi H', '1998-07-30', 'female', 15, 14, 38, 'C104', 'Consistent effort', 'vth@vti.com'),
('Bui Van I', '2001-09-18', 'male', 17, 16, 44, 'C105', 'Very focused', 'bvj@vti.com'),
('Tran Thi J', '1999-10-27', 'female', 13, 11, 29, 'C105', 'Needs more practice', 'ttj@vti.com');


-- question 2
select Full_Name, month(Birth_Date) as Month from Trainee
order by month(Birth_Date) asc;

-- question 3
select * from Trainee
where length(Full_Name) = (select Max(length(Full_Name)) from Trainee);

-- question 4
select Full_Name as ET from Trainee
where ET_IQ + ET_Gmath 	>= 20 and ET_IQ >= 8 
and ET_Gmath >= 8 and ET_English >= 18;

-- question 5
delete from Trainee 
where Trainee_ID = 3;

-- question 6
update Trainee
set Training_Class = 'C102'
where Trainee_ID = 5;

