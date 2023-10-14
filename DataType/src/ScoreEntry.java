import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class ScoreEntry {
    //学生成绩录入
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        double totalScore = 0;//累计所有学生的成绩
        int passNum = 0;//累积的及格人数
        for (int i = 1; i <= 3; i++)//i表示班级
        {
            double sum = 0;//一个班级的总分
            for (int j = 1; j <= 5; j++)//j表示学生
            {
                System.out.println("请输入第" + i + "个班的学生的第" + j + "个学生的成绩");
                double score = myScanner.nextDouble();

                //当有一个学生成绩>=60 passNum++
                if (score >= 60) {
                    passNum++;
                }
                sum += score;//累计
                System.out.println("成绩为" + score);
            }
            System.out.println("sum=" + sum + "平均分=" + (sum / 5));
            //把sum累积到totalScore
            totalScore += sum;
        }
        System.out.println("三个班总分为" + totalScore + "平均分为=" + totalScore / 5);
        System.out.println("及格人数=" + passNum);
    }
}
