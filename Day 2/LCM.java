import java.util.*;

public class LCM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int a = n1;
        int b = n2;

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }

        int gcd = a;
        int lcm = (n1 * n2) / gcd;

        System.out.println("LCM = " + lcm);

        sc.close();
    }
}