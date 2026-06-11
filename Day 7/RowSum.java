import java.util.*;

public class RowSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];

        System.out.println("Enter Number");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < a.length; i++) {

            int sum = 0;

            for (int j = 0; j < a.length; j++) {
                sum = sum + a[i][j];
            }

            System.out.println("Row " + (i + 1) + " Sum = " + sum);
        }
    }
}