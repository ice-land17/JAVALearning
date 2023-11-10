public class MethodPractice02 {
    public static void main(String[] args) {
        int [] []map = {{0,0,1},{1,1,1},{1,1,3}};
        MyTools tool = new MyTools();//使用方法打印二维数组
        tool.printArr(map);
        tool.printArr(map);
        tool.printArr(map);
    }
}
class MyTools{
     //方法,接收一个二维数组
    public void printArr(int [][]map){
        System.out.println("=============");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}