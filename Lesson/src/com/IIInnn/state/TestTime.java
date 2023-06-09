package com.IIInnn.state;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

//模拟倒计时
public class TestTime {
    public static void main(String[] args) {
        Date time = new Date(System.currentTimeMillis()); //获取系统当前时间
        while (true) {
            try {
                Thread.sleep(1000);
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(time));
                //更新时间
                time = new Date(System.currentTimeMillis());
            } catch (InterruptedException e) {

            }
        }
    }
}
