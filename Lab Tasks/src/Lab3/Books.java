package Lab3;
import java.util.*;

public class Books {
    static ArrayList<Books> Details = new ArrayList<>();

    private String title, author, publisher;
    private double price;
    private int stock;

    Books(String title, String author, String publisher, double price, int stock) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.stock = stock;
        Details.add(this);
    }

    static void search(Scanner r) {
        System.out.print("Enter Book Title : ");
        String title1 = r.nextLine();

        System.out.print("Enter Author Name : ");
        String auth = r.nextLine();

        for (Books b : Details) {
            if (title1.equalsIgnoreCase(b.title) &&
                    auth.equalsIgnoreCase(b.author)) {

                System.out.println("Title : " + b.title);
                System.out.println("Author : " + b.author);
                System.out.println("Publisher : " + b.publisher);
                System.out.println("Price : " + b.price);
                System.out.println("Available Stock : " + b.stock);

                System.out.print("Enter Required Copies : ");
                int quant = r.nextInt();
                r.nextLine();

                if (quant > 0 && quant <= b.stock) {
                    System.out.println("Total Cost : " + (quant * b.price));

                    System.out.print("Confirm Purchase (Yes/No) : ");
                    String ch = r.nextLine();

                    if (ch.equalsIgnoreCase("Yes")) {
                        b.stock -= quant;
                        System.out.println("Purchase Successful");
                        System.out.println("Remaining Stock : " + b.stock);
                    } else {
                        System.out.println("Purchase Cancelled");
                    }
                } else {
                    System.out.println("Required copies not in stock");
                }
                return;
            }
        }

        System.out.println("Book Not Available");
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        new Books("Java Fundamentals", "Herbert Schildt", "McGraw Hill", 650, 25);
        new Books("Python Basics", "Eric Matthes", "No Starch Press", 550, 20);
        new Books("C Programming", "Dennis Ritchie", "Pearson", 450, 30);
        new Books("Data Structures", "Narasimha Karumanchi", "CareerMonk", 700, 15);
        new Books("Operating Systems", "Galvin", "Wiley", 800, 10);

        while (true) {
            System.out.println("\n1. Search and Buy Book");
            System.out.println("0. Exit");
            System.out.print("Enter Choice : ");
            int choice = r.nextInt();
            r.nextLine();

            if (choice == 1)
                search(r);
            else if (choice == 0)
                break;
            else
                System.out.println("Invalid Choice");
        }
    }
}