package com.ttsr.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Notifier {
    private final List<Subscriber> subs = new ArrayList<>();

    public void subscribe(Subscriber subscriber){
        subs.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subs.remove(subscriber);
    }

    protected void notify(Object args){
        for (Subscriber sub : subs)
            sub.update(this, args);
    }
}
