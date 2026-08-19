package lab1;
import java.util.Scanner;

public class HelloWorld {
    private static Scanner sc;
    public static void main(String[] args)
    {
        //System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1])+ Integer.parseInt(args[2]));

        sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("sum is " + (a+b));
    }
}
