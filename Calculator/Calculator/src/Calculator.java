public class Calculator {

    private History history;

    public Calculator(History history) {
        this.history = history;
    }

    public double calculate(Operation operation){
        double result = operation.execution();
        this.history.addRecord(operation.getRegistro());
        return result;
    }

}
