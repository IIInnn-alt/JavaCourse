package com.IIInnn.Base;

// 进程 ---》线程
/*
*   创建线程方式一:继承Thread类，重写run()方法，调用 start开启线程
* 总结：注意线程的开启不一定立即执行，由CPU调度执行
*
* */
public class TestThread01 extends Thread {
    public void run() {
        //run 方法体
        for (int i = 0; i < 100; i++) {
            System.out.println("run方法" + i);
        }
    }


    public static void main(String[] args) {
        //main线程，主线程

        //创建一个线程对象
        TestThread01 testThread01 = new TestThread01();
        //调用start()方法开始线程
        testThread01.start();


        for (int i = 0; i < 300; i++) {
            System.out.println("main方法" + i);
        }
    }
}
