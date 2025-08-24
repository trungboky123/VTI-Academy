package TesingExam.Service;

import TesingExam.Entity.Admin;
import TesingExam.Entity.Employee;
import TesingExam.Entity.User;
import TesingExam.Repository.UserRepository;

import java.sql.SQLException;

public class UserService {
    public UserRepository userRepository;

    public UserService() throws Exception {
        userRepository = new UserRepository();
    }

    public boolean login(String email, String password) throws Exception{
        if(!ValidateService.isValidEmail(email)){
            throw new Exception("Invalid email format!");
        }
        if(!ValidateService.isValidPassword(password)){
            throw new Exception("Invalid password format!");
        }
        for(User user : userRepository.getAllUsers()){
            if(user.email.equals(email) && user.password.equals(password)){
                return true;
            }
        }
        return false;
    }

    public void createEmployee(String fullName, String email, String proSkill) throws Exception {
        if(!ValidateService.isValidEmail(email)){
            throw new Exception("Invalid email format!");
        }
        if(!ValidateService.isValidFullName(fullName)){
            throw new Exception("Invalid full name format!");
        }
        Employee employee = new Employee(fullName, email, "123456", proSkill);
        userRepository.createEmployee(employee);
    }

    public String detectRoleByEmail(String email) throws SQLException {
        User user = userRepository.getUserByEmail(email);
        if(user.role.equals("Admin")){
            return "Admin";
        }
        return "Employee";
    }

    public void createAdmin(String fullName, String email, String password, int expInYear) throws Exception {
        if(!ValidateService.isValidEmail(email)){
            throw new Exception("Invalid email format!");
        }
        if(!ValidateService.isValidFullName(fullName)){
            throw new Exception("Invalid full name format!");
        }
        if(!ValidateService.isValidPassword(password)){
            throw new Exception("Invalid password format!");
        }
        Admin admin = new Admin(fullName, email, password, expInYear);
        userRepository.createAdmin(admin);
    }
}
