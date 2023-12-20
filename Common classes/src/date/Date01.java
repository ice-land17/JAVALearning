package date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * P488
 */
public class Date01 {
    public static void main(String[] args) {
        //1.获取当前系统时间
        //2.这里的Date 类是在java.util包中
        //3.这里的格式是国外默认输出格式;因此通常需要对格式进行转换
        Date date = new Date();
        System.out.println("当前日期" + date);

        //格式转换方法如下:
        //1.创建SimpleDateFormat对象,指定对应的格式
        //3.这里的格式使用的字母是规定好的,不能乱写
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format1 = format.format(date);//format:将日期转换为指定格式的字符串
        System.out.println("当前日期= "+format1);

        //通过指定毫秒数来得到时间
        Date date1 = new Date(1999999999);
        System.out.println("当前时间为"+date1);
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format3 = format2.format(date1);//format:将日期转换为指定格式的字符串
        System.out.println("当前日期= "+format3);



    }
}
