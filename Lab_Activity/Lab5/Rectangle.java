package Lab5;

public class Rectangle extends Shape{
    private double length;
    private double width;

    Rectangle()
    {
        super();
        this.length = 1.0;
        this.width = 1.0;
    }

    Rectangle(double width, double length)
    {
        super();
        this.width = width;
        this.length = length;
    }

    Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getPerimeter()
    {
        return 2*(this.length+this.width);
    }

    public double getArea()
    {
        return this.length*this.width;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+width+"and length = "+length+", which is a subclass of "+super.toString();
    }
}
