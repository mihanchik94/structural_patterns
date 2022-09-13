package task_1;

public class IntsCalculator implements Ints {
    private final Calculator calculator = new Calculator();

    @Override
    public int sum(int arg0, int arg1) {
        return calculate(arg0, arg1, Calculator.Operation.SUM);
    }

    @Override
    public int mult(int arg0, int arg1) {
        return calculate(arg0, arg1, Calculator.Operation.MULT);
    }

    @Override
    public int pow(int arg0, int arg1) {
        return calculate(arg0, arg1, Calculator.Operation.POW);
    }

    private int calculate(int firstNum, int secondNum, Calculator.Operation operation) {
        return calculator
                .newFormula()
                .addOperand(firstNum)
                .addOperand(secondNum)
                .calculate(operation)
                .result.intValue();
    }
}