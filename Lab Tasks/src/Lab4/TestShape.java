package Lab4;

public class TestShape {
    public static void main(String[] args) {

        Shape s = new Shape();
        System.out.println(s);

        s.setColor("Blue");
        s.setFilled(false);

        System.out.println(s);
        System.out.println("Color : " + s.getColor());
        System.out.println("Filled : " + s.isFilled());

        Circle c = new Circle(5, "Red", true);

        System.out.println("\n" + c);
        System.out.println("Radius : " + c.getRadius());
        System.out.println("Area : " + c.getArea());
        System.out.println("Perimeter : " + c.getPerimeter());

        c.setRadius(7);
        System.out.println("Updated Radius : " + c.getRadius());

        Rectangle r = new Rectangle(4, 6, "Yellow", true);

        System.out.println("\n" + r);
        System.out.println("Width : " + r.getWidth());
        System.out.println("Length : " + r.getLength());
        System.out.println("Area : " + r.getArea());
        System.out.println("Perimeter : " + r.getPerimeter());

        r.setWidth(5);
        r.setLength(8);
        System.out.println("Updated Rectangle : " + r);

        Square sq = new Square(4, "Green", true);

        System.out.println("\n" + sq);
        System.out.println("Side : " + sq.getSide());
        System.out.println("Area : " + sq.getArea());
        System.out.println("Perimeter : " + sq.getPerimeter());

        sq.setSide(6);
        System.out.println("Updated Side : " + sq.getSide());

        sq.setWidth(8);
        System.out.println("Updated Width : " + sq.getWidth());
        System.out.println("Updated Length : " + sq.getLength());

        sq.setLength(10);
        System.out.println("Final Square : " + sq);
    }
}
