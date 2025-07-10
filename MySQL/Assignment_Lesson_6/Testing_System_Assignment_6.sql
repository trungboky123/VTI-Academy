use TestingSystem;

-- question 1 :
delimiter //
create trigger not_contain_group_with_create_date_smaller_than_one_year_ago
before insert on job_group
for each row
begin
     if new.creator_date < date_sub(curdate(), interval 1 year) then
        signal sqlstate '45000'
        set message_text = 'Cannot insert into table';
	 end if;
end //
delimiter ;

-- question 2 :
delimiter //
create trigger cannot_add_more_users_into_sale_department
before insert on account 
for each row
begin
	if new.department_id = 2 then
	  signal sqlstate '45000'
	  set message_text = 'Department "Sale" cannot add more user';
	end if;
end //
delimiter ;

-- question 3 :
delimiter //
create trigger maximum_of_a_group_is_5_users
before insert on group_account
for each row
begin
     declare total_accounts int;
     select count(account_id) into total_accounts
     from group_account
     where group_id = new.group_id;
     if total_accounts > 5 then
        signal sqlstate '45000'
        set message_text = 'Cannot add more accounts to this group';
	 end if;
end //
delimiter ;

-- question 4 :
delimiter //
create trigger maximum_of_an_exam_is_10_questions
before insert on exam_question
for each row
begin
     declare total_questions int;
     select count(question_id) into total_questions
     from exam_question
     where exam_id = new.exam_id;
     if total_questions > 10 then
        signal sqlstate '45000'
        set message_text = 'Cannot add more questions to this exam';
	 end if;
end //
delimiter ;

-- question 5 :
delimiter //
create trigger cannot_delete_admin_account
before delete on account
for each row
begin
     if old.email = 'admin@gmail.com' then
	    signal sqlstate '45000'
        set message_text = 'This is admin account, you cannot delete it';
	 end if;
end //
delimiter ;

-- question 6 :
delimiter //
create trigger add_to_waiting_department
before insert on account
for each row
begin
     declare waiting_room_id int;
     if new.department_id is null then
        select department_id into waiting_room_id
        from department
        where department_name = 'Waiting Room';
        set new.department_id = waiting_room_id;
	 end if;
end //
delimiter ;

-- question 7 :
delimiter //
create trigger maximum_of_a_question_is_4_answers
before insert on answer
for each row
begin
     declare total_answers int;
     declare total_true_answers int;
	 select count(*) into total_true_answers
     from answer
     where question_id = new.question_id and isCorrect = true;
     select count(*) into total_answers
     from answer
     where question_id = new.question_id;
     if total_answers > 4 then
		signal sqlstate '45000'
        set message_text = "Cannot add more answers to this question";
	 end if;
	 if new.isCorrect = true then
        if total_true_answers > 2 then
		   signal sqlstate '45000'
           set message_text = "One question can have at most 2 correct answers";   
		end if;
	 end if;
end //
delimiter ;

-- question 8 :
delimiter //
create trigger fix_data
before insert on account 
for each row
begin
     if new.gender = 'Male' then
        set new.gender = 'M';
	 end if;
     if new.gender = 'Female' then
        set new.gender = 'F';
	 end if;
     if new.gender = 'Not Defined' then
        set new.gender = 'U';
	 end if;
end //
delimiter ;

-- question 9 :
delimiter //
create trigger cannot_delete_exams_created_within_2_days
before delete on exam
for each row
begin
     if old.create_date < date_sub(curdate(), interval 2 day) then
        signal sqlstate '45000'
        set message_text = 'Cannot delete the exams created within 2 days';
	 end if;
end //
delimiter ;

-- question 10 :
delimiter //
create trigger cannot_update_questions_used_in_exams
before update on question
for each row
begin
     if exists(
        select 1 
        from exam_question
        where question_id = old.question_id
        ) then
        signal sqlstate '45000'
        set message_text = 'Cannot update the question used in the exams';
	 end if;
end //
delimiter ;

delimiter //
create trigger cannot_delete_questions_used_in_exams
before delete on question
for each row
begin
     if exists(
        select 1 
        from exam_question
        where question_id = old.question_id
        ) then
        signal sqlstate '45000'
        set message_text = 'Cannot delete the question used in the exams';
	 end if;
end //
delimiter ;

-- question 12 :
select *,
case 
    when duration <= 30 then 'Short time'
    when duration > 30 and duration <= 60 then 'Medium time'
    else 'Long time'
end as Duration
from exam;

-- question 13 :
select group_id, count(*) as number_of_accounts,
case 
    when count(*) <= 5 then 'Few'
    when count(*) <= 20 and count(*) > 5 then 'Normal'
    else 'Higher'
end as the_number_user_amount
from group_account
group by group_id;

-- question 14 :
select d.department_id, d.department_name,
case 
    when count(a.account_id) = 0 then 'No users'
    else count(a.account_id)
end as user_count
from department d
left join account a on d.department_id = a.department_id
group by d.department_id, d.department_name;