package OOP.Book;

public class RichMan {
    public static void main(String[] args) {
        Book book = new Book();
        book.name = "Rich man, poor man";
        book.author = "Irwin Shaw";
        book.genre = "Drama";

        System.out.println(book.write());
        System.out.println(book.read("Aliia"));

    }
}
