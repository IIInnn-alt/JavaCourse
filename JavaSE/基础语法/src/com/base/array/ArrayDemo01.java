package com.base.array;

public class ArrayDemo01 {
    public static void main(String[] args) {
        // 数组语法
        // dataType[] arrayRefVar= new dataType[arraySize]
        //  数组的特点 ：
        /*
        *   其长度是确定的，数组一旦被创建，它的大小就是不可以改变的
        *   其元素必须是相同类型，不允许出现混合类型
        *   数组中的元素可以是任何数据类型，包括基本类型和引用类型
        *   数组变量属引用类型，数组也可以看成是对象，数组中的每个元素相当于该对象的成员变量
        *   数组本身就是对象，Java中对象是在 堆中的，因此数组无论保存原始类型还是其他对象类型，数组对象本身是在堆中的
        *
        * */



        int[] nums = new int[10];

        //数组赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;

        //计算数组的和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println(sum);

    }
}
