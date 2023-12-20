package string;

/**
 * String类的理解和创建对象
 * 1)String 对象用于保存字符串，也就是一组字符序列"你好"、"12.97"、"boy"等
 * 2)字符串常量对象是用双引号括起的字符序列。例如:
 * 3)字符串的字符使用Unicode字符编码,一个字符(不区分字母还是汉字)占两个字节
 * 4)String类较常用构造方法(其它看手册):
 * String s1 = new String0;
 * String s2 = new String(String original);
 * String s3 = new String(charll a);
 * String s4 = new String(charl] a,int startlndex,int count)
 * 5)String 类实现了 接口 Serializable [string 可以串行化:可以在网络传输]
 *                  接口 Comparable [string 对象可以比较大小]
 * 6)string 是fina类，不能被其他的类继承
 * 7)String 有属性 private final char value[]; 用于存放字符串内容
 * 8)一定要注意,value是一个final类型,不可以被修改
 *
 *
 */
public class StringClassStructure {

}
