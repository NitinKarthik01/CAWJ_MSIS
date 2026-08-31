package Lab5;

public class item {
    private String title;
    private double price;

    public item()
    {
        displayItem();
    }

    public item(String title, double price)
    {
        this.title = title;
        this.price = price;
    }

    void displayItem()
    {
        System.out.println("Title : "+title);
        System.out.println("Price : "+price);
    }

}
