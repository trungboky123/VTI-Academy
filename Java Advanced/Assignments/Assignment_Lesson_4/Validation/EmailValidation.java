package Assignments.Assignment_Lesson_4.Validation;

public class EmailValidation {
    public static boolean isValid(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }
}
