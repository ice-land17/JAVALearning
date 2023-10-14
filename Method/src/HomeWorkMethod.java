import java.util.Scanner;


public class HomeWorkMethod {






    public static int fib(int n) {
        //以循环方式求斐波那契数
        if (n == 1 || n == 2) {
            return 1;
        }
        int f1 = 1;
        int f2 = 1;
        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

    public static void main6(String[] args) {
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(40));
    }





    public static int max(int a, int b) {
        //使用函数求最大值
        return a > b ? a : b;

    }

    public static int max(int a, int b, int c) {
        //使用函数求最大值
        int tmp = max(a, b);
        return max(tmp, c);
    }

    public static void main5(String[] args) {
        System.out.println(max(1, 3, 5));
    }


    public static void login() {
        //模拟登录
        // 编写代码模拟三次密码输入的场景。
        // 最多能输入三次密码，密码正确，提示“登录成功”.
        // 密码错误，可以重新输入，最多输入三次。三次均错，则提示退出程序
        int count = 3;
        Scanner myScanner = new Scanner(System.in);
        while (count != 0) {
            System.out.println("请输入你的密码 ");
            String passWord = myScanner.nextLine();
            if (passWord.equals("123456")) {
                System.out.println("登陆成功");
                break;
            } else {
                count--;
                System.out.println("你还有" + count + "次机会");
            }
        }
    }

    public static void main4(String[] args) {
        login();
    }


    public static void func2(int n) {
        //输出一个整数的每一位，如：123的每一位是3，2，1
        while (n != 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    public static void main3(String[] args) {
        func2(123);
    }


    public static double func1() {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值    。
        double sum = 0;
        int flg = 1;
        for (int i = 1; i <= 100; i++) {
            sum = sum + 1.0 / i * flg;
            flg = -flg;
        }
        return sum;
    }

    public static void main2(String[] args) {
        double d = func1();
        System.out.println(d);
    }


    public static void main1(String[] args) {
        //打印 X 图形
        Scanner myScanner = new Scanner(System.in);
        while (myScanner.hasNextInt()) {
            int n = myScanner.nextInt();
            for (int i = 0; i < n; i++) {
                for (int j = 0; i < n; j++) {
                    if (i == j || (i + j) == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
}