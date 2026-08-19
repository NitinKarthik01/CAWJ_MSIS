package lab1;
import java.util.Scanner;

public class SortString {
    private static Scanner sc;
    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println("length is "+ a.length());
        char[] ch = a.toCharArray();

        for(int i=0; i<a.length()-1; i++)
        {
            for(int j=0; j<a.length()-i-1; j++)
            {
                if(ch[j]>=ch[j+1])
                {
                    char temp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = temp;
                }
            }
        }
        for (char c : ch) {
            System.out.print(c);
        }
    }
}
