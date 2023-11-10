package com.dynamic;

public class DynamicBinding {
    //java的动态绑定机制
    // 1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
    // 2.当调用对象属性时，没有动态绑定机制，哪里声明，那里使用
    public static void main(String[] args) {
        //a的编译类型是A,运行类型是B
        A a = new B();
        // 1.当调用对象方法的时候，该方法会和该对象的内存地址/运行类型绑定
        System.out.println(a.sum());
        // 2.当调用对象属性时，没有动态绑定机制，哪里声明，那里使用
        System.out.println(a.sum1());
    }
}

class A {
    public int i = 10;

    public int sum() {
        return getl() + 10;
    }

    public int sum1() {
        return i + 10;

    }

    public int getl() {
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

    public int getl() {
        return i;
    }

//    public int sum1() {
//        return i + 10;
//    }
}
