public class Test {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("hello");
        System.out.println(str1.length());
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        //字符数组
        char[] values = {'a', 'b', 'c', 'd'};
        String str3 = new String(values);
        System.out.println(str3);

    }
}