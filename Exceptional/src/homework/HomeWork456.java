package homework;

/**
 * 1.编写应用程序EcmDef.java，接收命令行的两个参数(整数)，计算两数相除
 * 2.计算两个数相除，要求使用方法 cal(int n1,int n2)
 * 3.对数据格式不正确NumberformatException、
 * 缺少命令行参数ArraylndexOutOfBoundsException、除0 进行异常处理ArithmeticException
 */
public class HomeWork456 {
    public static void main(String[] args) {
        try {
            //先验证输入的参数的个数是否正确,两个参数
            if (args.length != 2) {
                throw new ArrayIndexOutOfBoundsException("参数个数不对");
            }
            //先把接收到的参数,转成整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1, n2);//该方法可能抛出AirthmeticException
            System.out.println("计算结果是 " + res);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("参数格式不正确,需要输入整数");
        } catch (ArithmeticException e) {
            System.out.println("出现了除0的异常");
        }
    }


    public static double cal(int n1, int n2) {
        return n1 / n2;
    }
}
