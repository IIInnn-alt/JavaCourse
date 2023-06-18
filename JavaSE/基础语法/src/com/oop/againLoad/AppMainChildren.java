package com.oop.againLoad;

public class AppMainChildren {
    public static void main(String[] args) {

        // 创建 children类
        Children children = new Children();
        // children.test(); // children类
        children.test1();

        //方法的调用的 只和左边，定义的数据类型有关 ,左边数据类型为 Parent
        // 父类的引用 指向了子类
        Parent parent = new Children();
        // parent.test(); // Parent类
        //重写
        parent.test1();

        // test2 在父类中存在， children类继承了Parent,其中也有此test2方法。如果在children中有个一样的 方法名、参数，test2。就会执行该test2
        // 就是重写，有点执行顺序的 从上到下
        parent.test2();
    }
    
}
