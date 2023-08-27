package com.exception;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        Demo02 demo02 = new Demo02();
        try {
            demo02.test(1, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void test(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException(); //主动抛出异常，一般在方法中使用
        } else {
            System.out.println("b为" + b);
        }
    }
}
