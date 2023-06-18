package com.exception;

// 抛出异常
public class Demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {   //catch(想要捕获的异常类型！   最高的是 Throwable)
            System.out.println("程序异常，变量b不能为0");
        } finally {
            System.out.println("finally");
        }

        // ctrl +alt +t
        try {
            System.out.println("ss");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
