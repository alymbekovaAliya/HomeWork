package May;

public class _15_05 {
    public static void main(String[] args) {
        System.out.println(rating("sun", new int[] {4,1,5,5,5}, 1));
    }


    public static String rating(String name, int[] ratings, int lateCount) {
        double average = 0;

        for(int i = 0; i < ratings.length; i++) {
            average += ratings[i];
        }

        return (ratings.length >= 5 && (average / ratings.length > 4) && lateCount <= 1) ? "Good driver: " + name : "Not qualified: " + name;
    }

}
