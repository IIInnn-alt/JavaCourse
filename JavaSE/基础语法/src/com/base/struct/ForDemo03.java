package com.base.struct;

//九九乘法表
public class ForDemo03 {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "\t");
//                if (j == i) {
//                    System.out.println();
//                }
            }
            //换行
            System.out.println();
        }
    }
}
