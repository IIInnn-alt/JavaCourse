package com.IIInnn.lambda;

public class TestLambda02 {
    //内部类
    static class love1 implements Ilove {
        @Override
        public void love(int a) {
            System.out.println("喜欢的是" + a);
        }
    }

    ;

    public static void main(String[] args) {
//        //类型 为 Ilove,前面没写的类名的表达式
//        Ilove love = new love();
//        love.love(1);
//
//        love = new love1();
//        love.love(2);
//
//        //局部类
//        class love2 implements Ilove {
//            @Override
//            public void love(int a) {
//                System.out.println("喜欢的是" + a);
//            }
//
//            public void cc() {
//                System.out.println("ccc");
//            }
//        }
//
//        love = new love2();
//        love.love(3);
//
//        //匿名类
//        love = new Ilove() {
//            @Override
//            public void love(int a) {
//                System.out.println("喜欢的是" + a);
//            }
//        };
//        love.love(4);

       Ilove love = (int a) -> System.out.println("喜欢的是" + a);
        love.love(5);


    }
}

//定义带参数的接口
interface Ilove {
    void love(int a);
}
//
//class love implements Ilove {
//    @Override
//    public void love(int a) {
//        System.out.println("喜欢的是" + a);
//    }
//}