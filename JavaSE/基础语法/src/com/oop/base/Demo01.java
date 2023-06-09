package com.oop.base;

public class Demo01 {
    //面向对象  编程的本质就是 :以类的方式组织代码， 以对象的组织(封装)数据
    //三大特性 封装、继承、多态

    //复习
    public static void main(String[] args) {
        System.out.println(hello());
    }
    // 方法的定义  修饰符  返回类型  break 方法名   参数列表   异常抛出
    public static String hello() {
        return "Hello World";
    }

    // static 静态方法       如果在其他类里面，调用静态方法  类名.方法
    // 非静态方法          在其他类里面调用，   实例化这个类  new   比如  在demo01类里面调用 demo02的方法,demo02 名字 =  new demo02() ,名字.方法名
    // 方法的调用 :递归

}
