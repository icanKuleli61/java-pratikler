package KitabListesi;

public class Book {

    private String bookName;
    private String bookAuthor;
    private int bookCount;
    private int bookData;

    public Book(String bookName, String bookAuthor, int bookCount, int bookData) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookCount = bookCount;
        this.bookData = bookData;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public int getBookData() {
        return bookData;
    }

    public void setBookData(int bookData) {
        this.bookData = bookData;
    }
}
