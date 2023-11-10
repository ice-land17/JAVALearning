public class HomeWork251 {
    public static void main1(String[] args) {
        Max m1 = new Max();
        double arr [] = {5,6,72,66.9,99};
        System.out.println(m1.max(arr));
    }
}


class Max{
    //实现求某个double数组的最大值，并返回
    public double max(double arr []){
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
