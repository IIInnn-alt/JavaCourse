package com.baozhuang.base;

public class demo03 {
    public static void main(String[] args) {
        //整数缓存区
        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer1 == integer2); //false
        //    引用类型的值存放在 堆中，是地址。

        Integer integer3 = Integer.valueOf(100);
        Integer integer4 = Integer.valueOf(100);
        System.out.println(integer3 == integer4); //true

        Integer integer5 = Integer.valueOf(200);
        Integer integer6 = Integer.valueOf(200);
        System.out.println(integer5 == integer6); //false
        // 缓存 -128 -127之间
        // 超出 return new Integer(i);


    }
}
