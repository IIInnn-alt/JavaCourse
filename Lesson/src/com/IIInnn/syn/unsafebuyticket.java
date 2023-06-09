package com.IIInnn.syn;

//不安全买票
public class unsafebuyticket {
    public static void main(String[] args) {
        buyTicket buyTicket = new buyTicket();
        new Thread(buyTicket, "小明").start();
        new Thread(buyTicket, "小白").start();
        new Thread(buyTicket, "小蓝").start();
    }


}

class buyTicket implements Runnable {

    private int ticketNum = 10;
    private boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            buy();
        }
    }

    private void buy() {
        //没有票
        if (ticketNum <= 0) {
            flag = false;
            return;
        }
        // 延时
        try {
            Thread.sleep(600);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + "抢到票" + ticketNum--);
    }
}
