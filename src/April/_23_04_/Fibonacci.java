package April._23_04_;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
        //Выучуить эту задачку на изусть!
    public static String fibonacci(int num) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        int first = 0;
        int second = 1;

        do {
            result.append(first).append(" ");
            int sum = first + second;
            first = second;
            second = sum;
            i++;
        } while (i <= num);

        return result.toString();
    }

}
