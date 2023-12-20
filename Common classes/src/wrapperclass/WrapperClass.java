package wrapperclass;

/**
 * 包装类的分类
 * 1.针对八种基本数据类型相应的引用类型一包装类
 * 2.有了类的特点，就可以调用类中的方法
 * <p>
 * 基本数据类型           包装类
 * boolean--------------Boolean(独立包装类)
 * char-----------------Character(独立包装类)
 * byte-----------------Byte
 * short----------------Short
 * int------------------Integer
 * long-----------------Long
 * float----------------Float
 * double---------------Double
 * <p>
 * <p>
 * <p>
 * 包装类和基本数据的转换
 * 演示包装类和基本数据类型的相互转换,这里以int和Integer演示
 * 1.jdk5 前的手动装箱和拆箱方式，装箱: 基本类型->包装类型,反之，拆箱
 * 2.jdk5 以后(含jdk5) 的自动装箱和拆箱方式
 * 3.自动装箱底层调用的是valueOf方法，比如Integer.valueof()
 */
public class WrapperClass {
    public static void main(String[] args) {
        //演示int -- Integer 装箱拆箱
        //jdk5之前是手动装箱和拆箱
        //手动装箱int --> Integer
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        int i = integer.intValue();


        //jdk5以后,就可以自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱 int ->Integer
        Integer integer2 = n2;//底层使用的是Integer.valueOf
        //自动拆箱 Integer ->int
        int n3 = integer2;
    }
}
