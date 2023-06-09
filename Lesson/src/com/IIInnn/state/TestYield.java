package com.IIInnn.state;

//yield 线程礼让，不一定成功，cpu
public class TestYield implements Runnable {
    public static void main(String[] args) {
        TestYield testYield =  new TestYield();
        new Thread(testYield,"a").start();
        new Thread(testYield,"b").start();
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"开始线程");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"结束线程");
    }
}
