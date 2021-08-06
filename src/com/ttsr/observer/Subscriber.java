package com.ttsr.observer;

public interface Subscriber {
    void update(Notifier notifier, Object args);
}
