use TestingSystem;

-- exercise 1
-- question 1
select account.Email, account.Full_Name, department.Department_Name from account
left join department on account.Department_ID = department.Department_ID;

-- question 2
select * from account where Create_Date > '2010-12-20';

-- question 3
select Full_Name, Position_Name from account 
join job_position on account.Position_ID = job_position.Position_ID where Position_Name = 'Developer';

-- question 4
select department.Department_ID, department.Department_Name from account 
join department on account.Department_ID = department.Department_ID 
group by department.Department_ID, department.Department_Name
having count(*) > 3;

-- question 5
select q.Content, COUNT(*) AS TimesAppearing 
from exam_question eq
join question q ON eq.Question_ID = q.Question_ID
group by eq.Question_ID, q.Content
order by TimesAppearing desc
limit 1;

-- question 6
select cq.Category_ID, cq.Category_Name, count(*) as TimesUsed
from category_question cq
join question q on cq.Category_ID = q.Category_ID
group by cq.Category_ID, cq.Category_Name;

-- question 7
select q.Question_ID, q.Content, count(*) as TimeUsed
from question q
join exam_question eq on q.Question_ID = eq.Question_ID
group by q.Question_ID, q.Content;

-- question 8
select q.Question_ID, q.Content, count(*) as NumberOfAnswers
from question q
join answer a on q.Question_ID = a.Question_ID
group by q.Question_ID, q.Content
order by NumberOfAnswers desc
limit 1;

-- question 9
select ga.Group_ID, count(*) as NumberOfAccounts
from group_account ga
join account a on ga.Account_ID = a.Account_ID
group by ga.Group_ID;

-- question 10
select p.Position_Name, count(*) as NumberOfPeople
from job_position p 
join account a on p.Position_ID = a.Position_ID
group by p.Position_ID
order by NumberOfPeople asc
limit 1;

-- question 12
select q.Question_ID, q.Content as Question, cq.Category_Name, q.Creator_ID, a.Content as Answer
from question q
join category_question cq on q.Category_ID = cq.Category_ID
join answer a on q.Question_ID = a.Question_ID;

-- question 13
select tq.Type_Name, count(*) as NumberOfQuestions
from type_question tq
join question q on tq.Type_ID = q.Type_ID
group by tq.Type_Name;

-- question 14
select g.Group_Name 
from job_group g 
left join group_account ga on g.Group_ID = ga.Group_ID
where ga.Account_ID is null;

-- question 16
select q.Question_ID, q.Content
from question question
left join answer a on q.Question_ID = a.Question_ID
where a.Answer_ID is null;

-- exercise 2
-- question 17a
select ga.Account_ID, a.Email, ga.Group_ID
from group_account ga
join account a on ga.Account_ID = a.Account_ID
where a.Account_ID = 1;

-- question 17b
select ga.Account_ID, a.Email, ga.Group_ID
from group_account ga
join account a on ga.Account_ID = a.Account_ID
where a.Account_ID = 2;

-- question 17c
select ga.Account_ID, a.Email, ga.Group_ID
from group_account ga
join account a on ga.Account_ID = a.Account_ID
where a.Account_ID = 1
union
select ga.Account_ID, a.Email, ga.Group_ID
from group_account ga
join account a on ga.Account_ID = a.Account_ID
where a.Account_ID = 2;

-- question 18a
select g.Group_ID, g.Group_Name, count(*) AS NumerOfMembers
from job_group g
join group_account ga ON g.Group_ID = ga.Group_ID
group by g.Group_ID, g.Group_Name
having COUNT(*) > 5;

-- question 18b
select g.Group_ID, g.Group_Name, count(*) AS NumerOfMembers
from job_group g
join group_account ga ON g.Group_ID = ga.Group_ID
group by g.Group_ID, g.Group_Name
having COUNT(*)  < 7;

-- question 18c
select g.Group_ID, g.Group_Name, count(*) AS NumerOfMembers
from job_group g
join group_account ga ON g.Group_ID = ga.Group_ID
group by g.Group_ID, g.Group_Name
having COUNT(*) > 5
union all
select g.Group_ID, g.Group_Name, count(*) AS NumerOfMembers
from job_group g
join group_account ga ON g.Group_ID = ga.Group_ID
group by g.Group_ID, g.Group_Name
having COUNT(*) < 7;