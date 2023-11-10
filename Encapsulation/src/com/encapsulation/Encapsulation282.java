package com.encapsulation;

public class Encapsulation282 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack6666666666");
        person.setAge(30);
        person.setSalary(3000);
        System.out.println(person.info());
        System.out.println(person.getSalary());
    }
}

class Person {
    public String name;//名字公开
    private int age;//私有化
    private double salary;//私有

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对,需要2-6个字符");
            this.name = "不符合要求";
        }
    }
        public int getAge () {
            return age;
        }

        public void setAge ( int age){
            //判断
            if (age >= 1 && age <= 120) {
                this.age = age;
            } else {
                System.out.println("你设置年龄不对，需要在(1-120),给默认年龄为18");
                this.age = 18;
            }
        }

        public double getSalary () {
            return salary;
        }

        public void setSalary ( double salary){
            this.salary = salary;
        }

        public String info () {
            return "信息为 name " + name + " age" + age + "  sal  " + salary;

        }
    }
