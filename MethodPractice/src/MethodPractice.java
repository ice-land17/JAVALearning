
class Person {
    String name;
    int age;

    public void speak() {
        System.out.println("我是一个好人");
    }


    public void ca101() {
        int res = 0;
        for (int i = 1; i <= 1000; i++) {
            res += i;
        }
        System.out.println("ca101的打印结果" + res);
    }


    public void ca102(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("ca102的打印结果" + res);
    }

    //添加getSum成员方法，可以计算两个数的和
    //1.public方法是公开的。
    //2.int:表示方法执行后，返回一个int值
    //3.getSum方法名
    //4.(int num1,int num2)形参列表,两个形参 ,可以接收用户传入的两个数.
    public int getSum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }
}

public class MethodPractice {

    public static void main(String[] args) {
        Person p1 = new Person();
//        方法使用:
//        1.方法写好后，如果不去调用(使用)，不会输出
//        2.先创建对象 ，然后调用方法即可
        p1.speak();
        p1.ca101();
        p1.ca102(5);
        p1.ca102(10);
        int resreturn = p1.getSum(50,66);
        System.out.println("resreturn值为"+resreturn);
    }
}
