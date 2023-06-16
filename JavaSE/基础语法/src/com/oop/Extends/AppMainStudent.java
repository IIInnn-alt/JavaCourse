package com.oop.Extends;

public class AppMainStudent {
    public static void main(String[] args) {
        //创建 student 实例
        Student student = new Student();
        //say() 方法是 student 继承 Person中的方法
        student.say();
        student.test("我调用了");
    }
}
