package com.IIInnn.lambda;

public class TestLambda {
    //3. 静态内部类
    static class like2 implements ILike {
        @Override
        public void lambda() {
            System.out.println("I like lambda2");
        }
    }


    public static void main(String[] args) {
        // 都属于Ilike类

        ILike like = new like();
        like.lambda();

        like = new like2();
        like.lambda();

        //4.局部类
        class like3 implements ILike {
            @Override
            public void lambda() {
                System.out.println("I like lambda3");
            }
        }
        like = new like3();
        like.lambda();


        //5.匿名内部类  没有类的名称，必须借助接口或者父类
        like = new ILike() {
            @Override
            public void lambda() {
                System.out.println("I like lambda4");
            }
        };
        like.lambda();


        //6.用lambda简化
        like = () -> System.out.println("I like lambda5");
        like.lambda();


    }
}

//1.定义一个实现接口
interface ILike {
    void lambda();
}

//2.实现类

class like implements ILike {
    @Override
    public void lambda() {
        System.out.println("I like lambda1");
    }
}
