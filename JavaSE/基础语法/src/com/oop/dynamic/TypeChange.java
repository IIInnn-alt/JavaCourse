package com.oop.dynamic;

//类型转换
public class TypeChange extends Parent {


/*
*   //    类型之间的转换
*     public static void main(String[] args) {
        Children children = new Children();

        // Parent类               低
        Parent parent = new Children();
        // Parent类型的parent对象，要转为Children类型.,就可以使用Children里的方法了

        ((Children) parent).eat();

        /*
        * 1.父类引用 指向子类的对象
        * 2.把子类转换为父类，向上转型；，可能会丢失自己的一些方法   （儿子偷用父亲的钱，可能丢失被抚养权）
        * 3.把父类装为子类，向下转型：强制转换
        * 4.方便方法的调用
        *
        * */
}

