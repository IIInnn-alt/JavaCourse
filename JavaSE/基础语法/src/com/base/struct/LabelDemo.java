package com.base.struct;

public class LabelDemo {
    public static void main(String[] args) {
        //   打印101-150之间所有的质数
        //   质数是指大于1的自然数中，除了1和它本身以外不再有其他因数的自然数
        int count = 0;
        // 定义 outer标签
        outer:for (int i = 101; i < 150; i++) {
            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    continue outer;
                }
            }
            System.out.println(i);
        }


    }
}
