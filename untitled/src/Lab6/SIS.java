package Lab6;

import java.io.*;
import java.util.Scanner;

public class SIS {
    private static BufferedReader br = null;
    private static BufferedReader br1 =null;
    private static BufferedWriter bw1 = null;
    private static Scanner sc = new Scanner(System.in);

    public static void initStream()
    {
        try {
            br = new BufferedReader(new FileReader("/Users/nitinsrikarthikeya/Documents/CAWJ_MSIS/untitled/src/Lab6/login.txt"));
            br1 = new BufferedReader(new FileReader(" /Users/nitinsrikarthikeya/Documents/CAWJ_MSIS/untitled/src/Lab6/Student.txt"));
            bw1 = new BufferedWriter(new FileWriter(" /Users/nitinsrikarthikeya/Documents/CAWJ_MSIS/untitled/src/Lab6/Student.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("Runtime Exception -> "+e);
            //throw new RuntimeException(e);
        } catch (IOException e){
            System.out.println(e);
        }
    }

    public static boolean authenticate()
    {
        System.out.println("Enter username");
        String user = sc.next();
        System.out.println(("Enter password"));
        String password = sc.next();

        try {
            String credentials = br.readLine();
            while(credentials != null)
            {
                String[] profile = credentials.split(" ");
                System.out.println(profile[0] +" "+profile[1]);
                if(profile[0].equals(user) && profile[1].equals(password))
                {
                    return true;
                }
                credentials = br.readLine();
            }
        } catch (IOException e)
        {
            System.out.println(e);
        }
        return false;
    }
    public static void insertRecord()
    {
        System.out.println("Enter Reg Number");
        String regno = sc.next();

        System.out.println("Enter name");
        String name = sc.next();

        System.out.println("Enter Place");
        String place = sc.next();

        String insertRecord = regno + " " + name + " " + place;

        try{
            bw1.write(insertRecord);
            bw1.newLine();
            bw1.flush();
        } catch (IOException e)
        {
            throw new RuntimeException(e);
        }

    }

    public static void updateRecord()
    {

    }

    public static void deleteRecord()
    {

    }

    public static void closeStream()
    {

    }


    public static void main(String[] args) {
        initStream();
        if(authenticate())
        {
            System.out.println("SIS App");
            int choice = 0;
            do{
                System.out.println("1. Insert record");
                System.out.println("2. Delete record");
                System.out.println("3. Update record");
                System.out.println();
                System.out.println("Enter your choice");
                choice = sc.nextInt();
            }while(choice!=4);
        }
        else {
            System.out.println("Invalid user");
        }

        System.out.println("Close App");
        closeStream();

    }
}
