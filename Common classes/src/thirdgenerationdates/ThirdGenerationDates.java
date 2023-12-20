package thirdgenerationdates;

import java.time.LocalDateTime;

/**
 * //>前面两代日期类的不足分析
 * //JDK 1.0中包含了一个java.util.Date类，但是它的大多数方法已经在JDK 1.1引入
 * //Calendar类之后被弃用了。而Calendar也存在问题是
 * //1)可变性: 像日期和时间这样的类应该是不可变的
 * //2)偏移性: Date中的年份是从1900开始的，而月份都从0开始
 * //3)格式化: 格式化只对Date有用，Calendar则不行。
 * //4)此外，它们也不是线程安全的: 不能处理秒等 (每隔2天，多出1s)
 *
 *
 * >第三代日期类常见方法
 * 1) LocalDate(日期)、LocalTime(时间)、LocalDateTime(日期时间)JDK8加入
 * LocalDate只包含日期，可以获取日期字段
 * LocalTime只包含时间，可以获取时间字段
 * LocalDateTime包含日期+时间，可以获取日期和时间字段
 */
public class ThirdGenerationDates {
    public static void main(String[] args) {
        //1.使用now(返回表示当前日期时间的 对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        System.out.println("年 = "+ldt.getYear());
        System.out.println("月 = "+ldt.getMonthValue());
        System.out.println("日 = "+ldt.getDayOfMonth());
        System.out.println("时 = "+ldt.getHour());
        System.out.println("分 = "+ldt.getMinute());
        System.out.println("秒 = "+ldt.getSecond());
    }
}
