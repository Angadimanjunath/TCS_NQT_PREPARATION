

import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbber");
        int n = sc.nextInt();
        int original = n;
        int s = n*n;
        int sum = 0;
        while(s>0){
            int digit = s%10;
            sum = sum+digit;
            s/=10;
        }
        if(n==sum){
            System.out.println("NeonNumber");
        }
        else {
            System.out.println("Not a NeonNumber");
        }
    }
    
}
