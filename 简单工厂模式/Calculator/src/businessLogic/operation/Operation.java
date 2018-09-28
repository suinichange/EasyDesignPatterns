package businessLogic.operation;

public abstract class Operation {

    private double numberOne;

    private double numberTwo;

    public double getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(double numberOne) {
        this.numberOne = numberOne;
    }

    public double getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(double numberTwo) {
        this.numberTwo = numberTwo;
    }

    public abstract double GetResult() throws Exception;
}
