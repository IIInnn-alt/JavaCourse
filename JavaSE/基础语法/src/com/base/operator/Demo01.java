package com.base.operator;

public class Demo01 {
    public static void main(String[] args) {
        //二元运算符
        int a = 10;
        int b = 20;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / (double) b); // 0.5
        System.out.println("====================================");

        long c = 121321321L;
        int d = 200;
        short e = 60;
        byte f = 10;
        double g = 21554.0;

        System.out.println(c + d + e + f); //long类型
        System.out.println(d + e + f); // int
        System.out.println(e + f);//int
        System.out.println(c+g); //double
    }
}
