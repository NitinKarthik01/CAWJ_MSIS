package Lab5;

public class Circle extends Shape
{
    double radius;
    public Circle()
    {
        super();
        double radius = 1.0;
    }

    public Circle(double radius)
    {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea(double radius)
    {
        return 4*(3.14)*radius*radius;
    }

    public double getPerimeter(double radius)
    {
        return 2*(3.14)*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+radius+", which is a subclass of "+super.toString();
    }
}
