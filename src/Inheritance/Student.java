package Inheritance;

public class Student extends  Person{
    public Student(String name, String surname, Faculty faculty, boolean isTeacher) {
        super(name, surname, faculty, isTeacher);
    }

    public void toLearn() {
        System.out.println(this.name + " is learning" + " at the faculty: " + this.faculty);
    }
}
