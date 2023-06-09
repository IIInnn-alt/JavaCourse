package com.base.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {

        // 冒泡排序
        int[] array = {1, 6, 4, 86, 2, 54, 3, 565, 461, 2, 2};
        int[] sort = sort(array);
        System.out.println(Arrays.toString(sort));
    }

    public static int[] sort(int[] array) {
        //   array.length - 1   无需跟自己比较
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;  //通过flag标识减少没有意义的比较
            //内层循环，比较判断两个数，如果第二个数比第一个数大，交换位置
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j + 1] < array[j]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
