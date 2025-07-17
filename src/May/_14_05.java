package May;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class _14_05 {
    public static void main(String[] args) {
        findRepeatCharacter2();

    }

    public static void findRepeatCharacter2() {
        String str = "acbdefdbcgha";
        HashSet<Character> charsSet = new HashSet<>();

        for(int i = 0; i < str.length(); i++) {
            if(!charsSet.contains(str.charAt(i))) {
                charsSet.add(str.charAt(i));
            } else {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }

}
