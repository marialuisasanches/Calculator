public class Division extends Operation{

    public Division(double b, double a) {
        super(b, a);
    }

    @Override
    public double execution(double a, double b) {
        if (b == 0) {
            return -1;
        } else {
            return a / b;
        }

    }

    @Override
    public String getName() {
        return "";
    }
}
