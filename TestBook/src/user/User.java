package user;

import book.BookList;
import operate.IOPeration;

public abstract class User {
    protected String name;
    protected IOPeration[] ioPerations;

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void dowork(int choice, BookList bookList) {
        this.ioPerations[choice].work(bookList);
    }
}
