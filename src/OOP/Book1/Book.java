package OOP.Book1;

public class Book {
    public String name;
    public String author;
    public int date;
    public int editionSize;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(int date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", date=" + date +
                ", editionSize=" + editionSize +
                '}';
    }
}
