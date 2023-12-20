package stringbuffer;

/**
 * 输入商品名称和商品价格，要求打印效果示例，使用前面学习的方法完成:商品名商品价格
 * 手机 123,564.59 //比如 价格 3,456,789.88
 * 要求:价格的小数点前面每三位用逗号隔开，在输出
 */
public class StringBufferExer02 {
    public static void main(String[] args) {
        String price = "123564.59";
        StringBuffer sb = new StringBuffer(price);

        for (int i = sb.lastIndexOf(".") - 3; i > 0; i -= 3) {
            sb.insert(i, ",");
        }
        System.out.println(sb);
    }
}
