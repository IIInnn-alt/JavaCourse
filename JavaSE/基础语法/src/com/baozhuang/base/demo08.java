package com.baozhuang.base;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo08 {
    public static void main(String[] args) throws Exception {
        //时间
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.toLocaleString());
        // 前一天
        Date date1 = new Date(date.getTime() - 1000 * 60 * 60 * 24);
        System.out.println("前一天" + date1);
        // after before
        Boolean b1 = date.after(date1);
        System.out.println(b1);
        // compareTO
        int d = date.compareTo(date1);
        System.out.println(d);
        // equals 比较相等
        Boolean b2 = date.equals(date1);
        System.out.println(b2);
        System.out.println("===========================");
        // 创建 Calendar 对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toLocaleString());
        //    获取时间信息
        int year = calendar.get(Calendar.YEAR);
        int months = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hous = calendar.get(Calendar.HOUR_OF_DAY); // HOUR是12小时
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        String dateTime = year + "年" + (months + 1) + "月" + day + "日" + hous + "时" + minute + "分" + second + "秒";
        System.out.println(dateTime);
        //    设置时间
        Calendar calendar1 = Calendar.getInstance();
        calendar1.set(Calendar.MONTH, 5);
        calendar1.add(Calendar.DAY_OF_MONTH, 1);
        calendar1.add(Calendar.HOUR_OF_DAY, -1);
        System.out.println(calendar1.getTime().toLocaleString());
        //    补充方法
        // 获取 calendar1的该月最大的天数
        int max = calendar1.getActualMaximum(Calendar.DAY_OF_MONTH);
        int maxHours = calendar1.getActualMaximum(Calendar.HOUR_OF_DAY);
        System.out.println(max);
        System.out.println(maxHours);
        System.out.println("======================");
        // 创建 SimpleDateFormat对象 格式化和分析日期的类
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date2 = new Date();
        // 格式化日期
        String str = simpleDateFormat.format(date2);
        System.out.println(str);
        // 解析 把字符串转为 日期 parse
        Date date3 = simpleDateFormat.parse("2022/06/12 12:36:30");
        System.out.println(date3);
    }
}
