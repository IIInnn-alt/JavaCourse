package com.base.scanner;

import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        //创建一个扫描器对象，Scanner   用于接收键盘数据  System.in
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用next方式接收:");
        //判断用户有没有输入字符串
        if (scanner.hasNext()) {
            //使用 next方式接收
            String str = scanner.next();
            System.out.println("输出的内容为:" + str);
        }

        //凡是属于IO流的类如果不关闭会一直占用资源
        scanner.close();
    }
}
