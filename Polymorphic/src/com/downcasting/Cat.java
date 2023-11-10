package com.downcasting;

import com.upcasting.Animal;

public class Cat extends Animal {
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse() {
        //cat特有方法
        System.out.println("猫抓老鼠");
    }
}
