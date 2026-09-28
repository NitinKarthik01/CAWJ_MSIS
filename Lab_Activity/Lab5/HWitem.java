package Lab5;

public class HWitem extends Sales{
    private String category;
    private String manufacturer;

    public HWitem(String title, double price, int[] sales, String category, String manufacturer)
    {
        super(title, price, sales);
        this.category = category;
        this.manufacturer = manufacturer;
    }

    void displayHWItem()
    {
        super.displaySales();
        System.out.println("Category : "+category);
        System.out.println("Maufacturer : "+manufacturer);
        System.out.println("Total Sales : "+super.getTotalSales());
    }
}
