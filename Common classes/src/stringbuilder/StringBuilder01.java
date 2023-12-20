package stringbuilder;

/**
 * p480
 * 基本介绍:
 * 1.一个可变的字符序列。此类提供一个与 StringBuffer兼容的API，但不保证同步(StringBuilder)不是线程安全)。
 * 该类被设计用作 StringBuffer 的一个简易替换，用在字符串缓冲区被单个线程使用的时候。
 * 如果可能，建议优先采用该类因为在大多数实现中，它比 StringBuffer要快[后面测].
 * 2.在 StringBuilder 上的主要操作是 append 和 insert 方法，可重载这些方法     以接受任意类型的数据。
 */
public class StringBuilder01 {
    public static void main(String[] args) {
        /**
         * 1.StringBuilder 继承 AbstractStringBuilder 类
         * 2.实现了 Serializable,说明StringBuilder对象是可以串行化(对象可以网络传输,可以保存到文件)
         * 3.StringBuilder 是final类，不能被继承
         * 4.StringBuilder 对象字符序列仍然是存放在其父类 AbstractStringBuilder的 char[] value:因此,字符序列是堆中
         * 5.StringBuilder 的方法，没有做瓦斥的处理,即没有synchronized 关键字,因此在单线程的情况下使用StringBuilder
         */
        StringBuilder stringBuilder = new StringBuilder();

        /**
         * StringBuilder类
         * String、StringBuffer 和StringBuilder的比较:
         * 1)StringBuilder 和 StringBuffer 非常类似，均代表可变的字符序列，而且方法也一样
         * 2) String: 不可变字符序列, 效率低但是复用率高
         * 3)StringBuffer: 可变字符序列、效率较高(增删)、线程安全,看源码
         * 4)StringBuilder: 可变字符序列、效率最高、线程不安全
         * 5)String使用注意说明:string s="a";//创建了一个字符串
         * s +="b”.//实际上原来的”a"字符串对象已经丢弃了，现在又产生了一个字符串s+"b”(也就是”ab")。
         * 如果多次执行这些改变串内容的操作，会导致大量副本字符串对象存留在内存中，降低效率。
         * 如果这样的操作放到循环中，会极大影响程序的性能 => 结论: 如果我们对String 做大量修改,不要使用String
         */

        /**
         * String、StringBuffer 和StringBuilder的选择
         * 使用的原则，结论:
         * 1.如果字符串存在大量的修改操作，一般使用 StringBuffer 或StringBuilder
         * 2.如果字符串存在大量的修改操作，并在单线程的情况,使用 StringBuilder3
         * 3.如果字符串存在大量的修改操作，并在多线程的情况，使用 StringBuffer
         * 4.如果我们字符串很少修改，被多个对象引用，使用String,比如配置信息等
         * StringBuilder 的方法使用和 StringBuffer一样，不再说
         */
    }
}
