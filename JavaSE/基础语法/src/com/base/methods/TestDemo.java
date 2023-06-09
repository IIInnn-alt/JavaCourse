package com.base.methods;

import java.util.Scanner;

public class TestDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个值");
        int num1 = scanner.nextInt();

        System.out.println("请输入运算符号");
        String operation = scanner.next();

        System.out.println("请输入第二个值");
        int num2 = scanner.nextInt();

        System.out.println(calc(num1, num2, operation));
        scanner.close();
    }

    public static <c> int calc(int a, int b, String value) {
        int calcValue = 0;
        switch (value) {
            case "+":
                calcValue = a + b;
                break;
            case "-":
                calcValue = a + b;
                break;
            case "*":
                calcValue = a + b;
                break;
            case "/":
                calcValue = a + b;
                break;
            default:
                System.out.println("运算符号无效");
                break;
        }
        return calcValue;
    }
}
