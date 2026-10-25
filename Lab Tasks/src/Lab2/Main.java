package Lab2;
import java.util.Scanner;

public class Main {

    public static Scanner r = new Scanner(System.in);

    public static void constructArray(int n) {
        System.out.println("Enter the size of the array");
        int size = r.nextInt();

        if (size <= 0) {
            System.out.println("Invalid array size");
            return;
        }

        int a[] = new int[size];

        System.out.println("Enter the Array Elements");
        for (int i = 0; i < size; i++) {
            a[i] = r.nextInt();
        }

        switch (n) {
            case 1:
                duplicate(a, size);
                break;
            case 2:
                min_max(a, size);
                break;
            case 3:
                pos_neg(a, size);
                break;
        }
    }

    // Write a Java program to find the duplicate values of an array of integer values.
    public static void duplicate(int a[], int size) {
        System.out.print("Duplicate Elements : ");

        for (int i = 0; i < size; i++) {
            boolean repeated = false;

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    repeated = true;
                    break;
                }
            }

            if (repeated)
                continue;

            for (int j = i + 1; j < size; j++) {
                if (a[i] == a[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }

    // Write a Java program to find the kth smallest and largest element in an array.
    public static void min_max(int a[], int size) {
        int t;

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (a[i] > a[j]) {
                    t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }

        System.out.println("Enter the value of k");
        int k = r.nextInt();

        if (k < 1 || k > size) {
            System.out.println("Invalid value of k");
            return;
        }

        System.out.println("Kth Smallest Element : " + a[k - 1]);
        System.out.println("Kth Largest Element : " + a[size - k]);
    }

    // Write a Java program to move every positive number to the right and every negative number to the left.
    public static void pos_neg(int a[], int size) {
        int left = 0;
        int right = size - 1;

        while (left < right) {
            if (a[left] < 0) {
                left++;
            } else if (a[right] >= 0) {
                right--;
            } else {
                int t = a[left];
                a[left] = a[right];
                a[right] = t;
                left++;
                right--;
            }
        }

        System.out.print("POS_NEG : ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Write a Java program to post a question and give three chances to answer correctly.
    public static void User_Test() {
        System.out.println("What is your User Id?");

        for (int c = 1; c <= 3; c++) {
            System.out.print("Enter your Answer : ");
            String ans = r.next();

            if (ans.equalsIgnoreCase("User")) {
                System.out.println("Good");
                return;
            }

            if (c < 3) {
                System.out.println("You have " + (3 - c) + " attempts left");
            }
        }

        System.out.println("Correct answer is User");
    }

    // Write a Java program to print Floyd's triangle.
    // Modify the program to print Floyd's triangle using alternating 1s and 0s.
    public static void floyds() {
        int val = 1;

        System.out.println("Enter the range of the triangle");
        int range = r.nextInt();

        System.out.println("*********** Floyds Triangle 1 ***********");

        for (int i = 0; i < range; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(val++ + " ");
            }
            System.out.println();
        }

        System.out.println("*********** Floyds Triangle 2 ***********");

        for (int i = 0; i < range; i++) {
            int f = (i % 2 == 0) ? 1 : 0;

            for (int j = 0; j <= i; j++) {
                System.out.print(f + " ");
                f = 1 - f;
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        while (true) {
            System.out.print(
                    "\n1. Duplicate Values of Array" +
                            "\n2. Find Kth Smallest and Largest Elements" +
                            "\n3. Move Negative Numbers Left and Positive Numbers Right" +
                            "\n4. Java Program to Test User" +
                            "\n5. Print Floyds Triangle" +
                            "\n0. Exit" +
                            "\n\nEnter Your Choice : "
            );

            int n = r.nextInt();

            switch (n) {
                case 1:
                    constructArray(1);
                    break;
                case 2:
                    constructArray(2);
                    break;
                case 3:
                    constructArray(3);
                    break;
                case 4:
                    User_Test();
                    break;
                case 5:
                    floyds();
                    break;
                case 0:
                    System.out.println("Exiting Program");
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}