package com.baozhuang.base;

import java.util.Arrays;

public class demo04 {
    String name = "222";

    public demo04() {
        this.name = "xxxx";
    }

    public static void main(String[] args) {
        demo04 demo04 = new demo04();
        System.out.println(demo04.name);
        System.out.println("=======================");
        String name = "hello";
        name = "zhang";
        String name1 = "zhang";
        System.out.println(name);
        System.out.println(name1);
        System.out.println("=================");
        String str = new String("hello world");
        String str1 = new String("hello world");
        System.out.println(str == str1);//栈中存放的是 指针，指向对象在堆中的内存地址
        System.out.println(str.equals(str1));
        System.out.println("字符串方法使用=================");
        // length() 返回字符串长度
        // charAt(int index) 返回某个位置的字符
        // contains(String str) 判断是否包含某个字符串
        String string = "hello world";
        System.out.println(string.length());
        System.out.println(string.charAt(6));
        System.out.println(string.contains("llo w"));
        //    toCharArray() 返回字符串对应的数组
        //    indexOf() 返回字符串首次出现的位置
        //    lastIndexOf() 返回字符串最后一次出现的位置
        System.out.println(Arrays.toString(string.toCharArray()));
        System.out.println(str.indexOf("l", 6));
        System.out.println(str.lastIndexOf("l"));
        //    trim() 去掉字符串的前后空格
        //    toUpperCase() 把小写转成大写 toLowerCase把大写转成小写
        //    endWith(str) 判断是否以str 结尾， startWith判断是否以str开头
        String string1 = "  hello World   ";
        System.out.println(string1.trim());
        System.out.println(string1.toUpperCase());
        System.out.println(string1.endsWith("ld"));
        System.out.println(string1.startsWith("hello"));
        //    replace（char old,char new） 用新的字符串替换旧的字符串
        //    split()对字符串进行拆分
        String string2 = "Java";
        System.out.println(string2.replace("Java", "php"));
        String string3 = "Java is the bset language,php";
        String[] arr = string3.split(" ", 2);
        String[] arr1 = string3.split("[ ,]+");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        //    equals、compareTo 比较大小
        String name2 = "hello";
        String name3 = "HELLO";
        System.out.println(name2.equals(name3));
        System.out.println(name2.equalsIgnoreCase(name3));
        System.out.println(name2.compareTo(name3));


    }
}
