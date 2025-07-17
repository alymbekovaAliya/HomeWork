package Inheritance;

import java.util.List;
import java.util.Map;

public class Person {
    public String name;
    public String surname;
    public Faculty faculty;
    public boolean isTeacher;
    public String who;

    public Person(String name, String surname, Faculty faculty, boolean isTeacher) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.isTeacher = isTeacher;
        who = isTeacher ? "Teacher" : "Student";
    }

    @Override
    public String toString() {
        return   who + " " +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty=" + faculty +
                ", isTeacher=" + isTeacher;
    }
}
