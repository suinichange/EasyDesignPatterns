package com.concreteObserver;

import com.abstractObserver.Observer;
import com.abstractSubject.Subject;

public class NBAObserver extends Observer {

    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void Update() {
        System.out.println(subject.getSubjectState() + name + "关闭NBA，继续工作！");
    }
}