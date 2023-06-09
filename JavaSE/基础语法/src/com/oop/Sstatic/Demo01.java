package com.oop.Sstatic;

public class Demo01 {
    //static   是和类一起加载的
    // private 私有的修饰符  自己的类里用
    private static int age = 10;
    private String name = "Java";


    public static void main(String[] args) {
        //创建实例
        Demo01 demo01 = new Demo01();


        System.out.println(Demo01.age);
//        System.out.println(Demo01.name);

        System.out.println(demo01.age);
        System.out.println(demo01.name);

    }
}
