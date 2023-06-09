package com.base.base;

public class demo03 {
    public static void main(String[] args) {
        //整数扩展:  进制  二进制0b 十进制  八进制0 十六进制0x
        int i = 10;
        float i123 = 10;
        int i2 = 010;  //八进制0
        int i3 = 0x10; // 十六进制
        System.out.println(i);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println("======================");
        //浮点数扩展  ？ 银行业务怎么表示钱   类 BigDecimal 数学工具类
        //float  有限 离散 舍入误差 大约  接近但不等于
        // 最好完全避免 使用浮点数进行比较
        // 最好完全避免 使用浮点数进行比较
        // 最好完全避免 使用浮点数进行比较
        float f = 0.1f;  //0.1
        double d = 1.0 / 10; //0.1
        System.out.println(f == d);//false
        float f1 = 121564564.121f;
        System.out.println("f1 = " + f1);
        double d1 = f1 + 1;
        System.out.println("d1 = " + d1);
        System.out.println(f1 == d1); //true  注意 舍入误差
        System.out.println("================");

        // 字符扩展 char

        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int) c1);  // 强制转换
        System.out.println(c2);
        System.out.println((int) c2);// 强制转换
        // 所有的字符 本质是 数字
        //编码 unicode 2字节   0-65536

        //转义字符
        // \t 制表符  \n 换行
        System.out.println("com.IIInnn.base.Hello\nWorld");
    }
}
