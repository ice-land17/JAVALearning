
public class MethodExercise01 {
    public static void main(String[] args) {
        AB a = new AB();
        if (a.isOdd(2)) {
            System.out.println("是奇数");
        } else {
            System.out.println("是偶数");
        }
        a.print(10,20,'*');
    }
}

class AB {
    //1.编写类AA ，有一个方法: 判断一个数是奇数odd还是偶数,返回boolean
    public boolean isOdd(int num) {
        return num % 2 != 0;
    }
    //2.根据行、列、字符打印 对应行数和列数的字符，
    // 比如: 行: 4，列:4，字符#,则打印相应的效果

    public void print(int row, int col, char c) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <col ; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}