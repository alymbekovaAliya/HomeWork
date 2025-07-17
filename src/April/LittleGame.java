package April;

import java.io.IOException;

public class LittleGame {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'B';

        System.out.println("Какую букву я загадал?");
        System.out.print("Попытайтесь ее угадать: ");

        ch = (char)System.in.read();


        if(ch == answer) {
            System.out.print("Поздравляю! ");
        } else if(ch > answer ) {
            System.out.print("Ты перестарался: ");
        } else {
            System.out.print("Ты недостарался: ");
        }

    }
}
