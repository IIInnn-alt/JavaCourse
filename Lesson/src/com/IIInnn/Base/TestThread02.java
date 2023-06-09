package com.IIInnn.Base;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

//练习Thread 实现多线程同步下载图片
public class TestThread02 extends Thread {

    private String url;
    private String name;

    public TestThread02(String url, String name) {
        this.url = url;
        this.name = name;
    }



    @Override
    public void run() {
        WebDownLoader webDownLoader = new WebDownLoader();
        webDownLoader.downloader(url,name);
        System.out.println("下载了文件名为"+name);
    }

    public static void main(String[] args) {
        //创建一个线程对象
        TestThread02 t1 = new TestThread02("https://wpimg.wallstcn.com/9679ffb0-9e0b-4451-9916-e21992218054.jpg?imageView2/2/h/440","1.jpg");
        TestThread02 t2 = new TestThread02("https://wpimg.wallstcn.com/50530061-851b-4ca5-9dc5-2fead928a939.jpg?imageView2/2/h/440","2.jpg");

        //开启 线程 start 方法
        t1.start();
        t2.start();
    }
}

//下载器
class WebDownLoader {
    //下载方法
    public void downloader(String url, String name) {
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("IO异常，downloader方法出现问题");
        }
    }
}
