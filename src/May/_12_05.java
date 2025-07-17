package May;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class _12_05 {
    public static void main(String[] args) {
        evenNumbersToEnd();
    }

    public static void evenNumbersToEnd() {
        LinkedList<Integer> numbers = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        LinkedList<Integer> oddNumbers = new LinkedList<>();
        LinkedList<Integer> evenNumbers = new LinkedList<>();
        Iterator<Integer> itr = numbers.iterator();

        while (itr.hasNext()) {
            int num = itr.next();
            if (num % 2 != 0) {
                oddNumbers.add(num);

            } else {
                evenNumbers.add(num);
            }
        }

        oddNumbers.addAll(evenNumbers);
        System.out.println(oddNumbers);

    }
}
