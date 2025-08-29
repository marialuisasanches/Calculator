public class Multiplication extends Operation {

    public Multiplication(double a, double b) {
        super(a, b);
    }

    @Override
    public double execution(double a, double b) {
        return a * b;
    }

    @Override
    public String getName() {
        return "Multiplication";
    }
}
