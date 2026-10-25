package Lab3;
import java.util.*;

public class Car {
    private String name, model, date, color;
    private double price;

    Car(String name, String model, String date, String color, double price) {
        this.name = name;
        this.model = model;
        this.date = date;
        this.color = color;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Model : " + model);
        System.out.println("Purchase Date : " + date);
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("Brezza", "VX", "02/10/2017", "White", 650500));
        cars.add(new Car("Venue", "SX", "20/09/2018", "White", 750000));
        cars.add(new Car("Ciaz", "VX", "15/12/2015", "White", 600000));
        cars.add(new Car("Ecosport", "LX", "21/06/2018", "Blue", 500500));
        cars.add(new Car("Nexon", "SX", "15/10/2019", "Green", 850500));

        while (true) {
            System.out.println("\n1. Display Available Cars");
            System.out.println("2. Book a Car");
            System.out.println("0. Exit");
            System.out.print("Enter Choice : ");
            int choice = r.nextInt();
            r.nextLine();

            switch (choice) {
                case 1:
                    if (cars.isEmpty()) {
                        System.out.println("No Cars Available");
                    } else {
                        for (Car c : cars)
                            c.display();
                    }
                    break;

                case 2:
                    System.out.print("Enter Car Name : ");
                    String name = r.nextLine();
                    boolean found = false;

                    for (int i = 0; i < cars.size(); i++) {
                        if (cars.get(i).getName().equalsIgnoreCase(name)) {
                            cars.get(i).display();
                            cars.remove(i);
                            System.out.println("Car Booked Successfully");
                            found = true;
                            break;
                        }
                    }

                    if (!found)
                        System.out.println("Car Not Available");
                    break;

                case 0:
                    System.out.println("Exiting");
                    return;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}