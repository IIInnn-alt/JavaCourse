package com.base.methods;

public class Demo02 {
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        demo02.test(1, 2, 3, 4);
    }
    // 可变参数
    public void test(int... i) {  //...只能有一个形参，本质上这个形参是 数组  ，  int... i，int... i2，是错误的
        System.out.println(i[0]);
    }
}
