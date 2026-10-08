package practiceAssignment.collectionDay1;

public class Books {
    private int bookid;
    private String title;
    private String author;
    private int price;

    public Books(int bookid, String title, String author, int price) {
        this.bookid = bookid;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Books(){}

    @Override
    public String toString() {
        return "Books{" +
                "bookid=" + bookid + ", title='" + title + '\'' +
                ", author='" + author + '\'' + ", price=" + price +
                '}'+'\n';
    }

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
