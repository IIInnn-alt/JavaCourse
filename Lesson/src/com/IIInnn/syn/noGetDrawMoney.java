package com.IIInnn.syn;

// 取钱案例

public class noGetDrawMoney {
}

//账户
class Account {
    int money;//银行卡的余额
    String name;//银行卡的卡号

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}

//银行
class drawing extends Thread {
    Account account;  //账户
    int drawMoney;//取了多少钱
    int nowMoney; // 手里有的钱

    public drawing(Account account, int drawMoney, int nowMoney) {
        this.account = account;
        this.drawMoney = drawMoney;
        this.nowMoney = nowMoney;
    }

    @Override
    public void run() {   //重写方法  执行
        if (account.money - drawMoney < 0) {
            System.out.println(Thread.currentThread().getName() + "的余额不足");
            return;
        }
        //银行卡的余额
        account.money = account.money - drawMoney;
        nowMoney = nowMoney + drawMoney;
    }
}
