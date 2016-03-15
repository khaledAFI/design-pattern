package com.klead.dp.creational.singleton;

/**
 * Created by kafi on 14/03/2016.
 */
public class ThreadSafeSingletonV2 {
    private static  ThreadSafeSingletonV2 instance ;

    private ThreadSafeSingletonV2() {}

    public static  ThreadSafeSingletonV2 getInstance() {
        if (instance == null) {
            synchronized(ThreadSafeSingletonV2.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingletonV2();
                }
            }
        }
        return instance;
    }
}
