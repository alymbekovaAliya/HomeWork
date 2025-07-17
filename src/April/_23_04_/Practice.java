package April._23_04_;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

    }

    public static void fi() {
        Scanner scanner = new Scanner(System.in);
        int user_num = 0;
        int new_num = 0;
        int f0 = 0;
        int f1 = 1;
        int count = 0;

        System.out.println("Введите число для определения числа Фи");
        user_num  = scanner.nextInt();

        while (count <= user_num) {
            System.out.print(f0);
            new_num = f0 + f1;
            f0 = f1;
            f1 = new_num;
            count++;
        }
    }

}
