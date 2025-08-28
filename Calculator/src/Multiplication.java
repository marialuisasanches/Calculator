public class Multiplication extends Operation {

    public Multiplication(double b, double a) {
        super(b, a);
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
