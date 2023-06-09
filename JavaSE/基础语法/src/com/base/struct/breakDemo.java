package com.base.struct;

public class breakDemo {
    public static void main(String[] args) {
        // for (int i = 0; i < 100; i++) {
        //     System.out.println(i);
        //     if (i == 30) {
        //         break;  //退出本次循环
        //     }
        //     System.out.println("111");
        // }
        int j = 0;
        while (j < 100) {
            j++;
            if (j == 50) {
                continue; //退出 这个循环，依旧执行下次循环的判定
            }
            System.out.println(j);
        }
        System.out.println("111");


        //continue 用于终止某次循环过程，接着执行下次循环的判定

        // break 在任何循环语句的主体部分，均可用break控制循环的流程
        // break用于强行退出循环，不执行循环中剩余的语句。(break语句也在switch语句中使用)
    }
}
