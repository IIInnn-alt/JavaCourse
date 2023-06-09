package com.oop;

import com.oop.Extends.Student;
import com.oop.Scope.Demo01;
import com.oop.dynamic.Children;
import com.oop.dynamic.Parent;
import com.oop.newCase.Person;
import com.oop.newCase.Students;


//规范:  一个项目最好只有一个main方法
public abstract class AppMain {

    public static void main(String[] args) {
        Demo01 demo01 = new Demo01();
        demo01.add();
        //通过外部类来实例化 内部的类
        Demo01.Demo0101 demo0101 = demo01.new Demo0101();
        demo0101.add01();
    }

}
