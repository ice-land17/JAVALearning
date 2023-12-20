package arrays;

import java.util.Arrays;

/**
 *
 */
public class ArraysMethod01 {
    public static void main(String[] args) {
        //直接使用Arrays.toString方法,显示数组
        Integer[] integers = {1, 20, 90};
        System.out.println(Arrays.toString(integers));

        //演示sort方法的使用
        Integer arr[] = {1, -1, -6, 99, 77};
        Arrays.sort(arr);
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));
    }
}
