public abstract class Operation {

    protected double a, b;

    public Operation(double a, double b) {
        this.a = a;
        this.b = b;
    }
        public abstract double execution();

        public abstract String getName();

        public String getRegistro() {
            double result = execution();
            return (Double.isNaN(result))
                    ? a + " " + getName() + " " + b + " = inválido"
                    : a + " " + getName() + " " + b + " = " + result;
        }
    }



