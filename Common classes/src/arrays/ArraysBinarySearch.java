package arrays;

import java.util.Arrays;

/**
 * binarySearch 通过二分搜索法进行查找，要求必须排好序
 */
public class ArraysBinarySearch {
    public static void main(String[] args) {
        Integer arr[] = {1, 2, 90, 123, 567};
        //1。使用 binarySearch 二叉查找
        //2.要求该数组是有序的。如果该数组是无序的，不能使用binarySearch
        // 3。如果数组中不存在该元素，就返回 return -(Low + 1); // key not found
        int index = Arrays.binarySearch(arr, -123);
        System.out.println(index);

    }
}
