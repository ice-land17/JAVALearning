package wrapperclass;

/**
 * 包装类型和String类型的相互转换
 * 案例演示,以Integer 和 String 转换为例，其它类似:
 */
public class WrapperVSString {
    //包装类(Integer)->String
    //包装类转为String三种方式
    Integer i = 100;
    //方式1
    String str1 = i + "";
    //方式2
    String str2 = i.toString();
    //方式3
    String str3 = String.valueOf(i);


    //String转为包装类三种方式
    String str4 = "12345";
    Integer i2 = Integer.parseInt(str4);//使用到自动装箱
    Integer i3 = new Integer(str4);//构造器

}
