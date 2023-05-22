package com.yash.concurrency;

public class CounterThread implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread - " + Thread.currentThread().getName());
    }
}
