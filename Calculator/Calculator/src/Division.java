public class Division extends Operation{

    public Division(double a, double b) {
        super(a, b);
    }

    @Override
    public double execution(double a, double b) {
        if (b == 0) {
            return Double.NaN;
        } else {
            return a / b;
        }

    }

    @Override
    public String getName() {
        return "Division";
    }
}
