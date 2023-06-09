package com.IIInnn.Base;

// 创建线程方式2: 实现runnable 接口，重写run 方法，执行线程需要丢入runnable 接口实现类，调用start方法。
public class TestThread03 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("run接口类的多线程执行" + i);
        }
    }

    public static void main(String[] args) {
        //创建runnable接口实现的类对象
        TestThread03 testThread03 = new TestThread03();
        //创建线程对象，通过线程对象来开启我们的线程，代理
        new Thread(testThread03).start();
        for (int i = 0; i < 200; i++) {
            System.out.println("main接口类的多线程执行" + i);
        }
    }
}
