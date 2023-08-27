package com.baozhuang.base;

import java.math.BigDecimal;

public class demo07 {
    public static void main(String[] args) {
        //    很多实际应用中需要精确运算，而double是近似值存储，不在符合要求，需要借助BigDecimal
        double num = 3.6;
        double num1 = 3.0;
        System.out.println(num - num1);
        System.out.println("===================");
        BigDecimal num2 = new BigDecimal("3.6");
        BigDecimal num3 = new BigDecimal("3.0");
        //减法
        BigDecimal r1 = num2.subtract(num3);
        System.out.println(r1);
        //加法
        BigDecimal r2 = num2.add(num3);
        System.out.println(r2);
        //乘法
        BigDecimal r3 = num2.multiply(num3);
        System.out.println(r3);
        //除法
        BigDecimal r4 = new BigDecimal("9.0").divide(new BigDecimal("3.0"));
        System.out.println(r4);
        BigDecimal r5 = new BigDecimal("10").divide(new BigDecimal("3"),2);
        System.out.println(r5);
    }
}
