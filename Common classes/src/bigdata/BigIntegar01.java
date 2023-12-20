package bigdata;

import java.math.BigInteger;

/**
 *
 */
public class BigIntegar01 {
    public static void main(String[] args) {
        //当我们编程中，需要处理很大的整数，
        //Long不够用可以使用BigInteger的类来搞定
        BigInteger bigInteger = new BigInteger("100");
        BigInteger bigInteger1 = new BigInteger("900");
        System.out.println(bigInteger);

        //在对 BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行加减乘除
        //可以创建一个 要操作的 BigInteger 然后进行相应操作
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);
        BigInteger mul = bigInteger.multiply(bigInteger1);
        System.out.println(mul);
        BigInteger div = bigInteger.divide(bigInteger1);
        System.out.println(div);
    }
}
