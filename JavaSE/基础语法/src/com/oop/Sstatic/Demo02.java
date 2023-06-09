package com.oop.Sstatic;

public class Demo02 {
    //代码块

    { //赋初始值
        System.out.println("匿名代码块");
    }

    static {
        System.out.println("静态代码块");  //和类一起加载,执行一次
    }

    public Demo02() {
        System.out.println("构造函数");
    }

    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();

    }
}
