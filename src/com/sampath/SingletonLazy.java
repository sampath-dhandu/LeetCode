package com.sampath;

public class SingletonLazy {

    private static volatile SingletonLazy instance;

    private SingletonLazy() {
        if (instance != null) {
            throw new IllegalStateException("Instance already created");
        }
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            synchronized (SingletonLazy.class) {
                if (instance == null) {
                    instance = new SingletonLazy();
                }
            }
        }
        return instance;
    }
}

