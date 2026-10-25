package Lab5;

interface IShape {
    double getArea();
}

class Rectangle implements IShape {
    private double height, width;

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }
}

class Circle implements IShape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Pizza {
    private double price;
    private IShape shape;

    Pizza(double price, IShape shape) {
        this.price = price;
        this.shape = shape;
    }

    public double getPrice() {
        return price;
    }

    public IShape getShape() {
        return shape;
    }
}

public class TestPizza {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(10, 5);
        Circle c = new Circle(7);

        Pizza p1 = new Pizza(450, r);
        Pizza p2 = new Pizza(600, c);

        System.out.println("Rectangle Pizza");
        System.out.println("Price : " + p1.getPrice());
        System.out.println("Area : " + p1.getShape().getArea());

        System.out.println("\nCircle Pizza");
        System.out.println("Price : " + p2.getPrice());
        System.out.println("Area : " + p2.getShape().getArea());
    }
}
