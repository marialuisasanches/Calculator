public class Division extends Operation{

    public Division(double a, double b) {
        super(a, b);
    }

    @Override
    public double execution() {
        return (b!=0)? a/b : Double.NaN;
    }

    @Override
    public String getName() {
        return "/";
    }
}
