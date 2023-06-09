package com.IIInnn.rememberMain;

// 静态代理模式 :
/*
*       真实对象和代理对象都要实现同一个接口，
*       代理对象需要代理真实角色
*        好处:代理对象可以做很多 真实对象做不了的事
*            真实对象专注于做自己的事情的。
* */
public class Staticproxy {
    public static void main(String[] args) {
        mySelf self = new mySelf();  //真实对象

        WeddingCompany weddingCompany = new WeddingCompany(self);   //代理对象，代理真实对象去。。    参数为 Marry类型
        weddingCompany.HappyMarry();
    }

}


// 定义一个接口类
interface Marry {
    void HappyMarry();
}

//自己本身
class mySelf implements Marry {
    @Override  //重写
    public void HappyMarry() {
        System.out.println("我自己非常开心");
    }
}

// 代理者

class WeddingCompany implements Marry {

    private Marry target;

    public WeddingCompany(Marry target) {  //有参构造  初始化化值
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void before() {
        System.out.println("结婚前，准备工作");
    }
    private void  after(){
        System.out.println("结婚后，享受生活");
    }

}
