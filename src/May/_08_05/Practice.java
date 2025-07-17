package May._08_05;

public class Practice {
    public static void main(String[] args) {
        nTwice();

    }

    public static void nTwice() {
        String str = "Chocolate";
        int n = 3;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < str.length(); i++) {
         boolean b = false;
        }
        System.out.println(sb);

    }

    public boolean endsLy(String str) {
        boolean result = false;

        if (str.length() > 1) {
            if (str.lastIndexOf("ly") == str.length() - 2) {
                result = true;
            }
        }


        return result;
    }

    public static void middleTwo() {
        String str = "string";
        String newStr = "";
        int i = 0;

        if (str.length() % 2 == 0) {
            newStr = str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
        }
        System.out.println(newStr);
    }

    public static void between() {
        String str = "ab";
        String result = "";

        if (str.length() > 2) {
            result = str.substring(1, str.length() - 1);
        }

        System.out.println(result);
    }


    public static String theEnd() {
        String str = "hello";
        boolean front = true;

        return front ? String.valueOf(str.charAt(0)) : String.valueOf(str.charAt(str.length() - 1));
    }

    public static void right2() {

        String str = "java";
        String str2 = str;

        if (str.length() > 2) {
            str2 = String.valueOf(str.charAt(str.length() - 2)) + str.charAt(str.length() - 1) + str.substring(0, str.length() - 2);
        }

        System.out.println(str2);
    }

    public static void firstTwo2End() {
        String str = "java";
        String str2 = str;

        if (str.length() > 2) {
            char f = str.charAt(0);
            char s = str.charAt(1);

            str2 = str.substring(2) + f + s;
        }


        System.out.println(str2);
    }


    public static void deleteYak() {
        String yak = "yakpak";
        String result = "a";

        if (yak != "yak" && (yak.contains("yak"))) {

        }
        System.out.println(result);
    }
}
