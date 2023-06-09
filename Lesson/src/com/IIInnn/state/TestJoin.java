package com.IIInnn.state;

//join 合并线程，待此线程执行完成后，在执行其他线程，其他线程堵塞     可以理解为插队
public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.println("run方法" + i);
        }
    }

    public static void main(String[] args) {
        TestJoin testJoin = new TestJoin();
        Thread thread = new Thread(testJoin);
        thread.start();
//        new Thread(testJoin).start();
        for (int i = 0; i < 200; i++) {
            if (i == 100) {
                try {
                    thread.join();//main线程堵塞
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("main方法" + i);
        }
    }
}
