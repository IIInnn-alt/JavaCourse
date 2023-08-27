package com.baozhuang.base;

public class demo01 {
    public static void main(String[] args) {
        //类型转换，装箱，基本数据类型转成引用数据类型
        int num = 10;
        Integer integer = new Integer(num);
        Integer integer1 = Integer.valueOf(num);
        System.out.println(integer);
        System.out.println(integer1);

        // 类型转换 拆箱,引用数据类型转成基本数据类型
        Integer integer2 = new Integer(100);
        int num2 = integer2.intValue();
        //    ------------------------------
        //JDK1.5之后提供自动装箱和拆箱
        int num3 = 50;
        Integer integer3 = num3;
        int num4 = integer3;
    }
}
