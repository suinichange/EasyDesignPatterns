package userInterface;

import businessLogic.operation.Operation;
import businessLogic.factory.OperationFactory;
import java.util.Scanner;

/*
实现一个简单计算器，要求输入两个数和运算符号，得到结果
 */
public class CalculatorInterface {

    public static void main(String[] args) {
        //用户输入
        Scanner scanner=new Scanner(System.in);
        double numberOne = scanner.nextDouble();
        double numberTwo=scanner.nextDouble();
        String operator=scanner.next();
        //业务处理
        Operation operation= OperationFactory.createOperate(operator);
        operation.setNumberOne(numberOne);
        operation.setNumberTwo(numberTwo);
        //输出结果
        try {
            System.out.println(operation.GetResult());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
