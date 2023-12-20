package string;

/**
 * 题1:下面代码输出什么，并说明原因
 * String s1 ="hspedu"; //s1 指向池中的
 * String s2 = "java";
 * String s5 = "hspedujava";
 * String s6 = (s1 + s2).intern();
 * System.out.println(s5 == s6);
 * System.out.println(s5.equals(s6));
 */
public class StringClassObjectProperties02 {
    public static void main(String[] args) {
        String s1 = "hspedu"; //s1 指向池中的hspedu
        String s2 = "java";//s2指向池中的java
        String s5 = "hspedujava";//s5指向池中的hspedujava
        String s6 = (s1 + s2).intern();//s6指向池中的hspedujava
        System.out.println(s5 == s6);//T
        System.out.println(s5.equals(s6));//T
    }
}
