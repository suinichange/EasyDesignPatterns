package com.abstractSubject;

import com.abstractObserver.Observer;

public abstract class Subject {

    protected String subjectState;

    public abstract void attachObserver(Observer observer);

    public abstract void detachObserver(Observer observer);

    public abstract void notifyObserver();

    public String getSubjectState() {
        return subjectState;
    }

    public void setSubjectState(String subjectState) {
        this.subjectState = subjectState;
    }
}
