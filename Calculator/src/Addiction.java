public class Addiction extends Operation {

    public Addiction(double b, double a, String name) {
        super(b, a);
    }

    @Override
    public double execution(double a, double b) {
        return a + b;
    }

    @Override
    public String getName() {
        return "addiction";
    }
}
