package com.oop.FengZhuang;

public class ApplicationStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getName());
        s1.setAge(-1);
        System.out.println(s1.getAge());
    }

}
