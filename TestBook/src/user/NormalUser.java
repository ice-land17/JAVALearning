package user;

import operate.*;
import org.omg.CORBA.BAD_INV_ORDER;

import java.util.Scanner;

public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.ioPerations = new IOPeration[]{
                new FindOperation(),
                new BrrowOperation(),
                new ReturnOperation(),
                new ExitOperation()
        };
    }

    public int menu() {
        System.out.println("在寝室打游戏好没意思。早都玩腻了。");
        System.out.println(" hello" + name + " 欢迎来图书馆学习");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("================");
        System.out.println("请输入你的操作: ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
