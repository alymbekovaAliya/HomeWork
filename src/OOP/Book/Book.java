package OOP.Book;

public class Book {
    public String name;
    public String author;
    public String genre;

    public String write() {
        return "Book was written by " + author + " in the " + genre + " genre";
    }

    public String read(String readerName) {
        return readerName + " is reading " + name;
    }

}
