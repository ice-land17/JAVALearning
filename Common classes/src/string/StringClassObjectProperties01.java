package string;

/**
 * 字符串的特性
 * 1) String是一个final类，代表不可变的字符序列
 * 2)字符串是不可变的。一个字符串对象一旦被分配，其内容是不可变的
 * <p>
 * String a ="hello"; //创建 a对象
 * String b ="abc”://创建 b对象
 * String c=a+b;创建了几个对象? 画出内存图?
 * //关键就是要分析 String c = a + b;
 * 到底是如何执行的//
 * 答案:一共有3对象，如图
 * <p>
 * 老韩小结: 底层是 StringBuilder sb = new StringBuilder0;
 * sb.append(a);sb.append(b);
 * sb是在堆中，并且append是在原来字符串的基础上追加的.
 * 重要规则，String c1 ="ab”+"cd”; 常量相加，看的是池。
 * String c1 = a+ b; 变量相加,是在堆中
 */
public class StringClassObjectProperties01 {
    public static void main(String[] args) {
        String a = "hello";//创建a对象
        String b = "abc";//创建b对象

        String c = a + b;
        String d = "helloabc";
        System.out.println(c == d);//F
        String e = "hello" + "abc";
        System.out.println(d == e);//T
    }
}
