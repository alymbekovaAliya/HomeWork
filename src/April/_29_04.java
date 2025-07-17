package April;

public class _29_04 {
    public static void main(String[] args) {
        String[] str = {"welcome", "coffee", "tea", "number", "string"};
        String[] strA = {"Awelcome", "coffee", "Atea", "number", "string"};
        maxLength(str);
        sumStrings(str);
        getSentence(str);
        startWithA(strA);
    }

    public static void maxLength(String []str) {

        String maxString = "";
        int oldLength = 0;

        for (String s : str) {
            if (s.length() > oldLength) {
                oldLength = s.length();
                maxString = s;
            }
        }
        System.out.println(maxString);
    }

    public static void sumStrings(String []str) {
        int sum = 0;
        for (String s: str) {
            sum+= s.length();
        }
        System.out.println(sum);
    }

    public static void getSentence(String []str) {
        String singleSentence = String.join("",str);
        System.out.println(singleSentence);
    }

    public static void startWithA(String []str) {
       for(String s : str) {
           if(s.charAt(0) == 'A') {
               System.out.print(s + " ");
           }
       }
    }

}
