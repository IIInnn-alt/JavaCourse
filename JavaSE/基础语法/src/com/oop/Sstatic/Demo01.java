package com.oop.Sstatic;

public class Demo01 {
    //static   是和类一起加载的
    // private 私有的修饰符  自己的类里用
    private static int age = 10; //静态变量
    private String name = "Java"; //非静态变量


    public static void main(String[] args) {
        //创建实例
        Demo01 demo01 = new Demo01();

        // 也可以通过 Demo01来访问， age 是 类变量
        System.out.println(Demo01.age);
        System.out.println(age);
//        System.out.println(Demo01.name);

        System.out.println(demo01.age);
        System.out.println(demo01.name);

    }
}
