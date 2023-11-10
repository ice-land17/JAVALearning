package com.poly;

public class Poly01 {
    public static void main(String[] args) {
        Master tom = new Master("Tom");
        Dog dog = new Dog("哈士奇");
        Bone bone = new Bone("酱骨肉");
        tom.feed(dog, bone);

        System.out.println("=======================");

        Cat cat = new Cat("Jerry");
        Fish fish = new Fish("金枪鱼");
        tom.feed(cat, fish);

        Pig pig = new Pig("Pig");
        Rice rice = new Rice("大米饭");
        tom.feed(pig, rice);
    }
}
