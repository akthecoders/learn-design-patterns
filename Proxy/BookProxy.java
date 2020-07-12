package Proxy;

public class BookProxy implements BookInterface { 
    BookInterface book = null;
    String bookName = "";

    public BookProxy(String bookName) {
        this.bookName  = bookName;
    }

    public int getPages() {
        if(this.book == null) {
            this.book = new RealBook(this.bookName);
        }
        return this.book.getPages();
    }
}