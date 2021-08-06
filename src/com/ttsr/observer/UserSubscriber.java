package com.ttsr.observer;

public class UserSubscriber implements Subscriber {
    @Override
    public void update(Notifier notifier, Object args) {
        System.out.printf("'%s' %s%n", notifier.toString(), args);
    }
}
