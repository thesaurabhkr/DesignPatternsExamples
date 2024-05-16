package org.example.creational.Singleton;

public class Singleton {
    // The singleton instance is null if not instantiated
    private static Singleton singletonInstance = null;

    private Singleton() {
    }

    // Lazy creation of object
    public static Singleton getInstance() {
        if(singletonInstance == null) {
            singletonInstance = new Singleton();
        }
        return singletonInstance;
    }
}
