package com.IIInnn.state;

// 测试stop
//1.建议线程正常停止 --->利用次数，不建议死循环
//2.建议使用标志位 ---> 设置一个标志位
//3. 不要使用stop 或者destroy 等过时或者JDK不建议使用的方法
public class TestStop implements Runnable {
    private Boolean flag = true;

    @Override
    public void run() {
        int i = 0;
        while (flag) {
            System.out.println("run方法执行" + i++);
        }
    }

    public void stop() {
        this.flag = false;
    }

    public static void main(String[] args) {
        TestStop testStop = new TestStop();
        new Thread(testStop).start();
        for (int i = 0; i < 1000000; i++) {
            if (i == 500000) {
                testStop.stop();
                System.out.println("线程该停止了 ");
            }
        }
    }
}
