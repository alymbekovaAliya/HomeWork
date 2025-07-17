import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int closest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int t = in.nextInt();

            if (Math.abs(t) < Math.abs(closest) || Math.abs(t) == Math.abs(closest) && t > closest){
                closest = t;
            }

        }

        System.out.println(closest);
    }
}

