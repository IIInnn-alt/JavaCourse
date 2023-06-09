package com.base.base;

//变量 和变量作用域
public class demo05 {

    // 1.类变量 static
    static double salary = 2500;

    //4.常量 final定义常量 值不可更改,     final  变量类型  变量名（大写） = 值
    // final static   double PI = 3.14;   修饰符不存在先后顺序
    static final double PI = 3.14;

    //属性：变量

    //2.实例变量：从属于对象：如果不自行初始化，这个类型的默认值   布尔值默认false,除基本数据类型外，默认值都是null
    public String cname = "中文";
    String name = "java";
    int age = 20;


    //main方法
    public static void main(String[] args) {
        //3.局部变量:必须声明和初始化值
        // 变量类型  变量名  =  值
        int a = 1;
        double f = 200;

        //2.打印实例变量 变量类型也可自定义  com.IIInnn.base.demo05-- 变量类型    demo==变量名   new com.IIInnn.base.demo05()---实例
        demo05 demo = new demo05();
        // 类变量
        System.out.println(demo.salary);

        System.out.println(demo.age);
        System.out.println(demo.cname);
        System.out.println(demo.name);

        //1.类变量 static，可以直接打印
        System.out.println(salary);

        //4.常量
        System.out.println(PI);
    }
}
