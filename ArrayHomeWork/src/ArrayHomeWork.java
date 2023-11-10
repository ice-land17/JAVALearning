public class ArrayHomeWork {
    public static void main1(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 67, 88};
        int max = arr[0];
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("max=" + max + "indexmax" + maxIndex);
    }


    public static void main2(String[] args) {
        //数组反转
        int arr[] = {66, 55, 44, 33, 22, 11};
        int tmp = 0;
        int len = arr.length;
        for (int i = 0; i < len / 2; i++) {
            tmp = arr[len - 1 - i];
            arr[len - 1 - i] = arr[i];
            arr[i] = tmp;
        }
        System.out.println("=============");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }


    public static void main3(String[] args) {
        //数组扩容
        int arr[] = {1, 2, 3};
        int[] arrNew = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i];
        }
        arrNew[arrNew.length - 1] = 4;
        arr = arrNew;
        System.out.println("==========");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }


    public static void main(String[] args) {
//        bubble sort
        int[] arr = {88,55,66,11,2,5,1,77,18};
        int tmp = 0;
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
            System.out.println("\n==第"+(i+1)+"轮==");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]+"\t");
            }
        }
    }
}
