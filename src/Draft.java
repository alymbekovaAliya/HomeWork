import java.util.*;

public class Draft {
    public static void main(String[] args) {
        System.out.println(sayHello(new String[]{"aliia", "alymbekova"}, "Bishkek", "Baytik"));

        //Почему Integer a = 128; Integer b = 128; System.out.println(a == b); напечатает false, а для 127 будет true?
        //В Java объекты типа Integer от -128 до 127 кэшируются.
        Integer a = -128;
        Integer b = -128;
        System.out.println(a == b);

        //Оператор continue прерывает текущую итерацию и переходит к следующей, не доходя до i++.(бесконечный цикл)
//        int i = 0;
//        while (i < 5) {
//            if (i == 3) continue;
//            System.out.println(i++);
//        }

//        String s = null;
//        switch(s) {
//            case "a": System.out.println("a"); break;
//            default: System.out.println("default");
//        }

    }

    public static String sayHello(String [] name, String city, String state){
        return String.format("Hello, %s! Welcome to %s, %s!",String.join(" ", name),city,state);
    }

    public static void printLength(int[] arr) {
        System.out.println(arr.length);
    }


}
