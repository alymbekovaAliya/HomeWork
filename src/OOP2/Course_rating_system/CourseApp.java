package OOP2.Course_rating_system;

public class CourseApp {
    public static void main(String[] args) {
        CourseManager courseManager = new CourseManager();
        courseManager.addRating("Java", 10);
        courseManager.addRating("Java", 9);
        courseManager.addRating("Java", 1);
        courseManager.addRating("Java", 5);
        courseManager.addRating("Java", 5);

        courseManager.addRating("Python", 2);
        courseManager.addRating("Python", 3);

        courseManager.addRating("Swift", 5);
        courseManager.addRating("Swift", 5);
        courseManager.addRating("Swift", 5);
//
        System.out.println("---------");
        System.out.println(courseManager.getAverageRating("Java"));
        System.out.println(courseManager.getAverageRating("Python"));
        System.out.println(courseManager.getAverageRating("Swift"));
        System.out.println("---------");
       courseManager.getTopRatedCourse();
        System.out.println("---------");
        courseManager.printAllCourses();

    }
}
