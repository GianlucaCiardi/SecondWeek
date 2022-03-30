package com.corso.java.utils.MultiThreading;


import com.corso.java.utils.Utils.LOG;

public class Test {



    public static void main(String[] args) throws InterruptedException {

        LOG L = LOG.getInstance();

        ThreadNumberPrinter t = new ThreadNumberPrinter(1,10);
        NumberPrinterAsRunnable n = new NumberPrinterAsRunnable(20,30);

        //Thread tn = new Thread(n);
        //tn.start();

        t.start();
        t.join();
        n.run();
        //L.info("Fatto!");




        System.out.println("fatto!");

    }
}

