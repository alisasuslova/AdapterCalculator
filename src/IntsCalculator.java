public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }
    int rezult;

    @Override
    public int sum(int arg0, int arg1) {
        rezult = (int) target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM).result();
        return rezult;
    }

    @Override
    public int mult(int arg0, int arg1) {
        rezult = (int) target.newFormula().addOperand(arg0).addOperand(arg1).calculate(Calculator.Operation.SUM).result();
        return rezult;
    }

    @Override
    public int pow(int a, int b) {
        rezult = (int) target.newFormula().addOperand(a).addOperand(b).calculate(Calculator.Operation.POW).result();
        return rezult;
    }
}