package com.IIInnn.state;

// 测试线程的优先级
public class TestPriority {

    public static void main(String[] args) {
        //主程序默认优先级
        System.out.println(Thread.currentThread().getName() + "======" + Thread.currentThread().getPriority());


        priority priority = new priority();
        Thread t1 = new Thread(priority);
        Thread t2 = new Thread(priority);
        Thread t3 = new Thread(priority);
        Thread t4 = new Thread(priority);
        Thread t5 = new Thread(priority);
        Thread t6 = new Thread(priority);
        //先设置优先级，再启动
        t1.start();


        t2.setPriority(1);
        t2.start();

        t3.setPriority(4);
        t3.start();

        t4.setPriority(Thread.MAX_PRIORITY);  // 10
        t4.start();


        t5.setPriority(7);
        t5.start();

        t6.setPriority(6);
        t6.start();


    }


}

class priority implements Runnable {
    @Override
    public void run() {
        //  getPriority 获取优先级
        System.out.println(Thread.currentThread().getName() + "======" + Thread.currentThread().getPriority());
    }
}
