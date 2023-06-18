package com.oop.againLoad;

public class Children extends Parent {
    // public static void test() {
    //     System.out.println("Children");
    // }

    // public void test1() {
    //     System.out.println("Children");
    // }


    //alt + Insert 重写方法 @
    @Override //注解有功能的注释
    // 重写 修饰符是 public
    public void test1() {
        // super.test1();
        System.out.println("Children");
    }

    // public void test2() {
    //     System.out.println("test2.Children");
    // }
}


/*
*    public static void main(String[] args) {
        Children children = new Children();
        children.test();
        Parent Parent = new Children();
        Parent.test();
    }

    /*
     *  静态方法: 方法的调用只和左边的类，定义的数据类型一样
     *  非静态方法: 重写
     *
     * 重写的定义：
     * 1.方法名必须相同，
     * 2.参数列表必须相同，
     * 3.修饰符：范围可以扩大，但不能缩小: public>Protected>Default>private
     * 4.抛出的异常:范围，可以被缩小，但不能扩大：ClassNotFoundException<Exception
     *
     *
     *   重写和 重载的区别
     *   重写：方法名和参数 修饰符都一样，实现过程随意
     *   重载：方法名相同，参数必须不同
     * */

// private修饰，只能本类内访问，所以不能在其他类中使用，更别说重写
