package innerclass.localinnerclass;

/**
 * 演示局部内部类的使用
 */
public class localinnerclass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02 {//外部类
    private int n1 = 100;//私有成员通常只能在本类访问,但是Inner02也属于Outer02中

    private void m2() {//私有方法
        System.out.println("Outer02 m2");
    }

    public void m1() {//方法
        //1.局部内部类是定义在外部类的局部位置,通常在方法
        class Inner02 {//局部内部类(本质仍然是一个类)

            //2.可以直接访问外部类的所有成员,包含私有的
            //3.不能添加访问修饰符,因为它的地位就是个局部变量。局部变量是不能使用修饰符的。
            // 但是可以使用final 修饰，因为局部变量也可以使用final.加入final后不能被继承
            //4.作用域 : 仅仅在定义它的方法或代码块中
            //5.局部内部类可以直接访问外部类的成员,比如下面 外部类的n1,和m2()
            //7.如果外部类和局部内部类的成员重名时，默认遵循就近原则，如果想访问外部类的成员，
            //使用  外部类名.this.成员) 去访问
            private int n1 = 800;

            public void f1() {
                System.out.println("n1=" + n1 + "\t" + "外部类的n1=" + Outer02.this.n1);
                m2();
            }
        }
        //6.外部类在方法中，可以创建Inner02对象，然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
