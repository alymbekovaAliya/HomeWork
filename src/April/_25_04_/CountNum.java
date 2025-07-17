package April._25_04_;

public class CountNum {

    public static void main(String[] args) {
        int numbers[] = {12, 68, 0, -34, 0, 24, 12, 0, -5, -9, 7, 0, 99};
        count(numbers);
    }

    public static void count(int[] numbers) {
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int number : numbers) {
            if (number == 0) zero += 1;
            if (number < 0) negative += 1;
            if (number > 0) positive += 1;
        }

        System.out.println("положительные числа: " + positive + "\n" + "отрицательные числа: " + negative + "\n" + "нули: " + zero);
    }
}
