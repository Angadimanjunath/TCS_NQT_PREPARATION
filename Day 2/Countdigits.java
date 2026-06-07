import java.util.*;
public class Countdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int count = 0;
        while(n>0){
            int digit = n%10;
            count++;
            n/=10;
        }
        System.out.println(count);

    }
    
}
