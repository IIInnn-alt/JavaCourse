package com.base.base;

// 类型转换
public class demo04 {
    public static void main(String[] args) {
        //类型顺序  byte,short,char-->int-->long---float-->double    低--高

        //强制转换   高---低       方式  （类型）值
        int i = 128;
        byte k = (byte) i;  //-128    内存溢出  byte类型最大值  Byte 127
        System.out.println(i);
        System.out.println(k);

        //自然转换  低---高

        int q = 128;
        double r = q;
        System.out.println(q);
        System.out.println(r);

        /*
         *   注意点:
         *   1. 不能对布尔值进行转换
         *   2.不能把对象类型转换为不相干的类型
         *   3.转换的时候可能存在内存溢出，或者精度问题
         * */
        System.out.println("============================");
        System.out.println((int) 23.7);
        System.out.println((int) -23.7f);

        System.out.println("============================");
        char o = 'a';
        int u = o + 1;
        System.out.println(u);
        System.out.println((char) u);  // 强转


        //操作比较大的数的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线 _分割
        int money = 10_0000_0000;
        System.out.println(money);
        int year = 20;
        System.out.println("year * money = " + year * money);
        int total = year * money;
        System.out.println(total);//-1474836480  计算溢出
        long total1 = year * money;
        System.out.println(total1);//-1474836480 ,  转换前已经存在问题了，默认是int类型
        /*
         在Java中，整数运算的结果默认是以整数类型表示的，即使将结果赋给了long类型的变量，也不会自动进行类型转换
        * year * money  两个都是int类型，结果为int类型，但是数据溢出了。
        *  需要将其中一个操作数转换为long类型
        *  强制类型转换时，需要确保转换是安全的，并且不会导致数据丢失或溢出。如果转换不安全，可能会导致不正确的结果
        * */
        long total2 = year * (long)money;  // 转换前，就强制转换为long类型
        System.out.println(total2);

    }
}
