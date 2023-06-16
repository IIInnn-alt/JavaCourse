package com.oop.base;

//引用类型传递
public class Demo04 {
    public static void main(String[] args) {
        Person person = new Person("zh");
        System.out.println(person.name);
        change(person);
        System.out.println(person.name);
    }

    public static void change(Person person) {
        person.name = "Java学习";
    }
}

