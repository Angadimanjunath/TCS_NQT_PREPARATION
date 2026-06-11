import java.util.*;

public class SpiralTraversal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];

        System.out.println("Enter numbers:");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int top = 0;
        int bottom = 2;
        int left = 0;
        int right = 2;

        while(top <= bottom && left <= right) {

            // Top Row
            for(int i = left; i <= right; i++) {
                System.out.print(a[top][i] + " ");
            }
            top++;

            // Right Column
            for(int i = top; i <= bottom; i++) {
                System.out.print(a[i][right] + " ");
            }
            right--;

            // Bottom Row
            for(int i = right; i >= left; i--) {
                System.out.print(a[bottom][i] + " ");
            }
            bottom--;

            // Left Column
            for(int i = bottom; i >= top; i--) {
                System.out.print(a[i][left] + " ");
            }
            left++;
        }
    }
}