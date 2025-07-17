package OOP.Book1;

import java.util.ArrayList;
import java.util.Arrays;

public class BookMain {
    public static void main(String[] args) {
        Book firstTeacher = new Book("Первый учитель", "Чынгыз Айтматов");
        Book wordAndPeace = new Book("Война и мир ", "Лев Толстой");
        Book annaKarenina = new Book("Анна Каренина", "Лев Толстой");
        Book zhamila = new Book("Жамиля", "Чынгыз Айтматов");
        Book unesen = new Book("Унесенные ветром", "Маргарет Митчел");

        ArrayList<Book> books = new ArrayList<>(Arrays.asList(firstTeacher, wordAndPeace, annaKarenina, zhamila, unesen));
        ArrayList<Book> chA = new ArrayList<>();
        ArrayList<Book> lT = new ArrayList<>();
        ArrayList<Book> another = new ArrayList<>();

        for (Book b : books) {
            if (b.author.equals("Чынгыз Айтматов")) {
                chA.add(b);
            } else if (b.author.equals("Лев Толстой")) {
                lT.add(b);
            } else {
                another.add(b);
            }
        }

        System.out.println(books);
        System.out.println(chA);
        System.out.println(lT);
        System.out.println(another);
    }
}
