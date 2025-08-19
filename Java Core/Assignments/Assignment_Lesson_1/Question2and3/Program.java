package Assignments.Assignment_Lesson_1.Question2and3;

import Assignments.Assignment_Lesson_1.Question1.*;
import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Department d1 = new Department(1, "Sales");
        Department d2 = new Department(2, "Marketting");
        Department d3 = new Department(3, "IT");

        Position p1 = new Position(1, PositionEnum.Dev);
        Position p2 = new Position(2, PositionEnum.Test);
        Position p3 = new Position(3, PositionEnum.PM);

        Account a1 = new Account(1, "john@example.com", "john", "John Doe", d1, p1, LocalDate.now());
        Account a2 = new Account(2, "jane@example.com", "jane", "Jane Smith", d2, p2, LocalDate.now());
        Account a3 = new Account(3, "bob@example.com", "bob", "Bob Lee", d3, p3, LocalDate.now());

        Group g1 = new Group(1, "Java Group", 1, LocalDate.now());
        Group g2 = new Group(2, "SQL Group", 2, LocalDate.now());
        Group g3 = new Group(3, "OOP Group", 3, LocalDate.now());

        GroupAccount ga1 = new GroupAccount(g1, a2, LocalDate.now());
        GroupAccount ga2 = new GroupAccount(g1, a3, LocalDate.now());
        GroupAccount ga3 = new GroupAccount(g2, a1, LocalDate.now());

        TypeQuestion tq1 = new TypeQuestion(1, TypeEnum.Essay);
        TypeQuestion tq2 = new TypeQuestion(2, TypeEnum.Multiple_Choice);
        TypeQuestion tq3 = new TypeQuestion(3, TypeEnum.Essay);

        CategoryQuestion cq1 = new CategoryQuestion(1, "Java");
        CategoryQuestion cq2 = new CategoryQuestion(2, "SQL");
        CategoryQuestion cq3 = new CategoryQuestion(3, "OOP");

        Question q1 = new Question(1, "What is polymorphism?", cq3, tq1, 1, LocalDate.now());
        Question q2 = new Question(2, "Explain JOIN in SQL", cq2, tq1, 2, LocalDate.now());
        Question q3 = new Question(3, "Which keyword defines a class?", cq1, tq2, 3, LocalDate.now());

        Answer an1 = new Answer(1, "Polymorphism allows...", q1, true);
        Answer an2 = new Answer(2, "JOIN is used to...", q2, true);
        Answer an3 = new Answer(3, "class", q3, true);

        Exam e1 = new Exam(1, "EX001", "Java Basics", cq1, 60, 1, LocalDate.now());
        Exam e2 = new Exam(2, "EX002", "SQL Advanced", cq2, 45, 2, LocalDate.now());
        Exam e3 = new Exam(3, "EX003", "OOP Concepts", cq3, 90, 3, LocalDate.now());

        ExamQuestion eq1 = new ExamQuestion(e1, q1);
        ExamQuestion eq2 = new ExamQuestion(e2, q2);
        ExamQuestion eq3 = new ExamQuestion(e3, q3);

        System.out.println(d1.name);
        System.out.println(d2.id);
        System.out.println(d3.name);
        System.out.println(p1.name);
        System.out.println(p2.id);
        System.out.println(p3.name);
        System.out.println(a1.department.name);
        System.out.println(a2.email);
        System.out.println(a3.position.name);
        System.out.println(g1.name);
        System.out.println(g2.creatorId);
        System.out.println(g3.createDate);
        System.out.println(ga1.group.name);
        System.out.println(ga2.account.fullName);
        System.out.println(ga3.joinDate);
        System.out.println(tq1.id);
        System.out.println(tq2.name);
        System.out.println(tq3.id);
        System.out.println(cq1.id);
        System.out.println(cq2.name);
        System.out.println(cq3.id);
        System.out.println(q1.content);
        System.out.println(q2.creatorId);
        System.out.println(q3.createDate);
        System.out.println(an1.content);
        System.out.println(an2.id);
        System.out.println(an3.isCorrect);
        System.out.println(e1.code);
        System.out.println(e2.creatorId);
        System.out.println(e3.duration);
        System.out.println(eq1.exam.duration);
        System.out.println(eq2.question.content);
        System.out.println(eq3.exam.title);
    }
}

