package Exercise3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import Sources.Answer;
import Sources.CategoryQuestion;
import Sources.Exam;
import Sources.Question;
import Sources.TypeEnum;
import Sources.TypeQuestion;

public class Question1 {
    public static void main(String[] args) {
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

        Locale locale = new Locale("vi", "VN");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", locale);

        System.out.println("Exam ID: " + e1.id);
        System.out.println("Title: " + e1.title);
        System.out.println("Create Date: " + e1.createDate.format(formatter));
    }
}
