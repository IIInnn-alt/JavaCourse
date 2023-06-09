package com.base.struct;

import java.util.Scanner;

public class SwitchDemo01 {
    //  case  穿透
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入等级");
        if (scanner.hasNextLine()) {
            String value = scanner.nextLine();
            switch (value) {
                case "A":
                    System.out.println("优秀");
                    break;
                case "B":
                    System.out.println("良好");
                    break;
                case "C":
                    System.out.println("及格");
                    break;
                case "D":
                    System.out.println("挂科");
                    break;
            }
        } else {

        }


    }
}
