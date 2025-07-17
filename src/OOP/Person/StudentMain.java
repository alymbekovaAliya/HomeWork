package OOP.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class StudentMain {
    public static void main(String[] args) {
        Student st1 = new Student(1380352449, "aliia", "alymbekova", 21);
        Student st2 = new Student(0, "shar", "jakupov", 31);
        Student st3 = new Student(3212, "ilizar", "alymbekov", 23);
        Student st4 = new Student(123456, "ulan", "alymbekov", 23);
        Random random = new Random();

        List<Student> listOfStudent = new ArrayList<>(Arrays.asList(st1, st2, st3, st4));

            for (Student st : listOfStudent) {
                if(st.id < 100000) {
                    st.id = random.nextInt(100000,1000000);
                    System.out.println( "\u001B[31m" + st.name + " Ваш айди был не дейстивтелен мы изменили его на: " + st.id + "\u001B[0m");
                }

                    if (st.age >= 18 && st.age <= 19) {
                        System.out.println(st.name + " вы 1 курс");
                    } else if (st.age >= 20 && st.age <= 21) {
                        System.out.println(st.name + " вы 2 курс");
                    } else if (st.age >= 22 && st.age <= 23) {
                        System.out.println(st.name + " вы 3 курс");
                    } else {
                        System.out.println(st.name + " Вы не является студентом");
                    }
                }

    }
}
