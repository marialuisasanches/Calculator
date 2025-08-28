public abstract class Operation {

    protected double a, b;

    public Operation(double b, double a) {
        this.b = b;
        this.a = a;
    }

    public abstract double execution(double a, double b);
    public abstract String getName();

}
