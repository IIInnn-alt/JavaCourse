package com.baozhuang.base;

public class demo06 {
    public static void main(String[] args) {
        //StringBuffer
        // StringBuffer str = new StringBuffer();
        // StringBuilder 的效率比String高 ，StringBuilder > StringBuffer。这主要是由于前者不需要考虑线程安全。
        // 一个可变的字符串类，我们可以把它看成是一个容器
        StringBuilder str = new StringBuilder();
        str.append("我想去运动");//追加
        System.out.println(str.toString());
        str.append("去游泳");
        System.out.println(str.toString());
        str.insert(0, "hello");
        System.out.println(str.toString());
        str.insert(5, "world");
        System.out.println(str.toString());
        str.replace(0, 5, "Hi");
        System.out.println(str.toString());
        str.delete(0, 2);
        System.out.println(str.toString());
        str.reverse();
        System.out.println(str.toString());

    }
}
