package com.base.operator;

public class Dmoe03 {
    public static void main(String[] args) {
        //逻辑运算符  && || !
        boolean a = true;
        boolean b = false;

        System.out.println(a && b); //两者同时为true，才为true
        System.out.println(a || b); //两者又一个为true,就为true
        System.out.println(!a);   //取非

        System.out.println("=========================");

        //位运算     同位进行比较
        /*
        *  A= 0100 1010
        *  B= 1010 1100
        *
        *   A&B = 0000 1000    //同位进行比较  and 都为 1才是1，否则为0
        *   A|B = 1110 1110    //同位进行比较  or 只要有一个1，就是1
        *   A^b = 1110 0110    //同位进行比较    两数相同为0，不相同为10
        *   ~B = 0101 0011     //对值进行取反
        *
        *
        *   <<  *2  左移
        *   >>  /2  右移
        *
        *  2 * 2*2*2
        * */
        System.out.println(2<<3);


    }
}
