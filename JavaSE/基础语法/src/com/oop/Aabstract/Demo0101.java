package com.oop.Aabstract;



// 抽象类的所有方法，继承了它的子类，都必须实现它的方法~
public class Demo0101 extends Demo01 {

    @Override
    public void add() {    //重写
        System.out.println("sss");
    }

    public static void main(String[] args) {
        Demo0101 demo0101 = new Demo0101();
    }

}
