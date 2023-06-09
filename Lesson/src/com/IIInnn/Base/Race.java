package com.IIInnn.Base;

// 龟兔赛跑
public class Race implements Runnable {
    private static String winner;

    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            Boolean flag = isWin(i);
            if (flag) {
                break;
            }
            System.out.println(Thread.currentThread().getName() + "跑了" + i + "步");
        }

    }

    private Boolean isWin(int step) {
        if (winner != null) {  //有胜利者
            return true;
        } else {
            if (step == 100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner是" + winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();

        new Thread(race,"兔子").start();
        new Thread(race,"乌龟").start();
    }
}
