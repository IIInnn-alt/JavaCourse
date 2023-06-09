package com.base.struct;

public class WhileDemo01 {
    //计算 1+2+3+。。。+100
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum);

        //while  先判断在去执行
        // do while   先执行一次 在去判断条件
        /*
        *   do{
        *
        *   }while()
        * */
    }
}
