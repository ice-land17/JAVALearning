package homework;

/**
 * 1.编写java程序，输入形式为: Han Shun Ping的人名，以Ping,Han .S的形式打印出来其中.S是中间单词的首字母。
 * 2.例如输入Willian Jefferson Clinton"输出形式为: Clinton,Willian .J
 */
public class HomeWork03 {
    public static void main(String[] args) {
        String name = "Han shun Ping";
        printName(name);
        String name1 = "Willian Jefferson Clinton";
        printName(name1);
    }

    public static void printName(String str) {
        if (str == null) {
            System.out.println("str不能为空");
            return;
        }
        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("输入的字符串格式不对");
            return;
        }
        String formate = String.format("%s,%s.%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(formate);
    }
}
