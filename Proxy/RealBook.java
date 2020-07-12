package Proxy;

public class RealBook implements BookInterface {
    String bookName = "";
    public RealBook(String bookName) {
        this.bookName = bookName;
    }

	public int getPages() {
        return 50;
    }
}