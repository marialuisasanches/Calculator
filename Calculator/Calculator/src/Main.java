import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        History h = new History();
        Calculator calc = new Calculator(h);


        System.out.println("==== CALCULATOR ====");
        System.out.println("+ addiction");
        System.out.println("- subtract");
        System.out.println("* multiplication");
        System.out.println("/ division");
        System.out.println("Chose your operation to calculate: ");
        String opcao = sc.nextLine();

        System.out.println("Enter the first number: ");
        Double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        Double num2 = sc.nextDouble();

        Operation op = null;

        if(opcao.equals("+")) {
            op = new Addition(num1, num2);

        } else if(opcao.equals("-")) {
            op = new Subtraction(num1, num2);

        } else if(opcao.equals("*")) {
            op = new Multiplication(num1, num2);

        } else if(opcao.equals("/")) {
            op = new Division(num1, num2);

        } else {
            System.out.println("Invalid operation");
        }

        double resultado = calc.calculate(op);
        System.out.println("Result: " + resultado);

        System.out.println("History of operations:");
        h.showRecord();








        /*
        TESTES
        System.out.println("Result: " + calc.calculate(new Addition(5, 3)));
        System.out.println("Result: " + calc.calculate(new Subtraction(10, 4)));
        System.out.println("Result: " + calc.calculate(new Multiplication(2, 6)));
        System.out.println("Result: " + calc.calculate(new Division(8, 2)));

*/


    }
}