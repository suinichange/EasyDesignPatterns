package com.realSubject;

import com.Girl;
import com.subject.GiveGift;

/*
委托类：追求者
 */
public class Pursuer implements GiveGift {

    private Girl girl;

    public Pursuer(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void giveBreakfast() {
        System.out.println("送早餐给" + girl.getName());
    }

    @Override
    public void giveFlowers() {
        System.out.println("送花给" + girl.getName());
    }

    @Override
    public void giveChocolate() {
        System.out.println("送巧克力" + girl.getName());
    }
}
