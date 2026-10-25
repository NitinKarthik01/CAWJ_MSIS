package Lab4;

import java.util.Scanner;

public class Stack {
    Scanner r = new Scanner(System.in);
    int top = -1;
    int n;
    int[] arr;

    void createNew() {
        System.out.print("Enter the size of stack : ");
        n = r.nextInt();

        if (n <= 0) {
            System.out.println("Invalid Size");
            return;
        }

        arr = new int[n];
        top = -1;
        System.out.println("Stack Created");
    }

    void push() {
        if (arr == null) {
            System.out.println("Create Stack First");
        } else if (top == n - 1) {
            System.out.println("Stack is Full");
        } else {
            System.out.print("Enter Data : ");
            int data = r.nextInt();
            arr[++top] = data;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Deleted Element : " + arr[top--]);
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    void empty() {
        if (top == -1) {
            System.out.println("Stack is Empty");
        } else {
            System.out.println("Stack is Not Empty");
        }
    }
}