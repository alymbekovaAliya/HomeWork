package Inheritance;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Alex", "Tolstoy", Faculty.It,true);
        Teacher teacher2 = new Teacher("Maria", "Kuzn", Faculty.Journalist,true);
        Teacher teacher3 = new Teacher("Norn", "Tolstoy", Faculty.Lawyer,true);
        Teacher teacher4 = new Teacher("Dasha", "Evskaya", Faculty.It,true);

        Student student1 = new Student("Dddd", "aaaaaa", Faculty.It, false);
        Student student2 = new Student("Aaaa", "bbbbbb", Faculty.Journalist, false);
        Student student3 = new Student("Bbbb", "gggggg", Faculty.Lawyer, false);
        Student student4 = new Student("фывапро", "уволд", Faculty.Lawyer, false);

        List<Person> residents = new ArrayList<>(Arrays.asList(teacher1,teacher2,teacher3, teacher4, student1, student2, student3, student4));

        University manas = new University("manas",residents);
        manas.getResidents();
    }
}
