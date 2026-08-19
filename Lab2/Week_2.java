
import java.util.Scanner;
public class Week_2 {

    public static int[] construct_array()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements\n");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<size; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array = [ ");
        for(int i = 0; i<size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");

        int n;

        System.out.println("1. find the duplicate values of an array\n2. kth smallest and largest\n3. move every positive number to the right and every\n");
        n=sc.nextInt();
        switch(n)
        {
            case 1 : duplicate_elements(arr);
                break;

            case 3 :  sort(arr);
                break;

            case 2 :  kth_small_and_large(arr);
                break;

        }
        return arr;
    }

    public static void duplicate_elements(int[] arr)
    {
        int[] b = new int[arr.length] ;
        int count=0;
        System.out.print("\nDuplicates = [ ");
        for(int i=0; i<arr.length;i++)
        {
            boolean duplicate = false;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    duplicate = true;
                    break;
                }
            }
            if(duplicate)
            {
                boolean found = false;
                for(int k = 0; k<count; k++)
                {
                    if(b[k]==arr[i])
                    {
                        found=true;
                        break;
                    }

                }
                if(!found)
                {
                    b[count]=arr[i];
                    count++;
                }
            }
        }
        for (int i = 0; i < count; i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.print("]\n");

    }


    public static void sort(int[] arr)
    {
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]>0)
            {
                for(int j=i+1; j<arr.length; j++)
                {
                    if(arr[j]<0)
                    {
                        int temp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        break;
                    }
                }
            }

        }
        System.out.print("\nSorted array = [ ");
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]\n");
    }


    public static void question_and_answer()
    {
        System.out.print("What is the password of this System?\n");
        int chances=1;
        String ans = new String();
        Scanner sc = new Scanner(System.in);
        ans = sc.next();
        while(chances<3)
        {
            if(ans.equals("Google"))
            {
                System.out.print("Good\n");
                break;
            }
            else
            {
                System.out.print("You have "+(3-chances)+"left. Try again\n");
                chances++;
                ans = sc.next();

            }

        }
        if(chances==3)
        {
            if(ans.equals("Google"))
            {
                System.out.print("Good\n");
            }
            else {
                System.out.print("Sorry, but the password is Google\n");
            }

        }

    }

    public static void floyd()
    {
        int rows;
        System.out.print("Enter no.of rows you want\n");
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();
        int number=1;
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<i+1;j++)
            {
                System.out.print(number+" ");
                number++;
            }
            System.out.print("\n");
        }
        for(int i=1; i<=rows; i++)
        {
            for(int j=1; j<i+1;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("0 ");
                }
                if((i+j)%2==1)
                {
                    System.out.print("1 ");
                }
            }
            System.out.print("\n");
        }
    }


    public static void kth_small_and_large(int[] arr)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int previousSmall = Integer.MIN_VALUE;
        int previousLarge = Integer.MAX_VALUE;

        int smallest = 0;
        int largest = 0;

        for(int a = 0; a < k; a++)
        {
            smallest = Integer.MAX_VALUE;

            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] > previousSmall && arr[i] < smallest)
                {
                    smallest = arr[i];
                }
            }

            previousSmall = smallest;

            largest = Integer.MIN_VALUE;

            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] < previousLarge && arr[i] > largest)
                {
                    largest = arr[i];
                }
            }

            previousLarge = largest;
        }

        if(smallest == Integer.MAX_VALUE || largest == Integer.MIN_VALUE)
        {
            System.out.println("Invalid k");
        }
        else
        {
            System.out.println(k + "th smallest = " + smallest);
            System.out.println(k + "th largest = " + largest);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter your Choice\n");
        System.out.println("1.Array Questions\n   a. find the duplicate values of an array\n   b. kth smallest and largest\n   c. move positive to right and negative to left\n2. post a question and get a correct answer from the user\n3. Floyd's triangle\n4. Exit\n");
        n=sc.nextInt();
        while(n!=6)
        {
            switch(n)
            {
                case 1 : construct_array();
                    break;
                case 2 :  question_and_answer();
                    break;
                case 3 : floyd();
                    break;
                default : System.out.print("No choice like that");
                    break;
            }
            System.out.println("Enter your Choice\n");
            System.out.println("1.Array Questions\n   a. find the duplicate values of an array\n   b. kth smallest and largest\n   c. move positive to right and negative to left\n2. post a question and get a correct answer from the user\n3. Floyd's triangle\n4. Exit\n");
            n=sc.nextInt();
        }
        System.out.print("Thank you, Visit again");
    }

}