package Lab7;

import java.sql.*;

class DBClass
{
    public static Connection con;
    public  static Statement stm;
    public static ResultSet rs;

    public  static void loadDriver(String s)
    {
        try
        {
            Class.forName(s);   //write as it is, a static method
            System.out.println("loaded driver successfully");
        } catch (ClassNotFoundException e)
        {
            System.out.println("Driver error : " + e);
        }
    }

    public  static void createConnection(String host,String user,String pass)
    {
        try {
            con = DriverManager.getConnection(host,user,pass); //if you are connecting to another system, instead of localhost enter the IP of the that system
            System.out.println("Connection successfully");
        } catch (SQLException e) {
            System.out.println("Connection error : "+e);;
        }

    }

    public static void generateStatement()
    {
        try {
            stm = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        } catch (SQLException e)
        {
            System.out.println("Statement error : "+ e);
        }
    }

    public static void display(String s)
    {
        try
        {
            rs = stm.executeQuery(s);
        } catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

    }

    public static void closeObjects()
    {
        try
        {
            rs.close();
            stm.close();
            con.close();
        }
        catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }


}
