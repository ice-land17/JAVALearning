package com.upcasting;

public class UpcastingDetail {
    public static void main(String[] args) {
/*    多态的前提是:两个对象(类)存在继承关系
    多态的向上转型:
    (1)本质:父类的引用指向了子类的对象
    (2)语法: 父类类型引用名 = new 子类类型
    (3)特点: 编译类型看左边，运行类型看右边。
    可以调用父类中的所有成员(需遵守访问权限),不能调用子类中特有成员;
    最终运行效果看子类的具体实现!*/

    //向上转型 :父类的引用指向了子类的对象
    //语法:父类类型引用名 = new 子类类型();
    Animal animal = new Cat();
    Object obj = new Object();



//    可以调用父类中的所有成员(需遵守访问权限)
//    但是不能调用子类中特有成员
//    因为在编译阶段,能调用哪些成员,是由编译类型决定的
//调用方法时按照从子类开始查找方法
     animal.eat();//调用本类成员,输出猫吃鱼,调用方法从子类,到父类,再到爷爷类,再到OBJ类,知道找到调用为止.
     animal.run();
     animal.show();
     animal.sleep();
    }
}
