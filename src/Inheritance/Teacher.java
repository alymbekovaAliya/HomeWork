package Inheritance;

public class Teacher extends Person{

    public Teacher(String name, String surname, Faculty faculty, boolean isTeacher) {
        super(name, surname, faculty, isTeacher);
    }

    public void toTeach() {
        System.out.println(this.name + " is teaching" + " at the faculty: " + this.faculty);
    }
}
