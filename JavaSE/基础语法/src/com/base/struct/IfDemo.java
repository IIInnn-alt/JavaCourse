package com.base.struct;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入：");
        String s = scanner.nextLine();
        // equals 判断字符串值是否相等
        if (s.equals("Hello")) {
            System.out.println("ok");
        }
        System.out.println("end");
        scanner.close();
    }
}
