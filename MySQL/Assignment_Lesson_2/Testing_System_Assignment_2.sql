-- exercise 1
-- question 2
use TestingSystem;
select * from department;
insert into Department(Department_ID, Department_Name) values (1, 'Marketing'), (2, 'Sale'), (3, 'Security'), (4, 'Human Resource'), (5, 'Technique'), (6, 'Finance'), (7, 'Vice Director'), (8, 'Director'), (9, 'Secretary'), (10, 'Seller');

-- exercise 2
-- question 1
insert into Job_Position(Position_ID, Position_Name) values (1, 'CEO'), (2, 'Manager'), (3, 'Engineer'), (4, 'Analyst'), (5, 'Intern'), (6, 'Consultant'), (7, 'Developer'), (8, 'Tester'), (9, 'Designer'), (10, 'Director');
insert into Account(Email, Full_Name, Account_Username, Department_ID, Position_ID, Create_Date) values ('trunghiennguyen71@gmail.com', 'Nguyen Trung Hien', 'Trung', 1, 1, '2024-01-01'), ('nguyenngocnguyen71@gmail.com', 'Nguyen Ngoc Nguyen', 'Nguyen', 2, 2, '2024-02-01'), ('tranphuongnam71@gmail.com', 'Tran Phuong Nam', 'Nam', 3, 3, '2024-03-01'), ('namkhanhnguyen71@gmail.com', 'Nguyen Nam Khanh', 'Khanh', 4, 4, '2024-04-01'), ('huyhoangnguyen71@gmail.com', 'Nguyen Huy Hoang', 'Hoang', 5, 5, '2024-05-01'), ('lyphucvannguyen71@gmail.com', 'Nguyen Van Ly Phuc', 'Phuc', 6, 6, '2024-06-01'), ('locvanbui71@gmail.com', 'Bui Van Loc', 'Loc', 7, 7, '2024-07-01'), ('giahuynguyen71@gmail.com', 'Nguyen Gia Huy', 'Huy', 8, 8, '2024-08-01'), ('annhuhong71@gmail.com', 'Nhu Hong An', 'An', 9, 9, '2024-09-01'), ('quynhhuongvu71@gmail.com', 'Vu Quynh Huong', 'Huong', 10, 10, '2024-10-01');
insert into job_group(Group_Name, Creator_ID, Creator_Date) values ('A', 1, '2024-01-10'), ('B', 2, '2024-01-11'), ('C', 3, '2024-01-12'), ('D', 4, '2024-01-13'), ('E', 5, '2024-01-14'), ('F', 6, '2024-01-15'), ('G', 7, '2024-01-16'), ('H', 8, '2024-01-17'), ('I', 9, '2024-01-18'), ('J', 10, '2024-01-19');
insert into group_account(Group_ID, Account_ID, Join_Date) values (1, 1, '2019-12-15'), (2, 2, '2019-12-16'), (3, 3, '2019-12-17'), (4, 4, '2019-12-18'), (5, 5, '2019-12-19'), (6, 6, '2019-12-20'), (7, 7, '2019-12-21'), (8, 8, '2019-12-22'), (9, 9, '2024-12-23'), (10, 10, '2024-12-24');
insert into type_question(Type_ID, Type_Name) values (1, 'Essay'), (2, 'Multiple-Choice'), (3, 'Essay'), (4, 'Multiple-Choice'), (5, 'Essay'), (6, 'Multiple-Choice'), (7, 'Essay'), (8, 'Multiple-Choice'), (9, 'Essay'), (10, 'Multiple-Choice');
insert into category_question(category_ID, Category_Name) values (1, 'Math'), (2, 'English'), (3, 'Science'), (4, 'History'), (5, 'Technology'), (6, 'Art'), (7, 'Geography'), (8, 'Politics'), (9, 'Literature'), (10, 'Sports');
insert into question(Question_ID, Content, Category_ID, Type_ID, Creator_ID, Create_Date) values (1, 'What is 2+2?', 1, 1, 1, '2024-03-01'), (2, 'Define gravity.', 3, 2, 2, '2024-03-02'), (3, 'Who was Einstein?', 2, 1, 3, '2024-03-03'), (4, 'What is a CPU?', 5, 2, 4, '2024-03-04'), (5, 'When was WW2?', 4, 1, 5, '2024-03-05'), (6, 'What is a verb?', 2, 2, 6, '2024-03-06'), (7, 'What is an atom?', 3, 1, 7, '2024-03-07'), (8, 'Name a famous artist.', 6, 2, 8, '2024-03-08'), (9, 'Capital of France?', 7, 1, 9, '2024-03-09'), (10, 'Who wrote Hamlet?', 9, 2, 10, '2024-03-10');
insert into answer(Answer_ID, Content, Question_ID, isCorrect) values (1, '4', 1, 'True'), (2, '9.8 m/s²', 2, 'True'), (3, 'Physicist', 3, 'True'), (4, 'Central Processing Unit', 4, 'True'), (5, '1939-1945', 5, 'True'), (6, 'Action word', 6, 'True'), (7, 'Basic unit of matter', 7, 'True'), (8, 'Van Gogh', 8, 'True'),  (9 ,'Paris', 9, 'True'), (10, 'Shakespeare', 10, 'True');
insert into exam(Exam_ID, Code, Title, Category_ID, Duration, Creator_ID, Create_Date) values (1, '001', 'Math Test', 1, 60, 1, '2019-12-16'), (2, '002', 'Science Quiz', 3, 45, 2, '2019-12-17'), (3, '003', 'History Exam', 4, 30, 3, '2019-12-18'), (4, '004', 'English Test', 2, 50, 4, '2019-12-19'), (5, '005', 'Tech Quiz', 5, 40, 5, '2019-12-20'), (6, '006', 'Art Test', 6, 30, 6, '2019-12-21'), (7, '007', 'Geo Quiz', 7, 45, 7, '2019-12-22'), (8, '008', 'Politics Exam', 8, 60, 8, '2019-12-23'), (9, '009', 'Literature Test', 9, 55, 9, '2019-12-24'), (10, '010', 'Sports Quiz', 10, 35, 10, '2019-12-25');
insert into exam_question(Exam_ID, Question_ID) values (1, 1), (2, 2), (3, 3), (4, 4), (5, 5), (6, 6), (7, 7), (8, 8), (9, 9), (10, 10);

-- question 2
select * from Department;

-- question 3
select Department_ID from Department where Department_Name = 'Sale';

-- question 4
select * from Account order by length(Full_Name) desc limit 1;

-- question 5
select * from Account where Department_ID = 3 order by length(Full_Name) desc limit 1;

-- question 6
select Group_Name from Job_Group where Group_ID in (select Group_ID from Group_Account where Join_Date < '2019-12-20');

-- question 8
select Code from Exam where Duration >= 60 and Create_Date < '2019-12-20';

-- question 9
select * from Job_Group order by Creator_Date desc limit 5;
	
-- question 10
select count(Department_ID) from Account group by Department_ID having Department_ID = 2;

-- question 11
select * from Account where Full_Name like 'D%o';

-- question 12
delete from Exam where Create_Date < '2019-12-20';

-- question 13
delete from Question where Content like 'câu hỏi%';

-- question 14
update Account set Full_Name = 'Nguyen Ba Loc', Email = 'loc.nguyenba@vti.com.vn' where Acount_ID = 5; 


