package com.oop.neiBuLei;

public class AppMainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.age);
        person.say();

        //获取 Person中的内部类 PersonChild
        Person.PersonChild personChild = person.new PersonChild();
        personChild.say();
        personChild.getId();

        //同级类
        A a = new A();
        a.say();
    }
}
