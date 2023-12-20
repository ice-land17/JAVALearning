package bigdata;

import java.math.BigDecimal;

/**
 * BigDecimal适合保存精度更高的浮点型 (小数
 *
 */
public class BigDecimal01 {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1999.12134143241234123412341324");
        BigDecimal bigDecimal2 = new BigDecimal("1.11");
        System.out.println(bigDecimal);

        //如果对 BigDecimal进行运算，比如加减乘除，需要使用对应的方法
        //创建一个需要操作的 BigDecimaT 然后调用相应的方法即可
        System.out.println(bigDecimal.add(bigDecimal2));
        System.out.println(bigDecimal.subtract(bigDecimal2));
        System.out.println(bigDecimal.multiply(bigDecimal2));
        System.out.println(bigDecimal.divide(bigDecimal2));//抛出异常,解决方法如下
        //在调用divide 方法时，指定精度即可,BigDecimal.ROUND_CEILING  .如果有无限循环小数，就会保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal2,BigDecimal.ROUND_CEILING));

    }
}
