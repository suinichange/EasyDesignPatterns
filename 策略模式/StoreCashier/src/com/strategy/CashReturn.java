package com.strategy;

/*
满返收费类
 */
public class CashReturn implements CashSuper {

    //满足的条件金额
    private double moneyCondition = 0.0d;
    //返利金额
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition)
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        return result;
    }
}
