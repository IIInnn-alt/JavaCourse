package com.base.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //用while 或者 for 循环输出 1-1000之间能被5整除的数，并且每行输出3个

        for (int i = 1; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }
            if (i % (5 * 3) == 0) {
                System.out.println();
                System.out.print("\n");
            }
            //   System.out.println();  输出完全换行
            //   System.out.print();   //输出完不会换行
        }
    }
}
