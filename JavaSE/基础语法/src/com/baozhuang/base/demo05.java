package com.baozhuang.base;

public class demo05 {
    public static void main(String[] args) {
        //    this is my dogs
        //    变成数组
        String str = "this is my dogs";
        String[] str1 = str.split(" ");
        for (String s : str1) {
            System.out.println(s);
        }
        //    替换 dog 为 cat
        String str2 = str.replace("dogs", "cats");
        System.out.println(str2);
        //    首字母大写
        for (int i = 0; i < str1.length; i++) {
            System.out.println(i);
            char first = str1[i].charAt(0);
            char upperFirst = Character.toUpperCase(first);
            String firsts = String.valueOf(str1[i].charAt(0));
            String upperFirsts = firsts.toUpperCase();
            String news = upperFirst + str1[i].substring(1);
            System.out.println(news);
            System.out.println(upperFirsts + str1[i].substring(1));
        }
    }
}
