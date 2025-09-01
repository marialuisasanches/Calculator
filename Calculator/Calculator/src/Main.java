import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        History h = new History();
        Calculator calc = new Calculator(h);

        System.out.println("Result: " + calc.calculate(new Addition(5, 3)));
        System.out.println("Result: " + calc.calculate(new Subtraction(10, 4)));
        System.out.println("Result: " + calc.calculate(new Multiplication(2, 6)));
        System.out.println("Result: " + calc.calculate(new Division(8, 2)));


        System.out.println("History of operations:");
        h.showRecord();


    }
}