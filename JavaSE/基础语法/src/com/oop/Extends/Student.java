package com.oop.Extends;

//Student  is Person   学生继承了Person

// student 可以用Person 的属性和方法
public class Student extends Person {
    //ctrl+ H

    private String name = "JavaChildren";

    public void test(String name) {
        System.out.println(name); //传过来的
        System.out.println(this.name);//自己的
        System.out.println(super.name);//父级的
        
        super.add(name);
    }
}



/*
*在 AppMain 里面使用
*
* public static void main(String[] args) {
        Student student = new Student();
        student.test("Java");
    }
*
*
* */