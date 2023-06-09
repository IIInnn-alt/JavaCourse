package com.base.array;


public class ArrayDemo03 {
    public static void main(String[] args) {
        //[4][2]   多维数组
        /*    1,2  array[0]
         *    2,3  array[1]
         *    3,4  array[2]
         *    4,5  array[3]
         * */
        int[][] array = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);
            }
        }

    }
}
