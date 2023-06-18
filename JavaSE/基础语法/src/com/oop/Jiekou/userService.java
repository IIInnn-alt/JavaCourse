package com.oop.Jiekou;

// interface 定义的关键字，接口都需要有实现类，
public interface userService {
    /*

        接口

    *   普通类：只有具体实现
    *   抽象类：具体实现 和 规范（抽象方法）都有!
    *   接口:只有规范！自己无法写方法~，专业的约束！   约束和实现分离:面向接口编程
    * */;

    public abstract void add();
    void del();
    void update();
    void query();


}


