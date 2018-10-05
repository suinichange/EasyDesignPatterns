package com.context;

import com.strategy.CashSuper;

public class CashContext {
    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public CashSuper getCashSuper() {
        return cashSuper;
    }

    public double executeStrategy(double money) {
        return cashSuper.acceptCash(money);
    }
}
