package homeworkhsp01;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class HomeWork01 {

    //某人有100,000元,每经过一次路口，需要交费,
    // 规则如下:1)当现金>50000时,每次交5%)
    //:2)当现金<=50000时,每次交1000
    // 编程计算该人可以经过多少次路口,要求: 使用 while break方式完成
    public static void main1(String[] args) {
        double money = 100000;
        int count = 0;
        while (true) {
            if (money > 50000) {
                money *= 0.95;
                count++;
            } else if (money >= 1000) {
                money -= 1000;
                count++;
            } else {
                break;
            }
        }
        System.out.println(money + "可以过" + count + "路口...");
    }


    public static void main2(String[] args) {

        //    判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，
        //    其各个位上数字立方 和等于其本身。
        //    例如: 153 = 1*1*1 + 3*3*3 + 5*5*5
        int n = 153;
        int g1 = n / 100;
        int s2 = n % 100 / 10;
        int b3 = n % 10;
        if (g1 * g1 * g1 + s2 * s2 * s2 + b3 * b3 * b3 == n) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }

    public static void main3(String[] args) {
//        输出1-100之间的不能被5整除的数，每5个一行
        int count = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 5 != 0) {
                count++;
                System.out.print(i + "\t");
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }


    public static void main4(String[] args) {
//        输出小写的a-z以及大写的Z-A
        for (char c1 = 'a'; c1 <= 'z'; c1++) {
            System.out.print(c1 + "\t");
        }
        System.out.println();
        for (char c2 = 'A'; c2 <= 'Z'; c2++) {
            System.out.print(c2 + "\t");
        }
        System.out.println();
    }

    public static void main5(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                sum += j;
            }
        }
        System.out.println("sum=" + sum);
    }

}


