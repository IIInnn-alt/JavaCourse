package com.jihe.base;

import java.util.ArrayList;
import java.util.Collection;

public class demo01 {
    public static void main(String[] args) {
        //Collection集合
        Collection collection = new ArrayList(); // 多态，父类的引用指向子类的对象
        //添加
        System.out.println("--------添加---------");
        collection.add("A");
        collection.add("B");
        collection.add("C");
        System.out.println(collection.size());
        System.out.println(collection);
        //    删除
        System.out.println("--------删除---------");
        collection.remove("C");
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
    //
    }
}
