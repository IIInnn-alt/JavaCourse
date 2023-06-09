package com.base.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        // for循环语句是支持迭代的一种通用结构，是最有效，最灵活的循环结构

        //计算0-100之间的奇数和偶数的和
        int oddSum = 0;  //奇数
        int evenSum = 0; //偶数
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            } else {
                evenSum += i;
            }
        }
        System.out.println("奇数和是:" + oddSum + " 偶数和是:" + evenSum);
    }
}
