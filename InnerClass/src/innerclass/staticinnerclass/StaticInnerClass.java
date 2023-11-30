package innerclass.staticinnerclass;

/**
 * 静态内部类的使用:
 * StaticInnerClass01.java说明: 静态内部类是定义在外部类的成员位置，并且有static修饰
 * 1.可以直接访问外部类的所有静态成员，包含私有的，但不能直接访问非静态成员
 * 2.可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员。
 * 3.作用域 : 同其他的成员，为整个类体
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
    }
}

class Outer10 {//外部类
    private int n1 = 10;
    private static String name = "张三";

    //Inner10就是静态内部类
    //1.放在外部类的成员位置
    //2.使用static成员修饰
    //3.可以直接访问外部类的所有成员,包含私有的,但是不能访问非静态成员
    //4.可以添加任意访问修饰符(public、protected 、默认、private),因为它的地位就是一个成员
    //5.作用域 : 同其他的成员，为整个类体
    private static class Inner10 {
        public void say() {
            System.out.println(name);
        }
    }

    public void m1() {
        Inner10 inner10 = new Inner10();
        inner10.say();
    }
}
