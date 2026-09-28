package Lab5;

public class SWitem extends Sales{
    private String type;
    private String os;

    public SWitem(String title, double price, int[] sales, String type, String os)
    {
        super(title, price, sales);
        this.type = type;
        this.os = os;
    }

    void displaySWItem()
    {
        super.displaySales();
        System.out.println("Type : "+type);
        System.out.println("Os : "+os);
    }
    
}
