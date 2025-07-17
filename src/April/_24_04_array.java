package April;

public class _24_04_array {
    public static void main(String[] args) {
//        System.out.println(isThere(2));
        //delete
        //deleteCharAt

    }

    public static String isThere(int number) {
        String result = "";
        int []numbers = {22,44,55,6,7,8,9,2};
        int i = 0;

        for(int num: numbers) {
            if(num == number) {
                break;
            }

            i++;
        }

        return i == numbers.length ? "Нет этого числа" : result + i;
    }

    public static class _01_05_arrayList {
        public static void main(String[] args) {

        }
    }
}
