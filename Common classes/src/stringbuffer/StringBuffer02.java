package stringbuffer;

/**
 * StringBuffer构造器
 * 构造方法摘要
 *
 * StringBuffer():
 * 构造一个其中不带字符的字符串缓冲区，其初始容量为 16 个字符
 *
 * StringBuffer(CharSequence seq)
 * public java.lang.StringBuilder(CharSequence seg)构造一个字符串缓冲区，它包含与指定的CharSequence 相同的字符。
 *
 * StringBuffer(int capacity)
 * //capacity[容量构造一个不带字符，但具有指定初始容量的字符串缓冲区。即对 char 大小进行指定
 *
 * StringBuffer(String str)
 * 构造一个字符串缓冲区，并将其内容初始化为指定的字符串内容。
 *
 *
 *
 */
public class StringBuffer02 {
    public static void main(StringBufferExer02[] args) {
        //1.创建一个大小为16的,char[],用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();

        //2.通过构造指定char[]大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //3.通过给一个String创建StringBuffer
        StringBuffer hello = new StringBuffer("hello");//char[]大小就是 str.Length() + 16
    }
}