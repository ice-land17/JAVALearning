package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/**
 * 案例: 自定义Book类，里面包含name和price，按price排序(从大到小)。
 * 要求使用两种方式排序，对对象的某个属性排序,有一个Bookll books = 5本书对象.
 * 使用前面学习过的传递 实现Comparator接口匿名内部类，也称为定制排序。
 * 可以按照 price (1)从大到小 (2)从小到大 (3) 按照书名长度从大到小
 */
public class ArraysExer01 {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("金瓶梅新", 90);
        books[2] = new Book("青年文摘666", 5);
        books[3] = new Book("JAVA从入门到放弃", 300);


        //(1)price从大到小
        Arrays.sort(books, new Comparator() {
            //这里是对books数组排序,因此o1和o2就是book对象
            @Override
            public int compare(Object o1, Object o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                double priceVal = book2.getPrice() - book1.getPrice();
                if (priceVal > 0) {
                    return 1;
                } else if (priceVal < 0) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
    }
}

class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}