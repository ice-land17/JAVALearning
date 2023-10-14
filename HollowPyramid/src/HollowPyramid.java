public class HollowPyramid {
    public static void main(String[] args) {
        int totalLevel = 10;
        for (int i = 1; i <= totalLevel; i++) {
            //i表示层数
            for (int k = 1; k <= totalLevel - i; k++) {
                //在输出*之前,还要输出对应空格,总层数减去当前层
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                //控制打印每层的*个数
                if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
