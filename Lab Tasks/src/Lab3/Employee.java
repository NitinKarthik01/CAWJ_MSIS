package Lab3;
import java.util.*;

public class Employee {
    int id;
    String name, designation;
    double salary;

    Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Designation : " + designation);
        System.out.println("Salary : " + salary);
    }

    void increment() {
        salary = salary + salary * 0.10;
        System.out.println("Updated Salary : " + salary);
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees : ");
        int n = r.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter Employee " + (i + 1) + " Details");

            System.out.print("ID : ");
            int id = r.nextInt();
            r.nextLine();

            System.out.print("Name : ");
            String name = r.nextLine();

            System.out.print("Designation : ");
            String designation = r.nextLine();

            System.out.print("Salary : ");
            double salary = r.nextDouble();

            employees.add(new Employee(id, name, designation, salary));
        }

        while (true) {
            System.out.println("\n1. Search Employee");
            System.out.println("2. Salary Increment");
            System.out.println("3. Display All Employees");
            System.out.println("0. Exit");
            System.out.print("Enter Choice : ");
            int choice = r.nextInt();

            if (choice == 0)
                break;

            if (choice == 3) {
                for (Employee e : employees) {
                    e.display();
                    System.out.println();
                }
                continue;
            }

            if (choice == 1 || choice == 2) {
                System.out.print("Enter Employee ID : ");
                int id = r.nextInt();
                boolean found = false;

                for (Employee e : employees) {
                    if (e.id == id) {
                        found = true;

                        if (choice == 1)
                            e.display();
                        else
                            e.increment();

                        break;
                    }
                }

                if (!found)
                    System.out.println("Employee Not Found");
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }
}
