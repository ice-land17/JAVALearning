package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    //1.先完成显示菜单,并可以选择菜单,并给出对应提示
    //2.完成零钱通过明细功能. 功能思路:
    //3.完成收益入账
    //4.完成消费功能
    //5.用户输入4退出时，给出提示"你确定要退出吗? y/n"，必须输入正确的y/n ，
    //否则循环输入指令，直到输入y或者n
    public static void main(String[] args) {
        //定义相关的变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";


        //2.完成零钱通明细功能
        //思路:(1):可以把收益入账和消费,保存到数组
        //     (2):可以使用对象
        //     (3):简单的话可以使用String拼接
        String details = "------零钱通明细------";


        //3.完成收益入账,完成功能驱动程序员增加新的变化和代码.
        double money = 0;
        double balance = 0;
        Date date = null;//date是java.util.Date 类型,表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化


        //4.完成消费功能
        //定义新变量,保存消费原因
        String note = "";

        do {
            System.out.println("\n======零钱通菜单======");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益  入账");
            System.out.println("\t\t\t3 消      费");
            System.out.println("\t\t\t4 退      出");

            System.out.print("请选择(1-4):  ");
            key = scanner.next();

            //switch分支控制
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    //对money的值范围进行校验
                    if (money <= 0) {
                        System.out.println("收益金额需要大于0");
                        break;
                    }

                    balance += money;//拼接收益入账信息到details

                    //拼接消费信息到deatil
                    date = new Date();//先获取当前日期
                    details += "\n收益入账\t" + "+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.println("消费金额");
                    money = scanner.nextDouble();
                    //对money的值范围进行校验
                    if (money <= 0 || money > balance) {
                        System.out.println("你的消费金额应该在 0 - " + balance);
                        break;
                    }
                    System.out.println("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    //拼接消费信息到deatil
                    date = new Date();//先获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    // (1) 定义一个变量 choice，接收用户的输入
                    // (2)使用 while + break，来处理接收到的输入时 y 或者 n
                    // (3)退出while后，再判断choice是y还是n，就可以决定是否退出
                    // (4)建议一段代码,完成一个小功能,尽量不要混在一起
                    String choice = "";
                    while (true) {
                        System.out.println("你确定要退出吗?y/n");
                        choice = scanner.next();
                        if ("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }

                    //当用户退出while,进行判断
                    if (choice.equals("y")) {
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("选择有误,请重新选择");
            }

        } while (loop);
        System.out.println("------退出了零钱通项目------");
    }
}
