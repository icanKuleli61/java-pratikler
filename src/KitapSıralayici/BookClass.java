package KitapSıralayici;

public class BookClass implements Comparable<BookClass> {

    private String bookName;
    private String bookAuthor;
    private int bookCount;
    private String bookData;


    @Override
    public int compareTo(BookClass o) {
        return this.bookName.compareTo(o.bookName);
    }


    public BookClass(String bookName, String bookAuthor, int bookCount, String bookData) {
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

    public String getBookData() {
        return bookData;
    }

    public void setBookData(String bookData) {
        this.bookData = bookData;
    }

    @Override
    public String toString() {
        return "BookClass{" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookCount=" + bookCount +
                ", bookData='" + bookData + '\'' +
                '}';
    }


}
