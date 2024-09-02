package com.epam.p01creational.p01singleton.p5blockingonclass;

public class Singleton {
    private static Singleton instance;
    private static final Object lock = new Object();

    private Singleton() {}

    public static Singleton getInstance() {
        synchronized (lock) {
            if (instance == null) {
                instance = new Singleton();
            }
        }
        return instance;
    }
}
