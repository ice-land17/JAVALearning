package com.downcasting;

import com.upcasting.Animal;

public class downcasting {
    public static void main(String[] args) {
/*    多态的向下转型
    (1)语法: 子类类型引用名 = (子类类型)父类引用
    (2)只能强转父类的引用，不能强转父类的对象
    (3要求父类的引用必须指向的是当前目标类型的对象
    (4)可以调用子类类型中所有的成员*/

    //向下转型调用cat的catMouse方法
        Animal animal = new Cat();
        Object obj = new Object();
        Cat cat = (Cat) animal;
        cat.catchMouse();
    }
}
