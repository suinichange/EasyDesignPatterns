package businessLogic.operation;

public class OperationAdd extends Operation {
    @Override
    public double GetResult() {
        double result = 0;
        result = super.getNumberOne() + super.getNumberTwo();
        return result;
    }
}
