package com.oop.base;

public class Demo02 {
    public static void main(String[] args) {
        //调用静态
        add(1, 2);

        //调用非静态   实例化
        Demo02 demo02 = new Demo02();
        demo02.add1(1, 2);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public int add1(int a, int b) {
        return a + b;
    }
}
