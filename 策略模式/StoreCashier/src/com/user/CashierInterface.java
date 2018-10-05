package com.user;

import com.context.CashContext;
import com.strategy.CashNormal;
import com.strategy.CashRebate;
import com.strategy.CashReturn;

import java.util.Scanner;

/*
做一个商场收银软件，营业员根据客户所买的商品的单价和数量向客户收费
 */
public class CashierInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double goodPrice = scanner.nextDouble();
        double goodNum = scanner.nextDouble();
        //原价出售
        CashContext cashContext = new CashContext(new CashNormal());
        double totalPrices = cashContext.executeStrategy(goodPrice * goodNum);
        System.out.println("单价：" + goodPrice + "数量：" + goodNum + "合计：" + totalPrices);

        //要打八折
        cashContext = new CashContext(new CashRebate(0.8));
        totalPrices = cashContext.executeStrategy(goodPrice * goodNum);
        System.out.println("单价：" + goodPrice + "数量：" + goodNum + "合计：" + totalPrices);

        //要满300减100
        cashContext = new CashContext(new CashReturn(300, 100));
        totalPrices = cashContext.executeStrategy(goodPrice * goodNum);
        System.out.println("单价：" + goodPrice + "数量：" + goodNum + "合计：" + totalPrices);
    }
}
