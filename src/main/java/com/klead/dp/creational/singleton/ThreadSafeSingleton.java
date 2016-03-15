package com.klead.dp.creational.singleton;

/**
 * Created by kafi on 14/03/2016.
 */
public class ThreadSafeSingleton {

    private static  ThreadSafeSingleton instance ;

    private ThreadSafeSingleton() {}

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
