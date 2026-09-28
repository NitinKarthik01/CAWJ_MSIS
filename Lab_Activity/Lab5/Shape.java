package Lab5;

public class Shape
{
    private String color;
    private boolean filled;

    Shape()
    {
        color = "Red";
        filled = true;
    }

    public Shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isFilled()
    {
        return filled;
    }

    void setFilled(boolean filled)
    {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with colour of "+color+" and "+filled;
    }
}

