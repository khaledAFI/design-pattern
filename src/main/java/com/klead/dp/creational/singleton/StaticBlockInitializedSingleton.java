package com.klead.dp.creational.singleton;

/**
 * Created by kafi on 14/03/2016.
 */
public class StaticBlockInitializedSingleton {
    private static StaticBlockInitializedSingleton instance;

    private StaticBlockInitializedSingleton() {
    }

    static {
        try {
            instance = new StaticBlockInitializedSingleton();
        } catch (Throwable t) {
            throw new RuntimeException("Error initializing the instance");
        }
    }

    public static StaticBlockInitializedSingleton getInstance() {
        return instance;
    }

}
