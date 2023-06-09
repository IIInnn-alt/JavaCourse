package com.base.methods;

// 递归 思想
public class Demo03 {
    public static void main(String[] args) {
        System.out.println(f(5));
    }

    public static int f(int a) {
        if (a == 1) {
            return 1;
        } else {
            return a * f(a - 1);
        }
    }
}
