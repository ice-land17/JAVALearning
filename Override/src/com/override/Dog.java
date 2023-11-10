package com.override;

public class Dog extends Animal{
    //1.因为dog是Animla的子类
    //2.dog的cry方法和animal的cry方法定义的形式一样(名称,返回类型,参数一样)
    //3.这时我们就说dog的cry方法重写了Animal的cry方法
    public void cry(){
        System.out.println("狗叫");
    }
}
