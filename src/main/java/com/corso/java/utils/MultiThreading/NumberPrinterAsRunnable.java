package com.corso.java.utils.MultiThreading;


import static com.corso.java.utils.MultiThreading.ThreadNumberPrinter.L;

public class NumberPrinterAsRunnable implements Runnable {
    int min;
    int max;

    public NumberPrinterAsRunnable(int min, int max) {
        this.min = min;
        this.max = max;
    }
    public void run ()
    {
        for (int i = min; i <= max; i++)
            System.out.println(i);
    }
    public static void main(String[] args) throws InterruptedException{
        ThreadNumberPrinter threadNumberPrinter = new ThreadNumberPrinter(4,6);

                Thread currentThread = Thread.currentThread();
        currentThread.setName("thread corrente");
        currentThread.setPriority(1);
        currentThread.run();
        Thread.sleep(1000);

        Thread thread = new Thread(threadNumberPrinter);
        thread.setName("nostro-Thread-");
        thread.start();
        //metodo thread
        Thread.sleep(5000);
        //classe Thread
        L.info("done!");

    }
}
