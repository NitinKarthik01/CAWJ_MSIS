package Lab5;

import java.util.Stack;

interface Calculator {
    Calculator put(int n);
    int read();
    Calculator neg();
    Calculator add();
    Calculator sub();
    Calculator mul();
    Calculator div();
    Calculator clear();
    Calculator clearAll();
}

class BasicCalculator implements Calculator {

    private Stack<Integer> stack = new Stack<>();

    private BasicCalculator() {
    }

    public static Calculator getInstance() {
        return new BasicCalculator();
    }

    public Calculator put(int n) {
        stack.push(n);
        return this;
    }

    public int read() {
        return stack.peek();
    }

    public Calculator neg() {
        stack.push(-stack.pop());
        return this;
    }

    public Calculator add() {
        int b = stack.pop();
        int a = stack.pop();
        stack.push(a + b);
        return this;
    }

    public Calculator sub() {
        int b = stack.pop();
        int a = stack.pop();
        stack.push(a - b);
        return this;
    }

    public Calculator mul() {
        int b = stack.pop();
        int a = stack.pop();
        stack.push(a * b);
        return this;
    }

    public Calculator div() {
        int b = stack.pop();
        int a = stack.pop();
        stack.push(a / b);
        return this;
    }

    public Calculator clear() {
        if (!stack.empty()) {
            stack.pop();
        }
        return this;
    }

    public Calculator clearAll() {
        stack.clear();
        return this;
    }
}

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator calc = BasicCalculator.getInstance();

        System.out.println("Addition : " +
                calc.put(25).put(15).add().read());

        calc.clearAll();

        System.out.println("Subtraction : " +
                calc.put(25).put(15).sub().read());

        calc.clearAll();

        System.out.println("Multiplication : " +
                calc.put(25).put(15).mul().read());

        calc.clearAll();

        System.out.println("Division : " +
                calc.put(30).put(5).div().read());

        calc.clearAll();

        System.out.println("Negation : " +
                calc.put(25).neg().read());

        calc.clearAll();

        calc.put(10).put(20).clear();
        System.out.println("After Clear : " + calc.read());

        calc.clearAll();
        System.out.println("Clear All Completed");
    }
}