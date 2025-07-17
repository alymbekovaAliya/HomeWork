package OOP2.Course_rating_system;

public interface Rateable {
    void addRating(String courseName, int rating);
    double getAverageRating(String courseName);
    void getTopRatedCourse();

    default void printCourseInfo(String courseName) {
        System.out.println(courseName);
    }

    static void displayInstructions() {
        System.out.println("Что бы записаться на курсы вы должны заплтатить 50% от стоимости");
    }

}
