package April._22_04_;

import java.util.Scanner;

public class HomeWorkDoWhile {
    public static void main(String[] args) {
        greeting2();
    }

    public static void greeting() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите ваше имя");
            String userName = scanner.nextLine();

            System.out.println("Добро Пожаловать! " + userName);

            System.out.println("Вы хотите повторить? Да/Нет");
            String userAnswer = scanner.nextLine();

            if (userAnswer.equals("Нет")) {
                break;
            }

        }
    }

    public static void greeting2() {
        Scanner scanner = new Scanner(System.in);
        String userAnswer = "";

        do {
            System.out.println("Введите ваше имя");
            String userName = scanner.nextLine();

            System.out.println("Добро Пожаловать! " + userName);

            System.out.println("Вы хотите повторить? Да/Нет");
             userAnswer = scanner.nextLine();
        } while (userAnswer.equalsIgnoreCase("Да"));


    }
}
