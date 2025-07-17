package May;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class _04_05 {
    public static void main(String[] args) {
        String[] words = {"book", "apple", "hello", "test", "java"};
        deleteWordIfContainsDuplicate(words);
    }

    public static void deleteWordIfContainsDuplicate(String[] words) {
        List<String> wordsList = new ArrayList<>(Arrays.asList(words));
        Iterator<String> itr = wordsList.iterator();

        while (itr.hasNext()) {
            String word = itr.next();

            for (int i = 0; i < word.length() - 1; i++) {
                if (word.charAt(i) == word.charAt(i + 1)) {
                    itr.remove();
                    break;
                }
            }
        }

        System.out.println(wordsList);
    }

}
