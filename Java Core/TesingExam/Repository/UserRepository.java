package TesingExam.Repository;

import TesingExam.Entity.Admin;
import TesingExam.Entity.Employee;
import TesingExam.Entity.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public Connection connection;

    public UserRepository() throws Exception {
        this.connection = MySQLConnection.getConnection();
    }
    public List<User> getAllUsers() throws Exception {
        String sql = "SELECT Id, Full_Name, Email, Password from user";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        List<User> users = new ArrayList<>();
        while (resultSet.next()) {
            User user = new User();
            user.fullName = resultSet.getString("Full_Name");
            user.email = resultSet.getString("Email");
            user.password = resultSet.getString("Password");
            users.add(user);
        }
        return users;
    }

    public User getUserById(int id) throws SQLException {
        String sql = "SELECT Id, Full_Name, Email FROM user WHERE Id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            User user = new User();
            user.fullName = resultSet.getString("Full_Name");
            user.email = resultSet.getString("Email");
            return user;
        }
        return null;
    }

    public void deleteUserById(int id) throws SQLException {
        String sql = "DELETE FROM user WHERE Id = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
    }

    public void createEmployee(Employee employee) throws SQLException {
        String sql = "INSERT INTO user(Full_Name, Email, Password, Role, Pro_Skill) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, employee.fullName);
        statement.setString(2, employee.email);
        statement.setString(3, employee.password);
        statement.setString(4, employee.role);
        statement.setString(5, employee.proSkill);
        statement.executeUpdate();
    }

    public User getUserByEmail(String email) throws SQLException {
        String sql = "SELECT Id, Full_Name, Email, Role FROM user WHERE Email = ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, email);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            User user = new User();
            user.fullName = resultSet.getString("Full_Name");
            user.email = resultSet.getString("Email");
            user.role = resultSet.getString("Role");
            return user;
        }
        return null;
    }

    public void createAdmin(Admin admin) throws SQLException {
        String sql = "INSERT INTO user(Full_Name, Email, Password, Role, Years_Of_Experience) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, admin.fullName);
        statement.setString(2, admin.email);
        statement.setString(3, admin.password);
        statement.setString(4, admin.role);
        statement.setInt(5, admin.expInYear);
        statement.executeUpdate();
    }
}
