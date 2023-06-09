package com.base.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        float k = 20F;
        System.out.println("请输入整数：");
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
            System.out.println("输入的整数是：" + i);
        } else {
            System.out.println("输入的不是整数");
        }

        if (scanner.hasNextFloat()) {
            k = scanner.nextFloat();
            System.out.println("输入的小数是：" + k);
        } else {
            System.out.println("输入的不是小数");
        }

        scanner.close();
    }
}
