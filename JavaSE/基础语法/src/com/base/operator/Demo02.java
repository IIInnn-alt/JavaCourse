package com.base.operator;

public class Demo02 {
    public static void main(String[] args) {
        //关系运算符返回的结果: 正确 错误 布尔值
        int a = 10;
        int b = 20;
        int c = 32;

        System.out.println(c % a); //取余数

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);

        //++ --
        int d = 3;
        int e = d++;  // d++  是 d先赋值给 e,所以e是3， 在 执行 d= d+1
        int f = ++d;  // ++d  是先执行 d=d+1 ,在赋值，，这里注意这里d是4，因为已经执行了 上一步的 d+1
        System.out.println("================");
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        // 幂运算  2的3次方
        double pow = Math.pow(2,3);
        System.out.println(pow);


    }
}
