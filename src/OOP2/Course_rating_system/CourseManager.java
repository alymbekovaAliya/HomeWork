package OOP2.Course_rating_system;

import java.util.*;

public class CourseManager implements Rateable{

    private final Map<String, List<Integer>> allRating = new HashMap<>();

    @Override
    public void addRating(String courseName, int rating) {
        if (!isValidNumber(rating)) return;
        allRating.putIfAbsent(courseName, new ArrayList<>());
        allRating.get(courseName).add(rating);
    }

    @Override
    public double getAverageRating(String courseName) {
        double result = 0;
        if(allRating.containsKey(courseName)) {
           List<Integer> numbers = allRating.get(courseName);
           for(int num: numbers) {
               result+= num;
           }
           result = result/numbers.size();
        }

        return Math.round(result);
    }

    @Override
    public void getTopRatedCourse() {
        double maxRate = 0;
        String top = "";

        for (String course: allRating.keySet()) {
            double temp = getAverageRating(course);
            if(maxRate > temp) {
                System.out.println("топовый курс это " + top + " :" + maxRate);
            } else {
                maxRate = temp;
                top = course;
            }

        }
    }


    private boolean isValidNumber(int rating) {
        return rating >= 1 && rating <= 5;
    }

    public void printAllCourses() {
        for(String course: allRating.keySet()) {
            System.out.println(course);
        }
    }
}
