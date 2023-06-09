package com.IIInnn.Base;

import javax.xml.namespace.QName;

// 多个线程可以调用同一个对象       会出现并发问题
public class TestThread04 implements Runnable {

    private int tick = 10;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (tick <= 0) {
                break;
            }

            System.out.println(Thread.currentThread().getName() + "拿到了第" + tick-- + "票");
        }
    }

    public static void main(String[] args) {
        TestThread04 t1 = new TestThread04();
        new Thread(t1, "小明").start();
        new Thread(t1,"小红").start();
        new Thread(t1,"小白").start();
    }
}
