package calendar;

import java.util.Calendar;

/**
 * 1.CaLendar是一个抽象类，并且构造器是private
 * 可以通过 getInstance() 来获取实例
 * 提供大量的方法和字段提供给程序员
 */
public class Calendar01 {
    public static void main(String[] args) {
        //1.Calendar是一个抽象类，并且构造器是private
        //2.可以通过 getInstance() 来获取实例
        //3.提供大量的方法和字段提供给程序员
        //4.catendar没有提供对应的格式化的类，因此需要程序员自己组合来输出
        //5.如果我们需要按照24小时进制来获取时间,Calendar.HOUR == 改成=>Calendar.HOUR_OF_DAY
        //创建日历类对象//比较简单，自由
        Calendar c = Calendar.getInstance();
        System.out.println("c=" + c);

        //2.获取日历对象的某个日历字段
        System.out.println("年: " + c.get(Calendar.YEAR));

        //这里为什么要 + 1，因为Calendar 返回月时候，是按照0开始编号
        System.out.println("月:" + (c.get(Calendar.MONTH) + 1));
        System.out.println("日:" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时:" + c.get(Calendar.HOUR));
        System.out.println("分钟:" + c.get(Calendar.MINUTE));
        System.out.println("秒:" + c.get(Calendar.SECOND));
        //caLender 没有专门的格式化方法，所以需要程序员自己来组合显示

        //>前面两代日期类的不足分析
        //JDK 1.0中包含了一个java.util.Date类，但是它的大多数方法已经在JDK 1.1引入
        //Calendar类之后被弃用了。而Calendar也存在问题是
        //1)可变性: 像日期和时间这样的类应该是不可变的
        //2)偏移性: Date中的年份是从1900开始的，而月份都从0开始
        //3)格式化: 格式化只对Date有用，Calendar则不行。
        //4)此外，它们也不是线程安全的: 不能处理秒等 (每隔2天，多出1s)
    }
}
