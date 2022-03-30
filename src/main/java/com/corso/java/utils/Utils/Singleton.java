package com.corso.java.utils.Utils;

public class Singleton {
    public static Singleton instance = null;

    private Singleton(){}

    public static Singleton getInstance() {
        if(instance==null){
            instance = new Singleton();
        }
        return new Singleton();
    }
}
