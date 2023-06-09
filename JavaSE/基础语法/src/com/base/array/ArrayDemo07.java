package com.base.array;

import java.util.Arrays;

public class ArrayDemo07 {
    //稀疏数组
    public static void main(String[] args) {
        //
        int[][] array = new int[11][11];  //0 代表没有  1代表白棋  2代表黑棋
        array[1][2] = 1;
        array[2][3] = 2;

        for (int[] anInt : array) {
            for (int i : anInt) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }

        //转换为稀疏数组保存
        //获取有效值的个数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (array[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum+"sum");
        //创建稀疏数组
        int[][] array2 = new int[sum + 1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        //压缩数组
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    count++;
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array[i][j];
                }
            }
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0] + "\t" + array2[i][1] + "\t" + array2[i][2] + "\t");
        }
        System.out.println("===========================");
        // 还原稀疏数组
        int[][] array3 = new int[array2[0][0]][array2[0][1]];
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        for (int[] anInt : array3) {
            for (int i : anInt) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }
}
