package com.oop.Aabstract;

//abstract 抽象     抽象类   单继承        接口可以多继承
public abstract class Demo01 {

    // abstract抽象方法    只有方法名字，没有方法的实现
    public static String name = "小";

    public abstract void add();

    public Demo01() {
        System.out.println("sss");
    }
    /*
     * 1.不能new 这个抽象类，只能靠子类去实现它:约束
     * 2.   抽象类可以写普通方法
     * 3.  抽象方法必须在抽象类里面
     * */

}
