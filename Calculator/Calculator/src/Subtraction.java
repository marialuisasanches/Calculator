public class Subtraction extends Operation {

    public Subtraction(double a, double b) {
        super(a, b);
    }

    @Override
    public double execution(double a, double b) {
        return a - b;
    }

    @Override
    public String getName() {
        return "Subtraction";
    }
}
