import java.util.Scanner;

public class HomeWork {

    public static void main(String[] args) {
        //写一个函数返回参数二进制中1的个数
        //比如15      0000 1111 4个1
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int count =0;
        while(n!=0)
        {
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }

    public static void main8(String[] args) {
        //写一个函数返回参数二进制中1的个数
        //比如15      0000 1111 4个1
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        int count =0;
        for(int i=0;i<32;i++)
        {
            if(((n>>>i)&1)!=0)
            {
                count++;
            }
        }
        System.out.println(count);
    }


    public static void main7(String[] args) {
        //打印所有的四叶玫瑰数，并打印。
        int count = 0;

        for (int i = 1000; i <= 9999; i++) {

            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100 % 10;
            int d = i / 1000;

            int sum = a * a * a * a + b * b * b * b + c * c * c * c + d * d * d * d;

            if (sum == i) {
                System.out.println("四叶玫瑰为： " + i);
                count++;
            }
        }
        System.out.println("一共有： " + count + "个");
    }


    public static void main6(String[] args) {
        //求出100到999的水仙花数
        int count = 0;

        for (int i = 100; i < 10000; i++) {
            int singledigit = i % 10;
            int tens = i / 10 % 10;
            int hundreddigits = i / 100 % 10;

            if (i == singledigit * singledigit * singledigit + tens * tens * tens
                    + hundreddigits * hundreddigits * hundreddigits) {
                System.out.println(i + "是水仙花数");
                count++;
            }
        }
        System.out.println("一共有" + count + "个水仙花数");
    }

    public static void main5(String[] args) {
        //求两个整数的最大公约数
        Scanner myScanner = new Scanner(System.in);
        int a = myScanner.nextInt();
        int b = myScanner.nextInt();
        int c = a % b;
        while (c != 0) {
            a = b;
            b = c;
            c = a % b;
        }
        System.out.println(b);
    }

    public static void main4(String[] args) {
        //输出乘法口诀表
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }

    public static void main3(String[] args) {
        //打印1000到2000之间的闰年
        int year = 0;
        int count = 0;
        for (year = 1000; year <= 2000; year++) {
            if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                System.out.println("是闰年的有" + year);
                count++;
            }
        }
        System.out.println("1000到2000年是闰年的有" + count + "个");
    }


    public static void main2(String[] args) {
        //打印1-100之间的素数
        Scanner myScanner = new Scanner(System.in);
        int n = myScanner.nextInt();
        for (int j = 1; j <= n; j++) {
            int i = 2;
            for (; i <= Math.sqrt(j); i++) {
                if (j % i == 0) {
                    break;
                }
            }
            if (i > Math.sqrt(j)) {
                System.out.println(j + "是素数");
            }
        }
    }

    public static void main1(String[] args) {
        //根据年龄，打印出当前年龄是少年，青年，老年
        int age = 99;
        if (age <= 18) {
            System.out.println("少年");
        } else if (age >= 18 && age <= 28) {
            System.out.println("青年");
        } else if (age >= 29 && age <= 55) {
            System.out.println("中年");
        } else if (age >= 56 && age < 100) {
            System.out.println("老年");
        }
    }
}
