package Proxy;

public class Main {
    public static void main(String[] args) {
        BookInterface book = new BookProxy("new book");
        System.out.println(book.getPages());
    }
}