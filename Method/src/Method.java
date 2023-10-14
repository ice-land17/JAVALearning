public class Method {

    public static int add(int a,int b)
    {
        return a+b;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;
        add(30,40);
    }

    //方法定义,判断闰年
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//            System.out.println(year + "是闰年");
            return true;
        } else {
//            System.out.println(year + "不是闰年");
            return false;
        }
    }

    public static void main1(String[] args) {
        boolean flg = isLeapYear(2022);
        System.out.println(flg);
    }
}
