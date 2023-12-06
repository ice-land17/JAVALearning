package tryc;

/**
 * try-catch方式处理异常说明
 * 1.Java提供try和catch块来处理异常。try块用于包含可能出错的代码。
 * catch块用于处理try块中发生的异常。可以根据需要在程序中有多个try...catch块。
 * 2.基本语法
 * try {
 * //可疑代码
 * //将异常生成对应的异常对象，传递给catch块
 * {catch(异常)}
 * //对异常的处理
 * }
 */
public class TryCatch {
    public static void main(String[] args) {
        //1.如果异常发生了，则异常发生后面的代码不会执行，直接进入到catch块
        //2.如果异常没有发生，则顺序执行try的代码块，不会进入到catch
        //3.如果希望不管是否发生异常，都执行某段代码(比如关闭连接，释放资源等)则使用如下代码- finally
        //4.可以有多个catch语句，捕获不同的异常(进行不同的业务处理)，
        // 要求父类异常在后，子类异常在前，比如(Exception 在后，NullPointerException在前)，
        // 如果发生异常，只会匹配一个catch,案例演示
        try {
            String str = "123";
            int a = Integer.parseInt(str);
            System.out.println("数字: " + a);
        } catch (NumberFormatException e) {
            System.out.println("异常信息=" + e.getMessage());
        } finally {
            System.out.println("finally代码块被执行");
        }
        System.out.println("程序继续---");
    }
}
