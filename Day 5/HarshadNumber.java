import java.util.Scanner;
class HarshadNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int o = n;
        int sum = 0;
        while(n>0){
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        if(o%sum==0){
            System.out.println("HarshadNumber");
        }
        else{
            System.out.println("Not an HarshadNumber");
        }
    }
 }