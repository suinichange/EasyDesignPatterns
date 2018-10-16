package com.concreteObserver;

import com.abstractObserver.Observer;
import com.abstractSubject.Subject;

public class StockObserver extends Observer {

    public StockObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void Update() {
        System.out.println(subject.getSubjectState() + name + "关闭股票，继续工作！");
    }
}
