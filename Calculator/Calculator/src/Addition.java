public class Addition extends Operation {

    public Addition(double a, double b) {
        super(a, b);
    }

    @Override
    public double execution() {
        return a + b;
    }

    @Override
    public String getName() {
        return "+";
    }


}
