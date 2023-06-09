package com.base.struct;

public class TestDemo {
    //打印三角形
    // public static void main(String[] args) {
    //     for (int i = 1; i <= 5; i++) {
    //         for (int j = 5; j >= i; j--) {
    //             System.out.print(" ");
    //         }
    //         for (int j = 1; j <= i; j++) {
    //             System.out.print("*");
    //         }
    //         for (int j = 1; j < i; j++) {
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    // }
    
    public static void main(String[] args) {
        int rows = 5; // 三角形的行数

        for (int i = 1; i <= rows; i++) {
            // 打印空格，使三角形右对齐
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // 打印星号
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }

            System.out.println(); // 换行
        }
    }
}
