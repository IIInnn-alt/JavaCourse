package com.base.scanner;

import java.util.Scanner;

public class Demo02 {
    public static void main(String[] args) {
        //创建一个扫描对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextline方式接收:");
        if (scanner.hasNextLine()) {
            String str = scanner.nextLine();
            System.out.println("输出的内容为 :" + str);
        }
        //凡是属于IO流的类如果不关闭会一直占用资源
        scanner.close();
    }
}
