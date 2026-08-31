package Lab5;

public class testShape
{
    public static void main(String[] args)
    {
        Square s1 = new Square();
        assert (s1.isFilled());
        assert (s1.getColor().equals("Red"));


        Square s2 = new Square(6, "green", false);
        assert(s2.getSide()==6);
        assert(s2.getColor().equals("green"));
        assert(!s2.isFilled());

        Square s3 = new Square(9);
        s3.setColor("White");
        assert(s3.getColor().equals("White"));
        assert(s3.getLength()==9);

        Circle c1 = new Circle();
        assert(c1.isFilled());
        assert(c1.getColor().equals("Red"));


        Circle c2 = new Circle();
        c2.setColor("Black");
        c2.setRadius(10);
        assert(c2.isFilled());
        assert(c2.getColor().equals("Black"));
        assert(c2.getRadius()==10);
        System.out.println(c2.getArea(10));
        System.out.println(c2.getPerimeter(10));


        Rectangle r1 = new Rectangle();
        assert (s1.isFilled());
        assert (s1.getColor().equals("Red"));
        r1.setLength(10);
        r1.setWidth(10);
        assert(r1.getArea()==100.0);


        Square s4 = new Square(5, "Blue", true);
        assert(s4.getSide() == 5);
        assert(s4.getColor().equals("Blue"));
        assert(s4.isFilled());
        assert(s4.getLength() == 5);


        Square s5 = new Square(12);
        assert(s5.getSide() == 12);
        assert(s5.getLength() == 12);
        s5.setColor("Yellow");
        assert(s5.getColor().equals("Yellow"));


        Circle c3 = new Circle(5, "Green", true);
        assert(c3.getRadius() == 5);
        assert(c3.getColor().equals("Green"));
        assert(c3.isFilled());


        Circle c4 = new Circle();
        c4.setRadius(7);
        c4.setColor("Blue");
        assert(c4.getRadius() == 7);
        assert(c4.getColor().equals("Blue"));
        assert(c4.isFilled());


        Rectangle r2 = new Rectangle();
        r2.setLength(10);
        r2.setWidth(5);
        assert(r2.getLength() == 10);
        assert(r2.getWidth() == 5);
        assert(r2.getArea() == 50.0);


        Rectangle r3 = new Rectangle();
        r3.setLength(8);
        r3.setWidth(4);
        r3.setColor("Purple");
        assert(r3.getLength() == 8);
        assert(r3.getWidth() == 4);
        assert(r3.getArea() == 32.0);
        assert(r3.getColor().equals("Purple"));
    }
}
