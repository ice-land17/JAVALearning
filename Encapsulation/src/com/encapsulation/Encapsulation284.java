package com.encapsulation;

public class Encapsulation284 {
    private String name;
    private double balance;
    private String pwd;

    public Encapsulation284() {
    }

    public Encapsulation284(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //姓名(长度为2位3位4位
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("姓名(长度为2位3位4位，默认值为 Null)");
            this.name = "Null";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        //余额必须大于20
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("余额必须大于20");
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        //密码必须是六位
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("密码必须为6位,默认密码为000000");
            this.pwd = "000000";
        }
    }

    public void info() {
        System.out.println("账号信息 name " + name + " " + " " + balance + " " + pwd);
    }
}

