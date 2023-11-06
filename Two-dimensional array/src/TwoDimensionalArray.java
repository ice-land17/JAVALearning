

public class TwoDimensionalArray {

    //二维数组打印
    public static void main1(String[] args) {
        int[][] arr = {{0, 0, 0, 0, 0},
                {1, 1, 1, 1, 1},
                {2, 2, 2, 6, 2},
                {3, 3, 3, 3, 3}};
        System.out.println("二维数组的元素个数" + arr.length);
        System.out.println("第三个一维数组的第四个值是" + arr[2][3]);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main2(String[] args) {
        //二维数组遍历求和
        int arr[][] = {{4, 6}, {1, 4, 5, 7}, {-2}};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("和为" + sum);
    }


    public static void main3(String[] args) {
        //杨辉三角
        int[][] YangHui = new int[12][];
        for (int i = 0; i < YangHui.length; i++) {//遍历
            YangHui[i] = new int[i + 1];
            for (int j = 0; j < YangHui[i].length; j++) {
                if (j == 0 || j == YangHui[i].length - 1) {
                    YangHui[i][j] = 1;
                } else {
                    YangHui[i][j] = YangHui[i - 1][j] + YangHui[i - 1][j - 1];
                }
            }
        }
        for (int i = 0; i < YangHui.length; i++) {
            for (int j = 0; j < YangHui[i].length; j++) {
                System.out.print(YangHui[i][j] + "\t");
            }
            System.out.println();
        }
    }

//    public static void main4(String[] args) {
////        随机生成10个整数(1_10的范围)保存到数组
////        并倒序打印以及求平均值、求最大值和最大值的下标
////                并查找里面是否有8
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (math.random() * 100) + 1;
//        }
//        System.out.println("=======arr的元素情况======");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "\t");
//        }
//        System.out.println("=======arr的元素情况(倒序)======");
//        for (int i = 0; i < arr.length - 1; i--) {
//            System.out.print(arr[i] + "\t");
//        }
//
//        double sum = arr[0];
//        int max = arr[0];
//        int maxIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            if (max < arr[i]) {
//                max = arr[i];
//                maxIndex = i;
//            }
//        }
//        System.out.println("\nmax" + max + "index" + maxIndex);
//        System.out.println("\n平均值" + (sum / arr.length));
//    }


    public static void main(String[] args) {
        //冒泡排序
        int[] arr = {20, -1, 89, 2, 890, 7};
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\n=====排序后======");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
