package May;

import java.util.ArrayList;

public class _01_05 {
    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>();
        first.add("apple");
        first.add("melon");
        first.add("orange");
        first.add("kiwi");

        System.out.println(first);


        ArrayList<String> second = new ArrayList<>();
        second.add("banana");
        second.add("grape");
        second.add("kiwi");
        second.add("melon");
        System.out.println(second);

        thirdArrayList(first, second);
    }

    public static void thirdArrayList(ArrayList<String> first, ArrayList<String> second) {
        ArrayList<String> third = new ArrayList<>();

        int maxLength = Math.max(first.size(), second.size());

        for (int i = 0; i < maxLength; i++) {
            if (i < first.size()) {
                if (!second.contains(first.get(i)) && !third.contains(first.get(i))) {
                    third.add(first.get(i));
                }
            }

            if (i < second.size()) {
                if (!first.contains(second.get(i)) && !third.contains(second.get(i))) {
                    third.add(second.get(i));
                }
            }

        }
        System.out.println(third);
    }
}
