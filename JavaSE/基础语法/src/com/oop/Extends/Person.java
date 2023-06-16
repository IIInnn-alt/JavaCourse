package com.oop.Extends;


// 在Java中，所有的类都默认直接或者间接继承 Object  ctrl + H
public class Person {
    //继成
    /*
     *  继承的本质是对某一批类的抽象，从而实现对现实世界更好的建模
     *   extands的意思 扩展
     *
     *   JAVA中类只有单继承，没有多继承
     *   继承是类和类之间的一种关系，除此之外，类和类之间的关系还有依赖、组合、聚合等
     *   继承关系的两个类，一个为子类(派生类)，一个为父类（基类）。子类继承父类，
     * 使用关键字extands来表示，
     *
     * super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。private私有的，不可调用
     * super和this 不能同时调用构造方法;
     *
       this关键字：指向自己的引用。
     *
     * */

    // public  private  protected

    private int money = 1000_000;

    public void say() {
        System.out.println("say方法");
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
//    ==============================


    protected String name = "JavaParent";

    public void add(String name) {
        System.out.println(name+"aaa");
    }

}




