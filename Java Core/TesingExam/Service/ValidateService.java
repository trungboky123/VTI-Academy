package TesingExam.Service;

public class ValidateService {
    public static boolean isValidEmail(String email){
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public static boolean isValidPassword(String password){
        return password.length() >= 6 && password.length() <= 12 && password.matches("^[A-Za-z0-9]{6,12}$");
    }

    public static boolean isValidFullName(String fullName){
        return fullName.matches("^[a-zA-Z\\s]+$");
    }
}
