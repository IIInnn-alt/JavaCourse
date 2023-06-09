package com.base.methods;

public class Demo04 {
    public static void main(String[] args) {
        printMax(36.1, 3456, 22.3, 102, 133.3);

    }

    /**
     *
     * @param numbers
     */
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("无效");
            return;
        }
        double result = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        System.out.println("最大值为 ：" + result);
    }

}
