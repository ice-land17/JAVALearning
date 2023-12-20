package math;

/**
 * 基本介绍
 * 数学类包含用于执行基本数学运算的方法，如初等指数、对数、平方根和三角函数
 */
public class MathClass {
    public static void main(String[] args) {
        //看看math常用方法
        //1.abs 绝对值
        int abs = Math.abs(-9);
        System.out.println(abs);

        //2.pow 求幂
        double pow = Math.pow(2, 4);
        System.out.println(pow);

        //3.ceil 向上取整,返回>=该参数的最小整数
        double ceil = Math.ceil(-3.0001);
        System.out.println(ceil);

        //4.floor 向下取整,返回<=该参数的最大整数
        double floor = Math.floor(-4.999);

        //5.round 四舍五入 Math,.floor(该参数+0.5)
        long round = Math.round(-5.001);
        System.out.println(round);

        //6.sqrt 求开方
        double sqrt = Math.sqrt(9.0);
        System.out.println(sqrt);

        //7.random 求随机数
        //思考: 请写出获取a-b之间的一个随机整数,a,b均为整数?2-7
        for (int i = 0; i < 10; i++) {
            System.out.println(Math.random());
        }
    }
}
