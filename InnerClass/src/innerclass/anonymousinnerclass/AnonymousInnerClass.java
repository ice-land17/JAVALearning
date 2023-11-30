package innerclass.anonymousinnerclass;

/**
 * 演示匿名内部类的使用
 * 匿名内部类:
 * (1)匿名内部类本质是类
 * (2)是内部类
 * (3)该类没有名字
 * (4)同时还是一个对象
 * <p>
 * //1.需求: 想使用IA接口，并创建对象
 * //2.传统方式，是写一个类，实现该接口，并创建对象
 * //3.老韩需求是 Tiger/Dog 类只是使用一次，后面再不使用
 * //4.可以使用匿名内部类来简化开发
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {//外部类
    private int n1 = 10;//属性

    public void method() {//方法
//        IA tiger = new Tiger();
//        tiger.cry();
        //1.需求: 想使用IA接口，并创建对象
        //2.传统方式，是写一个类，实现该接口，并创建对象
        //3.老韩需求是 Tiger/Dog 类只是使用一次，后面再不使用
        //4.可以使用匿名内部类来简化开发
        //5.tiger的编译类型是什么,看等号的左边,是IA,接口类型
        //6.tiger的运行类型是什么? 就是匿名内部类, XXXX = Outer04$1
        /**
         * 底层实现逻辑:
         * class XXXX implements IA{//xxx为底层分配名字,分配为Outer04$1
         *     @Override
         *     public void cry() {
         *         System.out.println("tiger");
         *     }
         * }
         * 7.jdk底层在创建匿名内部类 outer04$1,立即马上就创建了Outer04$1实例，并且把地址返回给tiger
         * 8.匿名内部类使用一次以后就不能再使用
         */
        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("tiger叫");
            }
        };
        System.out.println("tiger的运行类型为=" + tiger.getClass());
        tiger.cry();


        /**
         * 演示基于类的匿名内部类
         * //分析
         * 1.father编译类型,Father
         * 2.father运行类型为Outer04$2,为顺序系统给定
         * 3.底层创建匿名内部类如下:
         * calss Other04$ extends Fahter{
         *        @Override
         *public void test() {
         *      System.out.println("匿名内部类重写了test方法");
         *    }
         * }
         *
         * 4.同时也直接返回了 匿名内部类Outer04$2的对象.
         * 5.注意("jack")参数列表会传递给 构造器
         */
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        father.test();
        System.out.println("father的运行类型为" + father.getClass());

        //基于抽象类的匿名内部类
        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("狗干饭");
            }
        };
        animal.eat();
    }
}


interface IA {//接口

    public void cry();
}

class Tiger implements IA {
    @Override
    public void cry() {
        System.out.println("tiger");
    }
}

class Dog implements IA {
    @Override
    public void cry() {
        System.out.println("狗叫");
    }
}

class Father {
    public Father(String name) {//构造器
        System.out.println("接收到name=" + name);
    }

    public void test() {//方法

    }
}

abstract class Animal {
    abstract void eat();
}