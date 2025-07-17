package April._18_04_elka;

public class With3ForLoop {
    public static void main(String[] args) {
        triangle(3);
    }

    public static void triangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
