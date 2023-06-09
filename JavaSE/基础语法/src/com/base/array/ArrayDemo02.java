package com.base.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //  数组循环
        int[] arrays = {1, 2, 3, 4, 5};
        // 求和
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }
        System.out.println(sum);
        System.out.println("=========================================");
        //求最大值    增强型的for循环
        int max = arrays[0]; // 默认
        for (int array : arrays) {
            if (array > max) {
                max = array;
            }
        }
        System.out.println(max);

        //调用方法
        printArray(arrays);

        System.out.println("=========================");

        // 调用反转数组的方法
        int[] newArray = reserve(arrays);
        printArray(newArray);
    }

    // 打印数组元素   int[] arrays 是形参
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
        }
    }

    // 反转数组
    public static int[] reserve(int[] arrays) {
        int[] result = new int[arrays.length]; //根据传入过来的数组， new一个新的数组
        for (int i = 0, j = result.length - 1; i < arrays.length; i++, j--) {
            result[j] = arrays[i];
        }
        return result;
    }
}
