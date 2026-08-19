package lab1;
import java.util.Scanner;

public class ReverseString {
    private static Scanner sc;
    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        String word = sc.nextLine();
        char ch[] = word.toCharArray();

        for(int i = word.length()-1; i>=0; i--)
        {
            System.out.print(ch[i]);
        }


    }
}
