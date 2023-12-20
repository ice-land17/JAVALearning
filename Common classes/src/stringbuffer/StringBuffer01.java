package stringbuffer;

/**
 * StringBuffer结构刨析
 *
 * 1.StringBuffer 的直接父类 是 AbstractStringBuilder
 * 2.StringBuffer 实现了 Serializable，即StringBuffer的对象可以串行化
 * 3.在父类中 AbstractstringBuilder 有属性 char[] value,不是final
 * 该 value 数组存放 字符串内容，引出存放在堆中的
 * 4.StringBuffer 是一个 final类，不能被继承
 * 5.因为StringBuffer 字符内容是存在 char[] value，
 * 所有在变化(增加/删除)不用每次都更换地址(即不是每次创建新对象)，
 * 所以效率高于string
 *
 *
 * String 和 StringBuffer对比
 * 1.String保存的是字符串常量，里面的值不能更改，每次String类的更新实际上就是更改地址，
 * 效率较低 //private final char valuell[];
 * 2.StringBuffer保存的是字符串变量，里面的值可以更改，
 * 每次StringBuffer的更新实际上可以更新内容，不用每次更新地址，效率较高
 * //charl] value; // 这个放在堆
 *
 *
 */
public class StringBuffer01 {
}
