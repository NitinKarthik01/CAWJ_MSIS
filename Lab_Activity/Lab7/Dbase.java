package Lab7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Dbase {

    private static Connection connection = null;

    static
    {
        try
        {
            Properties props = new Properties();
            InputStream input = new FileInputStream("C:\\Users\\MSIS\\Documents\\CAWJ_MSIS\\Lab_Activity\\Lab7\\db.properties");
            props.load(input);

            String driver = props.getProperty("db.driver");
            String url = props.getProperty("db.url");
            String username = props.getProperty("db.username");
            String password = props.getProperty("db.password");

            Class.forName(driver);
            connection = DriverManager.getConnection(url, username, password);
        } catch(Exception e)
        {

        }
    }
}
