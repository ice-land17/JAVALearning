package innerclass.anonymousinnerclass;

import java.io.FilterOutputStream;

/**
 * 匿名内部类的使用细节:
 * 2.匿名内部类的语法比较奇特，请大家注意，因为匿名内部类既是一个类的定义,
 * 同时它本身也是一个对象，因此从语法上看，它既有定义类的特征，
 * 也有创建对象的特征，对前面代码分析可以看出这个特点,因此可以调用匿名内部类方法
 * 3.可以直接访问外部类的所有成员，包含私有的[案例演示]
 * 4.不能添加访问修饰符,因为它的地位就是个局部变量。[过]
 * 5.作用域: 仅仅在定义它的方法或代码块中。
 * 6.匿名内部类---访问---->外部类成员 [访问方式:直接访问]
 * 7.外部其他类---不能访问匿名内部类(因为匿名内部类地位是个局部变量)
 * 8.如果外部类和匿名内部类的成员重名时，匿名内部类访问的话，默认遵循就近原则
 * 如果想访问外部类的成员，则可以使用 (外部类名.this.成员)去访问
 */
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();

        System.out.println("main Outer05 hashcode=" + outer05);
    }
}

class Outer05 {
    private int n1 = 99;

    public void f1() {
        //创建一个基于类的匿名内部类
        Person person = new Person() {
            private int n1 = 88;

            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法" + n1);//遵循就近原则
                System.out.println("匿名内部类重写了hi方法" + Outer05.this.n1);

                //Outer05.this就是调用f1的对象
                System.out.println("Outer05.this hashcode=" + Outer05.this);
            }
        };
        person.hi();//动态绑定,运行类型为Outher05$1


        //也可以直接调用
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了hi方法,hhhhh");
            }
        }.hi();
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }
}
