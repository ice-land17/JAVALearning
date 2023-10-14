import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Test {


    public static void main15(String[] args) {
        //多层for循环
        int i = 0;
        for (i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.println("i=" + i +'\t'+ "j=" + j);
        }
    }

    //统计1到200之间能被5整除但不能被3整除的个数
    public static void main14(String[] args) {
        int i = 1;
        int count = 0;
        do {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.println("i=" + i);
                count++;
            }
            i++;
        } while (i <= 200);
        System.out.println("count=" + count);
    }


    public static void main13(String[] args) {
        //打印1-100的和
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 100);
        System.out.println("sum = " + sum);
    }


    public static void main12(String[] args) {
        //打印1到100
        int i = 1;
        do {
            System.out.println("i = " + i);
            i++;
        } while (i <= 100);
    }

    public static void main11(String[] args) {
        //do while循环
        int i = 1;
        do {
            System.out.println("i= " + i);
            i++;
        } while (i <= 10);
        System.out.println("============");
        System.out.println("i=" + i);
    }

    public static void main10(String[] args) {
        //打印20到200之间的偶数
        int j = 40;
        while (j <= 200) {
            if (j % 2 == 0) {
                System.out.println("j=" + j);
            }
            j++;
        }
    }

    public static void main9(String[] args) {
        //打印1到100之间9和9的倍数
        int i = 1;
        int endNum = 100;
        while (i <= endNum) {
            if (i % 3 == 0) {
                System.out.println("i=" + i);
            }
            i++;
        }
    }

    public static void main8(String[] args) {
        //随堂练习
        int i = 0;
        while (i <= 10) {
            System.out.println("你好" + i);
            i++;
        }
        System.out.println("退出 ，继续");
    }


    public static void main7(String[] args) {
        //打印1到100之间能9的倍数
        int count = 0;
        int sum = 0;
        int t = 9;
        for (int i = 1; i < 100; i++) {
            if (i % t == 0) {
                System.out.println("i=" + i);
                count++;
                sum += i;

            }
        }
        System.out.println(count);
        System.out.println(sum);
    }


    public static void main6(String[] args) {
        //猜数字游戏
        //生成随机数
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int randNum = random.nextInt(100);
//        System.out.println(randNum);

        while (true) {
            System.out.println("请输入要猜的数字: ");
            int num = scan.nextInt();
            if (num > randNum) {
                System.out.println("猜大了");
            } else if (num == randNum) {
                System.out.println("猜对了");
                break;
            } else {
                System.out.println("猜小了");
            }
        }
    }

    public static void main5(String[] args) {
        //输入程序
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = scan.nextLine();
        System.out.println(name);

        System.out.println("请输入年龄");
        int age = scan.nextInt();
        System.out.println(age);

        System.out.println("请输入工资");
        float salary = scan.nextFloat();
        System.out.println(salary);

        scan.close();
    }

    public static void main4(String[] args) {
        //打印1到5的阶乘的和
        int sum = 0;
        int a = 1;
        for (int i = 1; i <= 5; i++) {
            a = a * i;
            sum = sum + a;
        }
        System.out.println(sum);
    }

    public static void main3(String[] args) {
        //打印1到5的阶乘
        int a = 1;
        int ret = 1;
        while (a <= 5) {
            ret *= a;
            a++;
        }
        System.out.println(ret);
    }

    public static void main2(String[] args) {
        //打印
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (i / 10 == 9 || i % 10 == 9) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main1(String[] args) {
        //打印闰年
        int year = 2024;
        if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println(year + "是闰年");
        } else {
            System.out.println(year + "不是闰年");
        }
    }
}
