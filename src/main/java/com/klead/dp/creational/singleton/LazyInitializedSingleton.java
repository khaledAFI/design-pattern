package com.klead.dp.creational.singleton;

/**
 * Created by kafi on 14/03/2016.
 */
public class LazyInitializedSingleton {

    private static  LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {}

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
