package Lab7;
import java.sql.*;
import java.util.Scanner;

public class TestDB {
   /* private static Connection con;
    private  static Statement stm;
    private static ResultSet rs;

    public  static void loadDriver()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");   //write as it is, a static method
            System.out.println("loaded driver successfully");
        } catch (ClassNotFoundException e)
        {
            System.out.println("Driver error : " + e);
        }
    }

    public  static void createConnection()
    {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testDB1","nitin","nsk"); //if you are connecting to another system, instead of localhost enter the IP of the that system
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

    public static void display()
    {
        try
        {
            rs = stm.executeQuery("select * from login");
            while(rs.next())
            {
                System.out.print("name : "+rs.getString(1)+"\t");
                System.out.print("password : "+rs.getString(2));
                System.out.println();
            }
        }catch (SQLException e)
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
    public static void main() {
        loadDriver();
        createConnection();
        generateStatement();
        display();
        closeObjects();
    }
    */
   public static void main() {
       DBClass db = new DBClass();
       DBClass.loadDriver("com.mysql.jdbc.Driver");


       Scanner sc = new Scanner(System.in);
       System.out.print("Enter username : ");
       String user = sc.next();
       System.out.println();
       System.out.print("Enter password : ");
       String pass = sc.next();
       System.out.println();


       DBClass.createConnection("jdbc:mysql://localhost:3306/testDB1",user, pass);
       DBClass.generateStatement();
       DBClass.display("select * from login");

       try
       {
           while(db.rs.next())
           {
               System.out.print("name : "+db.rs.getString(1)+"\t");
               System.out.print("password : "+db.rs.getString(2));
               System.out.println();
           }
       } catch (SQLException e)
       {
           throw new RuntimeException(e);
       }
       DBClass.closeObjects();



   }
}
