package com.Exercise.exercise03;

public class PC extends Computer {
    //编写PC子类，继承Computer类，添加特有属性[品牌brand)
    private String brand;


    public PC(String cpu, int memory, int disk, String brand) {
        //IDEA根据继承规则,直接自动把构造器的调用写好
        //这里也体现,继承设计的基本思想
        //父类的构造器完成父类属性初始化
        //子类的构造器完成子类属性初始化
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("PC信息如下");
        System.out.println(getDeatils()+"  brand=  "+brand);
        //调用父类方法得到相关属性
    }
}
