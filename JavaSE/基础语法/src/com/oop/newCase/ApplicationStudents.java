package com.oop.newCase;

public class ApplicationStudents {
    public static void main(String[] args) {
        //类   实例化
        //类实例化后产生个对象

        //xiaoming 、 xh 对象就是  Student类实例化出来的
        Students xiaoming = new Students();
        Students xh = new Students();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        System.out.println(xiaoming.name + '\t' + xiaoming.age);
        System.out.println(xh.name);
    }

}
