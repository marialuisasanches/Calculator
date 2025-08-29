import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Addiction a1 = new Addiction(2,3);
        Subtraction s2 = new Subtraction(4,5);
        Multiplication m3 = new Multiplication(6,7);
        Division d4 = new Division(9,9);

        System.out.println(a1.execution(1,3));
        System.out.println(s2.execution(4,5));
        System.out.println(m3.execution(6,7));
        System.out.println(d4.execution(9,0));

        System.out.println(a1.getName());
        System.out.println(s2.getName());
        System.out.println(m3.getName());
        System.out.println(d4.getName());

        History h = new History();

        h.adicionarRegistro("Addiction: " + a1.execution(2,3));
        h.adicionarRegistro("Subtraction: " + s2.execution(4,5));
        h.adicionarRegistro("Multiplication: " + m3.execution(6,7));
        h.adicionarRegistro("Division: " + d4.execution(9,0));

        System.out.println("Histórico de operações:");
        h.mostrarRegistro();





    }
}