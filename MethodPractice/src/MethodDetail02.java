//注意事项和使用细节
//方法调用细节说明
//2.跨类中的方法A类调用B类方法:需要通过对象名调用。比如 对象名方法名(参数):案例演示:B类 sayHello 调用 print()
//3.特别说明一下:跨类的方法调用和方法的访问修饰符相关，先暂时这么提一下后面我们讲到访问修饰符时，还要再细说。

class A {
    //    1.同一个类中的方法调用: 直接调用即可。比如 print(参数)案例演示: A类 sayok 调用 print()
    public void print(int n) {
        System.out.println("print方法被调用 n =" + n);
    }
    public void sayOK(){
        print(10);
        System.out.println("继续执行sayOk");
    }

    public void m1(){
        System.out.println("m1use");
        B b = new B();
        b.hi();
        System.out.println("m1 2 use");
    }
}

class B{
    public void hi(){
        System.out.println("B use hi");
    }
}


public class MethodDetail02 {
    public static void main(String[] args) {
        A a = new A();
//        a.sayOK();
        a.m1();
    }
}
