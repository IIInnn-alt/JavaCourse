package com.base.scanner;

import java.util.Scanner;

// 计算输入的数字个数，并求其总和与平均数，没输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double m = 0; // 和
        int i = 0; //  个数

        while (scanner.hasNextDouble()) {
            double x = scanner.nextDouble();
            i++;
            m += x;
            System.out.println("当前输入的个数是：" + i + " 输入值为" + x);
        }

        System.out.println("数量是：" + i + " 平均值为" + m / i);


        scanner.close();
    }
}
