package customexception;

/**
 * 自定义异常的应用实例
 * 当我们接收Person对象年龄时，要求范围在 18 - 120 之间，
 * 否则抛出一个自定义异常(要求 继承RuntimeException)，并给出提示信息。
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        //要求范围到18-120之间,负责抛出一个自定义异常
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在18-120之间");
        }
        System.out.println("你的年龄范围正确.");
    }
}

class AgeException extends RuntimeException {
    public AgeException(String message) {//构造器
        super(message);
    }
}