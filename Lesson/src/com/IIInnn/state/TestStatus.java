package com.IIInnn.state;

//state
public class TestStatus {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("///////////////");
        });


        // 监听状态
        Thread.State state = thread.getState();
        System.out.println(state+"1");  //线程尚未开始。   new阶段

        //启动线程
        thread.start();
        state = thread.getState();
        System.out.println(state+"2");  //  java虚拟机执行的线程  RUNNABLE阶段


        //TERMINATED   终止线程的线程状态。线程已完成执行。
        while (state != Thread.State.TERMINATED) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            state = thread.getState();
            System.out.println(state+"3");

        }
    }
}
