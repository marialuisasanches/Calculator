public abstract class Operation {

    protected double a, b;

    public Operation(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public abstract double execution(double a, double b);
    public abstract String getName();

}
