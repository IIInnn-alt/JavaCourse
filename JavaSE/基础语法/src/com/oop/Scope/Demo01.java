package com.oop.Scope;

// 内部和外部 作用域
public class Demo01 {
    public void add() {
        System.out.println("外部类的方法");
    }

    private int num = 10;


    public class Demo0101 {
        public void add01() {
            System.out.println("内部类的方法");
        }

        //获取外部类私有属性
        public void get() {
            System.out.println(num);
        }
    }

}
