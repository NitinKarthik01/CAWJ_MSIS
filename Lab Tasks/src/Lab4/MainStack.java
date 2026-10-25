package Lab4;

import java.util.Scanner;

public class MainStack {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        Stack s = new Stack();

        while (true) {
            System.out.println("\n1. Create Stack");
            System.out.println("2. Push");
            System.out.println("3. Pop");
            System.out.println("4. Display");
            System.out.println("5. Empty");
            System.out.println("6. Exit");
            System.out.print("Enter Choice : ");

            int ch = r.nextInt();

            switch (ch) {
                case 1:
                    s.createNew();
                    break;
                case 2:
                    s.push();
                    break;
                case 3:
                    s.pop();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    s.empty();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}