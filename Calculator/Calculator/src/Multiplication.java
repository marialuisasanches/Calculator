public class Multiplication extends Operation {

    public Multiplication(double a, double b) {
        super(a, b);
    }

    @Override
    public double execution() {
        return a * b;
    }

    @Override
    public String getName() {
        return "*";
    }
}
