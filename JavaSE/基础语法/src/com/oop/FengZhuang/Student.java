package com.oop.FengZhuang;

public class Student {
    //private  私有

    // 属性私有 在 ApplicationStudent 类中，实例一个对象，是打印不出私有的属性的
    private String name;
    private int id;
    private char sex; //性别
    private int age;


    //提供一些可以操作的这些私有属性的方法   get set

    // 构造器 初始化实例

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public String getName() {
    //     return this.name;
    // }
    //
    // public void setName(String name) {
    //     this.name = name;
    // }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 100 || age < 0) {
            this.age = 3;
        } else {
            this.age = age;
        }

    }
}



/*  AppMain
* public abstract class AppMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Java");
        System.out.println(s1.getName());

        s1.setAge(88);
        System.out.println(s1.getAge());
    }
}
*
*
*
*
* */