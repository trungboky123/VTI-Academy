use TestingSystem;

-- question 1 :
delimiter //
create procedure get_accounts_by_department_name(in dept_name varchar(30))
      begin
           select * from account a
           join department d on a.department_id = d.department_id
           where d.department_name = dept_name;
	  end //
delimiter ;
call get_accounts_by_department_name('Director');

-- question 2 :
delimiter //
create procedure accounts_per_group()
      begin
           select g.group_name, count(ga.account_id) as number_of_accounts
           from job_group g
           left join group_account ga on g.group_id = ga.group_id
           group by g.group_id;
      end //
delimiter ;
call accounts_per_group;

-- question 3 :
delimiter //
create procedure number_of_questions_per_type_question_this_month()
      begin 
           select tq.type_name, count(q.content) as number_of_questions
           from type_question tq
           left join question q  on tq.type_id = q.type_id
           where month(q.create_date) = month(curdate()) and year(q.create_date) = year(curdate())
           group by tq.type_name;
	  end //
delimiter ;
call number_of_questions_per_type_question_this_month;

-- question 4 :
delimiter //
create procedure id_of_type_question_having_most_questions()
      begin
           select tq.type_id, count(q.question_id) as number_of_questions
           from type_question tq
           join question q on tq.type_id = q.type_id
           group by tq.type_id
           having count(q.question_id) = (
                 select max(max)
                 from(
                      select count(question_id) as max
                      from question
                      group by type_id
					 ) as `count`
			);
      end //
delimiter ;
call id_of_type_question_having_most_questions;

-- question 5 :
delimiter //
create procedure get_name_of_type_question(in id int, out name varchar(30))
      begin
           select type_name
           from type_question
           where type_id = id;
      end //
delimiter ;
set @type_name = '';
call get_name_of_type_question(1, @type_name);
select @type_name;

-- question 6 :
delimiter //
create procedure get_group_name_or_username_by_string(in string varchar(30))
       begin
            select group_id as id, group_name as name, 'group' as type
            from job_group
            where group_name like concat('%', string, '%')
			union all	
            select account_id as id, account_username as name, 'account' as type
			from account
            where account_username like concat('%', string, '%');
      end //
delimiter ;
call get_group_name_or_username_by_string('Trung');

-- question 7 :
delimiter //
create procedure declaring(in email varchar(50), fullname varchar(30))
      begin
           declare username varchar(50) default substring_index(email, '@', 1);
           declare position_id int default 1;
           declare department_id int default 2;
           insert into TestingSystem.account(email, full_name, account_username, department_id, position_id, create_date)
           values
           (email, fullname, username, department_id, position_id, curdate());
	  end //
delimiter ;
call declaring('Deptrai123@gmail.com', 'Dep trai');

-- question 8 :
delimiter //
create procedure get_longest_content_by_type_name(in typename varchar(30))
       begin
            select tq.type_name, q.content as longest_question
            from type_question tq
            join question q on tq.type_id = q.type_id
            where tq.type_name = typename
	        and length(q.content) = (
				select max(length(q1.content))
                from question q1 
				join type_question tq1 on tq1.type_id = q1.type_id
                where tq1.type_name = typename
      );
end //
delimiter ;
call get_longest_content_by_type_name('Multiple-Choice');

-- question 9 :
delimiter //
create procedure delete_exam_by_id(in id int)
      begin
           delete from exam
           where exam_id = id;
      end //
delimiter ;
call delete_exam_by_id;


-- question 10 :
delimiter //
create procedure delete_old_exams()
      begin
           delete from exam
           where year(create_date) < year(curdate()) - 3;
      end //
delimiter ;
call delete_old_exams

-- question 12 :
delimiter //
create procedure number_of_questions_created_this_year()
      begin
           select month(create_date) as month, count(question_id) as number_of_question
           from question
           where year(create_date) = year(curdate())
           group by month(create_date);
      end //
delimiter ;
call number_of_questions_created_this_year;



