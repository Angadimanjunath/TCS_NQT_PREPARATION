import java.util.Scanner;

public class KthBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number:");
        int n = sc.nextInt();

        System.out.println("Enter K value:");
        int k = sc.nextInt();

        int mask = 1 << (k - 1);

        if ((n & mask) != 0) {
            System.out.println("Kth bit is SET");
        } else {
            System.out.println("Kth bit is NOT SET");
        }
    }
}