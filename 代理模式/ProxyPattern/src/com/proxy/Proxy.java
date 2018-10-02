package com.proxy;

import com.Girl;
import com.realSubject.Pursuer;
import com.subject.GiveGift;

/*
代理类：Proxy，代理追求者追求女生
 */
public class Proxy implements GiveGift {

    private Pursuer pursuer;

    public Proxy(Girl girl) {
        pursuer = new Pursuer(girl);
    }

    @Override
    public void giveBreakfast() {
        pursuer.giveBreakfast();
    }

    @Override
    public void giveFlowers() {
        pursuer.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuer.giveChocolate();
    }
}
