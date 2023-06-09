package com.oop.base;

//值传递
public class Demo03 {
    public static void main(String[] args) {
        int a = 0;
        System.out.println(a);
        change(a);
        System.out.println(a);
    }

    public static void change(int a) {
        a = 10;
    }
}
