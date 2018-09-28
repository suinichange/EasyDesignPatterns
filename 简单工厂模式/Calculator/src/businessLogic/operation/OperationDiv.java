package businessLogic.operation;

public class OperationDiv extends Operation {
    @Override
    public double GetResult() throws Exception {
        double result = 0;
        if (super.getNumberTwo() == 0) {
            throw new Exception("除数不能为0。");
        } else {
            result = super.getNumberOne() / super.getNumberTwo();
        }
        return result;
    }
}
