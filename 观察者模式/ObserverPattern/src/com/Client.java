package com;

import com.concreteObserver.NBAObserver;
import com.concreteObserver.StockObserver;
import com.concreteSubject.Boss;

public class Client {
    public static void main(String[] args) {
        //老板
        Boss boss = new Boss();
        //看股票同事
        StockObserver stockObserver = new StockObserver("小东", boss);
        //看NBA同事
        NBAObserver nbaObserver = new NBAObserver("小黄", boss);
        //加入要通知的观察者
        boss.attachObserver(stockObserver);
        boss.attachObserver(nbaObserver);
        //老板回来
        boss.setSubjectState("老板回来了!");
        //发出通知
        boss.notifyObserver();
    }
}
