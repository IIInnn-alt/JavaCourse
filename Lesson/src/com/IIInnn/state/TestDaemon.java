package com.IIInnn.state;

//线程分为 用户线程和守护线程
//虚拟机必须确保用户线程执行完毕
//虚拟机 不用等待守护线程执行完毕
//如 后台记录操作日志，监控内存，垃圾回收等待
//守护线程
public class TestDaemon {
    public static void main(String[] args) {
        You you = new You();
        God God = new God();
        Thread thread = new Thread(God);
        thread.setDaemon(true);  //默认false 线程是用户线程， 正常线程都是用户线程
        thread.start();

        new Thread(you).start();
    }

}

class God implements Runnable{
    @Override
    public void run() {
        while (true){
            System.out.println("守护你");
        }
    }
}


class You implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 365; i++) {
            System.out.println("每天都开心"+i);
        }
        System.out.println("======================");
    }
}
