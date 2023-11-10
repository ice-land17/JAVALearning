package com.supergrammar;

public class B extends A {
    public void access1() {
        //访问父类的属性,但是不能访问到父类的私有(private)属性[案例]super.属性名
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3 + " ");
    }
    public void access2() {
        //访问父类的方法,但是不能访问到父类的私有(private)方法[案例]super.方法名
        super.test100();
        super.test200();
        super.test300();
    }

    public B(){
        //访问父类的构造器,super(参数列表),只能放在构造器的第一句,只能出现一句
        super("jack");
    }
}
