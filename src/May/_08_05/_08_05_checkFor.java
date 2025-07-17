package May._08_05;

public class _08_05_checkFor {
    public static void main(String[] args) {
        String str = "aliia";

        for (int i = 0; i < str.length(); i++) {
            for(int j = 0; j < str.length(); j++) {
                System.out.println( i + " " + j);
                System.out.println(str.charAt(i) + " " + str.charAt(j));
            }
        }

        System.out.println("--------------");

        for (int i = 0; i < str.length(); i++) {
            for(int j = 0; j < i; j++) {
                System.out.println( i + " " + j);
                System.out.println(str.charAt(i) + " " + str.charAt(j));
            }
        }

    }
}
