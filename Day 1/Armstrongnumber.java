import java.util.*;

public class Armstrongnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number");
        int n = sc.nextInt();

        int original = n;
        int temp = n;

        int count = 0;
        int sum = 0;

        // Count digits
        while(temp > 0){
            count++;
            temp /= 10;
        }

        temp = n;

        // Calculate Armstrong sum
        while(temp > 0){
            int digit = temp % 10;
            sum += (int)Math.pow(digit, count);
            temp /= 10;
        }

        if(sum == original){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}