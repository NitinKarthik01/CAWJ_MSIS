package Lab6;

import java.io.*;
import java.util.*;

public class SIS {

    private static Scanner r = new Scanner(System.in);

    // Authenticate user using login.txt
    public static boolean authenticate() {

        System.out.print("ENTER THE USERNAME : ");
        String uname = r.next();

        System.out.print("ENTER THE PASSWORD : ");
        String pwd = r.next();

        try (BufferedReader br = new BufferedReader(new FileReader("login.txt"))) {

            String creds;

            while ((creds = br.readLine()) != null) {

                String[] prof = creds.trim().split("\\s+");

                if (prof.length >= 2 &&
                        prof[0].equals(uname) &&
                        prof[1].equals(pwd)) {

                    return true;
                }
            }

        } catch (IOException e) {
            System.out.println(e);
        }

        return false;
    }

    // Insert student details into student_details.txt
    public static void insertUser() {

        System.out.print("ENTER THE ROLL NO : ");
        String rno = r.next();

        System.out.print("ENTER THE NAME : ");
        String name = r.next();

        System.out.print("ENTER THE BRANCH : ");
        String branch = r.next();

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("student_details.txt", true))) {

            bw.write(rno + " " + name + " " + branch);
            bw.newLine();

            System.out.println("STUDENT ADDED SUCCESSFULLY");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Display student names and delete selected student
    public static void deleteUser() {

        ArrayList<String> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(
                new FileReader("student_details.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                if (!line.trim().isEmpty()) {
                    students.add(line);
                }
            }

        } catch (IOException e) {
            System.out.println(e);
            return;
        }

        if (students.isEmpty()) {
            System.out.println("NO STUDENTS AVAILABLE");
            return;
        }

        System.out.println("CURRENT STUDENTS:");

        for (int i = 0; i < students.size(); i++) {

            String[] details = students.get(i).trim().split("\\s+");

            System.out.println((i + 1) + ". " + details[1]);
        }

        System.out.print("SELECT STUDENT NUMBER TO DELETE : ");
        int choice = r.nextInt();

        if (choice < 1 || choice > students.size()) {
            System.out.println("INVALID SELECTION");
            return;
        }

        students.remove(choice - 1);

        try (BufferedWriter bw = new BufferedWriter(
                new FileWriter("student_details.txt"))) {

            for (String student : students) {
                bw.write(student);
                bw.newLine();
            }

            System.out.println("STUDENT DELETED SUCCESSFULLY");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    // Display all student records
    public static void display() {

        try (BufferedReader br = new BufferedReader(
                new FileReader("student_details.txt"))) {

            String line;

            System.out.println("\nSTUDENT DETAILS:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        boolean loggedIn = false;

        // Allow three login attempts
        for (int i = 1; i <= 3; i++) {

            if (authenticate()) {
                System.out.println("LOGIN SUCCESSFUL");
                loggedIn = true;
                break;
            }

            System.out.println("INVALID CREDENTIALS");

            if (i < 3) {
                System.out.println("ATTEMPTS LEFT : " + (3 - i));
            }
        }

        if (!loggedIn) {
            System.out.println("LOGIN FAILED. EXITING");
            return;
        }

        while (true) {

            System.out.println("\n===== STUDENT INFORMATION SYSTEM =====");
            System.out.println("1. INSERT STUDENT");
            System.out.println("2. DELETE STUDENT");
            System.out.println("3. DISPLAY STUDENTS");
            System.out.println("4. EXIT");
            System.out.print("ENTER YOUR CHOICE : ");

            int n = r.nextInt();

            switch (n) {

                case 1:
                    insertUser();
                    break;

                case 2:
                    deleteUser();
                    break;

                case 3:
                    display();
                    break;

                case 4:
                    System.out.println("THANK YOU");
                    return;

                default:
                    System.out.println("INVALID CHOICE");
            }
        }
    }
}