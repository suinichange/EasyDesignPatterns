package com;

import com.proxy.Proxy;

public class Client {
    public static void main(String[] args) {
        Girl girl = new Girl();
        girl.setName("李娇娇");
        Proxy proxy = new Proxy(girl);

        proxy.giveBreakfast();
        proxy.giveFlowers();
        proxy.giveChocolate();
    }
}
