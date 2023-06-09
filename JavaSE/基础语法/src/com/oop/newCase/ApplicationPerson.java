package com.oop.newCase;

public class ApplicationPerson {
    public static void main(String[] args) {
        // 实例化一个对象
        Person person = new Person();
        System.out.println(person.name);

        // 重新 new 一个对象
        Person person1 = new Person("我是传入的参数");
        System.out.println(person1.name);

    }

}
