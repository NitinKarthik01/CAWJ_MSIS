package Lab5;

public class Sales extends item
{
    private double[] sales;

    public Sales(String title, double price, int[] sales)
    {
        super(title, price);
        this.sales[0] = sales[0];
        this.sales[1] = sales[1];
        this.sales[2] = sales[2];
    }
    public double getTotalSales()
    {
        return sales[0]+sales[1]+sales[2];
    }
    void displaySales()
    {
        super.displayItem();
        for(int i=0; i<3; i++)
        {
            System.out.println("Sales in Month "+(i+1)+" : "+sales[i]);
        }
    }
}
