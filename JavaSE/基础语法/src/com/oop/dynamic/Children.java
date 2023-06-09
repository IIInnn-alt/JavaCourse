package com.oop.dynamic;

public class Children extends Parent {
    @Override
    public void run() {
        System.out.println("Children.run");
    }

    public void eat() {
        System.out.println("Children.eat");
    }

    /*
     * 多态注意事项
     * 1.多态是方法的多态，属性没有多态
     * 2.父类和子类，有联系 类型转换异常！ ClassCastException!
     * 3.存在的条件: 继承关系，方法需要重写，父类引用指向子类的对象！
     *
     * // 哪些方法不需要重写，
     * 1.static 方法，属于类，它不属于实例
     * 2. final 常量
     * 3.private方法
     * */

    /*
    *
    * public static void main(String[] args) {

        //一个对象的实际类型是确定的
        //new Children();
        //new Parent();

        //可以指向的引用类型就不确定了：父类的引用指向子类
        //

        //    Children能调用的方法都是自己的或者继承父类的
        Children c1 = new Children();
        //Parent父类型，可以指向子类但是不能调用子类独有的方法
        Parent c2 = new Children();
        Object c3 = new Children();

        c2.run();// 重写修改了Parent.run方法，走Children里的run
        c1.run();

        c1.eat();
        //
        ((Children) c2).eat(); //Parent里面没有eat(),需要进行强制类型转换

        // 类型 Object>Parent>children

        System.out.println(c3 instanceof Children);
        System.out.println(c3 instanceof Parent);
        System.out.println(c3 instanceof Object);

        System.out.println("==============");

        System.out.println(c2 instanceof Children);
        System.out.println(c2 instanceof Parent);
        System.out.println(c2 instanceof Object);
    }
    *
    * */
}
