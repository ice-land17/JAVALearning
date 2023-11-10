class AA {
    //1.一个方法最多有一个返回值[如何返回多个结果,返回数组]
    public int[] getSumAndSub(int n1, int n2) {
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    //2.返回类型可以为任意类型,包含基本类型或引用类型(数组,对象),具体看getSumAndSub


    public int f1() {
        //3.如果方法有返回数据类型,则方法体中最后执行语句必须为return值;
        // 而且要求返回值类型必须和return的值类型一致或兼容
        double d1 = 1.1 * 3;
        int n = 100;
        return n;
    }

    public void f2(){
        //4.如果方法是void,则方法体中可以没有return语句,或者只写"return".
        System.out.println("h");
        System.out.println("h");
        System.out.println("h");
        return ;
    }

    //方法名:
    //遵循驼峰命名法，最好见名知义，表达出该功能的意思即可,比如 得到两个数的和getSum,开发中按照规范
}
//注意事项和使用细节
//(1)形参列表
//        1.一个方法可以有0个参数，也可以有多个参数，中间用逗号隔开,比如 getSum(int n1,int n2)
//        2.参数类型可以为任意类型，包含基本类型或引用类型，比如 printArr(intll map)
//        3.调用带参数的方法时，一定对应着参数列表传入相同类型或兼容类型 的参数!getSum
//        4.方法定义时的参数称为形式参数，简称形参:方法调用时的参数称为实际参数简称实参，
//        实参和形参的类型要一致或兼容、个数、顺序必须一致![演示]
//(2)方法体
//        里面写完成功能的具体的语句，可以为输入输出、变量、运算、分支、循环、方法调用，
//        但里面不能再定义方法!即:方法不能嵌套定义。[演示)

public class MethodDetail01 {
    public static void main(String[] args) {
        AA a = new AA();
        int[] res = a.getSumAndSub(1, 4);
        System.out.println("和等于" + res[0]);
        System.out.println("差等于" + res[1]);
    }
}
