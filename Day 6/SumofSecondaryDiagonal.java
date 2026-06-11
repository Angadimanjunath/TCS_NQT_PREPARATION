import java.util.*;
public class SumofSecondaryDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][3];
        System.out.println("Enter Number");
        for(int i = 0; i < a.length; i++){
            for (int j = 0; j < a.length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(i+j == a.length-1){
                    sum = sum + a[i][j];
                }
            }
        }
        System.out.println(sum + " ");
    }
    
}
