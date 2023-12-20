package system;

import java.util.Arrays;

/**
 * 1)exit 退出当前程序
 * 2)arraycopy : 复制数组元素，比较适合底层调用，
 * 一般使用Arrays.copyof完成复制数组
 * 3)currentTimeMillens:返回当前时间距离1970-1-1 的毫秒数
 * 4)gc:运行垃圾回收机制 System.gc0;
 */
public class System_ {
    public static void main(String[] args) {
        //exit 退出当前程序
        //0表示退出状态,正常的状态
        System.out.println("ok1");
        System.exit(0);
        System.out.println("ok1");


        //arraycopy : 复制数组元素，比较适合底层调用，
        //一般使用Arrays.copyof完成复制数组
        int[] src = {1, 2, 3};
        int[] dest = new int[3];
        System.arraycopy(src, 0, dest, 0, 3);
        System.out.println("dest = " + Arrays.toString(dest));


        //currentTimeMillens:返回当前时间距离1970-1-1 的毫秒数
        System.out.println(System.currentTimeMillis());
    }
}
