package com.base.methods;

public class Demo01 {

    //main 方法
    public static void main(String[] args) {
        int add = add(1, 2);
        System.out.println(add);
        int max = max(10, 20);
        System.out.println(max);
    }

    public static int add(int a, int b) {
        return a + b;
    }

    /*
     *   方法 语法
     *   修饰符  返回值类型  方法名 （参数类型 参数）{   方法体   }
     *   修饰符 这是可选的，告诉编译器如何调取该方法，定义了该方法的访问类型
     *   返回值类型: 方法可能会返回值， returnValuetype 是方法返回值的数据类型。有些方法执行所需要的操作，但是没有返回值，在这种情况下，returnValueType 是关键字void
     *
     *   方法的重载的规则:
     *      1.方法名称必须相同，
     *      2.参数列表必须不同，（个数不同，或者类型不同，参数排列顺序不同等）
     *      3.方法的返回的类型可以相同也可以不相同
     *      4.仅仅返回类型不同不足以成为方法的重载
     *
     * */

    public static int max(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else if (a < b) {
            result = b;
        } else {
            result = 0;
        }
        return result;
    }
}
