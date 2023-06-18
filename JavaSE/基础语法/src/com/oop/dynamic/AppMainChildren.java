package com.oop.dynamic;

public class AppMainChildren {
    public static void main(String[] args) {
        Children children = new Children();

        // 父类类型 Parent 的引用指向 子类对象 new Children()
        //
        Parent parent = new Children();

        System.out.println(parent instanceof Children);
        /*
            编译器只会检查编译时类型所拥有的。
        *   Parent 类型中没有eat方法,报错。
        * */
        // parent.eat();
        ((Children) parent).eat();


        children.eat();
    }
}
