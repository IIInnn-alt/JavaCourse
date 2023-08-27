package com.baozhuang.base;

public class demo02 {
    public static void main(String[] args) {
        // 基本类型和字符串之间的转换
        // 基本类型 --> 字符串
        int num = 12;
        String s = num + "";
        String string = String.valueOf(num);
        String string1 = Integer.toString(num, 16);
        System.out.println(string1);
        System.out.println(string instanceof String);
        //字符串---> 基本类型
        String s1 = "105";
        int num1 = Integer.valueOf(s1);
        int num3 = Integer.parseInt(s1);
        System.out.println(num1);
        System.out.println(num3);
    }
}
