package book;

public class Book {
    private String name;//名字
    private String author;//作者
    private int price;//价格
    private String type;//类型
    private boolean isBorrowed;//是否被借出

    public Book(String name, String author, int price, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
    }

    public String getName() {//名字
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {//作者
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {//价格
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {//类型
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {//是否被借出
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
               //", isBorrowed=" + isBorrowed +
                (isBorrowed == true ? "已经被借出" : "未被借出")+
                '}';
    }
}
