package Inheritance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class University {
    public String name;
    public List<Person> residents;

    public University(String name, List<Person> residents) {
        this.name = name;
        this.residents = residents;
    }

    public void getResidents() {

        Map<String, Faculty> mapOfStudents = new HashMap<>();
        Map<String, Faculty> mapOfTeachers = new HashMap<>();
        Map<Faculty, Integer> howManyPeople = new HashMap<>();

        for (Person resident : residents) {
            if (resident.isTeacher) {
                mapOfTeachers.put(resident.who + ": "+ resident.name, resident.faculty);
            } else {
                mapOfStudents.put(resident.who + ": "+resident.name, resident.faculty);
            }
        }

        for (Person resident : residents) {
            Faculty faculty = resident.faculty;
            int count = howManyPeople.getOrDefault(faculty, 0);
            howManyPeople.put(faculty, count + 1);
        }


        System.out.println(mapOfTeachers);
        System.out.println(mapOfStudents);
        System.out.println(howManyPeople);

    }
}
