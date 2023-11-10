public class HomeWork253 {
    public static void main(String[] args) {
        Book book =  new Book("笑傲江湖",30);
        book.info();
        book.updatePrice();
        book.info();
    }
}

class Book {
    //定义方法updatePrice，实现更改某本书的价格，
    // 具体: 如果价格>150,则更改为150，如果价格>100,更改为100，否则不变
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void updatePrice() {
        if (price > 150) {
            price = 150;
        } else if (price > 100) {
            price = 100;
        }
    }

    //显示书籍情况
    public void info() {
        System.out.println("书名为=" + this.name + "  价格" + this.price);
    }
}