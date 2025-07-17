package April._18_04_elka;

public class With2ForLoop {
    public static void main(String[] args) {
       triangle(3);
        // 1 -> 1           1 + (1-1) = 1
        // 2 -> 3           2 + (2 -1) = 3
        // 3 -> 5           3 + (3 -1) = 3
        // 4 -> 7           4 + (4 -1) = 7
        // 5 -> 9           5 + (5 -1) = 9
        // 6 -> 11
    }

    public static void triangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1 ; j <= 2 * num - 1; j++) {
                if (j >= num - i + 1 && j <= num + i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public  static  void voidMethod() {
        for(int i = 6; i >= 1 ; i --) {
            System.out.println(i);
        }
    }
}
