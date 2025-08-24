package TesingExam.Repository;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class MySQLConnection {
    public static Connection getConnection() throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream("Resources/JavaTest.properties"));
        String url = properties.getProperty("Url");
        String user = properties.getProperty("User");
        String password = properties.getProperty("Password");
        return DriverManager.getConnection(url, user, password);
    }
}
