package com.oop.neiBuLei;

public class Person {
     int age = 12;

    void say() {
        System.out.println("外部类:hello");
    }

    class PersonChild {
        void say() {
            System.out.println("内部类:hello");
        }

        public void getId() {
            System.out.println(age);
        }
    }

}

class A {
    public void say() {
        System.out.println("A类：hello");
    }
}
