public class HomeWork252 {
    public static void main(String[] args) {
        String[] strs = {"jack", "tom", "mary", "milan"};
        A02 a02 = new A02();
        int index = a02.find("tom", strs);
        System.out.println("查找的结果" + index);
    }
}

class A02 {
    //定义方法find，实现查找某字符串是否在字符串数组中，
    // 并返回索引如果找不到，返回-1
    public int find(String findStr, String[] strs) {
        for (int i = 0; i < strs.length; i++) {
            if (findStr.equals(strs[i])) {
                return i;
            }
        }
        return -1;
    }
}