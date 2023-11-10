package com.override304;

public class Exercise304 {
//    编写一个Person类，包括属性/private (name、age) ，构造器、方法say(返回自我介绍的字符串)
//    编写一个Student类，继承Person类，增加id、score属性/private，以及构造器，定义say方法(返回自我介绍的信息)。
//    在main中分别创建Person和Student对象，调用say方法输出自我介绍

    public static void main(String[] args) {
        //    在main中分别创建Person和Student对象，调用say方法输出自我介绍
        Person jack = new Person("jack",10);
        System.out.println(jack.say());
        Student smith = new Student("smith",99,66,77.88);
        System.out.println(smith.say());

    }
}
