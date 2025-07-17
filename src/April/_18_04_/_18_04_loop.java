package April._18_04_;

public class _18_04_loop {
    public static void main(String[] args) {
        //Через цикл найти вторую букву О , вывести предложение полность
        // если не найдет нужно сазать что второй символ не найден

//        Вывести числа от 1 до 30.
//        Если число делится на 3 — вывести Fizz
//        Если на 5 — Buzz
//        Если на 3 и 5 — FizzBuzz
//        Иначе — само число

        System.out.println(fizz(5));
//        System.out.println(secondO("Alooo"));
    }

    public static String fizz(int num) {
        String result = "";

        if(num < 1 || num > 30) {
            return result = "Число в не диапозона";
        }


            for (int i = 1; i <= num; i ++) {
                if(i % 5 == 0 && i % 3 == 0) {
                    result = "FizzBuzz";
                } else if (i % 3 == 0) {
                    result = "Fizz";
                } else if (i % 5 == 0) {
                    result = "Buzz";
                } else {
                    result = "Число не делится ни на 3, ни на 5";
                }
            }

        return result;
    }

    public static String secondO(String word) {
        int counter = 0;

        for (int i = 0; i < word.length(); i ++) {
            if(word.toLowerCase().charAt(i) == 'o') {
                counter +=1;
            }
        }
        return counter >= 2 ? word : "второй символ 'O' не найден";
    }
}
