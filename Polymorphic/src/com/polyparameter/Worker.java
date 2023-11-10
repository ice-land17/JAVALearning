package com.polyparameter;

public class Worker extends Employee {
    public Worker(String name, double slary) {
        super(name, slary);
    }

    public void work() {
        System.out.println("普通员工 " + getName() + " is working ");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
