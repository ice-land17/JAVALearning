package com.polyarray;

public class PolyArray {
    public static void main(String[] args) {
        //应用实例:现有一个继承结构如下:
        // 要求创建1个Person对象、
        // 2个student 对象和2个Teacher对象，
        // 统一放在数组中，并调用每个对象say方法

        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("tom", 18, 100);
        persons[2] = new Student("jerry", 20, 30.1);
        persons[3] = new Teacher("scout", 55, 20000);
        persons[4] = new Teacher("white", 66, 25000);

        //循环遍历多态数组,调用say方法
        for (int i = 0; i < persons.length; i++) {
            //老师提示: person[i] 编译类型是 Person ,运行类型是是根据实际情况有JVM来判断
            System.out.println(persons[i].say());//动态绑定机制

            //如果需要调用子类特殊方法,则需要通过以下的方式调用,(类型判断结合向下转型)
            //列如以下学生调用学生子类的study方法
            //老师调用老师子类的teach方法
            if (persons[i] instanceof Student) {
                Student student = (Student) persons[i];
                student.study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            } else if (persons[i] instanceof Person) {
            } else {
                System.out.println("输入有误,请重新输入");
            }
        }
    }
}
