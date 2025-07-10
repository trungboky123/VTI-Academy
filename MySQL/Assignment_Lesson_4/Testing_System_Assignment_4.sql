use TestingSystem;

-- question 1 :
create view people_belonging_to_sale_department as
select account_id, full_name from account
where department_id = (select department_id from department where department_name = 'sale');

-- question 2 :
create view accounts_participating_in_most_groups as
select a.* from account a
join group_account ga on a.account_id = ga.account_id
group by a.account_id
having count(ga.group_id) = (
      select max(number_of_groups)
      from(
             select count(group_id) as number_of_groups
             from group_account
             group by account_id
		  ) as `count`
);

-- question 3 :
create view delete_questions_having_long_contents as
select question_id, content from question
where length(content) = (select length(content) from question where length(content) > 300);
delete from question
where question_id = (select question_id from delete_questions_having_long_contents);

-- question 4 :
create view departments_having_most_people as
select d.department_id, d.department_name from department d
join account a on d.department_id = a.department_id
group by d.department_id, d.department_name
having count(a.account_id) = (
	  select max(number_of_account) 
      from(
           select count(account_id) as number_of_account
           from account
           group by department_id
		  ) as `count`
);

-- question 5 :
create view questions_created_by_Nguyen_first_name as
select q.question_id, q.content, a.full_name from question q
join account a on q.creator_id = a.account_id
where a.account_id in (select account_id from account where full_name like 'Nguyen%');
