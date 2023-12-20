package string;

/**
 *
 */
public class StringClassExercise03 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "hspedu";//指向堆n1,然后指向常量池中共同的hspedu,
        Person p2 = new Person();
        p2.name = "hspedu";//指向堆n2,然后指向常量池中共同的hspedu,

        System.out.println(p1.name.equals(p2.name));//t 比较内容,肯定为真
        System.out.println(p1.name == p2.name);//t
        System.out.println(p1.name == "hspedu");//t

        String s1 = new String("bcde");
        //s1 s2都为新创建的,所以都指向常量池中的bced,但是两个地址不同,所以放回fulse
        String s2 = new String("bcde");//
        System.out.println(s1 == s2);//f
    }
}

class Person {
    public String name;
}