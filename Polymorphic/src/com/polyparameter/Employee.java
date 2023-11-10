package com.polyparameter;

public class Employee {
    private String name;
    private double slary;

    public Employee(String name, double slary) {
        this.name = name;
        this.slary = slary;
    }

    public double getAnnual() {
        //得到年工资的方法
        return 12 * slary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSlary() {
        return slary;
    }

    public void setSlary(double slary) {
        this.slary = slary;
    }
}
