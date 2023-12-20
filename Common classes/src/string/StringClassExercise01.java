package string;

/**
 * StringClass作业练习
 *
 * 知识点:
 * 当调用 intern 方法时，如果池已经包含一个等于此String对象的字符串(用equals(Object)方法确定)，
 * 则返回池中的字符串。否则，将此 String 对象添加到池中，并返回此 String对象的引用
 * 老韩解读:(1) b.intern()方法最终返回的是常量池的地址 (对象)
 */
public class StringClassExercise01 {
    public static void main(String[] args) {
        String a = "hsp";//指向常量池的 "hsp"
        String b = new String("hsp");//b 指向堆中对象
        System.out.println(a.equals(b));//T
        System.out.println(a == b);//F
        System.out.println(a == b.intern());//T
        System.out.println(b == b.intern());//F


    }
}