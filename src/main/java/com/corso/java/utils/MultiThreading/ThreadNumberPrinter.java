package com.corso.java.utils.MultiThreading;

import com.corso.java.utils.Utils.Logger;


public class ThreadNumberPrinter extends Thread{

    static Logger L = Logger.getInstance();
    int min;
    int max;

    public ThreadNumberPrinter(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void run(){
        for(int i=min; i<max; i++){
            L.info("threadprinter " +String.valueOf(i));
        }
    }
}
