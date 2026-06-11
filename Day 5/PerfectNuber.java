import java.util.Scanner;
public class PerfectNuber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        int o = n;
        int sum = 0;
        for(int i = 1; i<n;i++){ 
            if(n%i==0){ 
            sum=sum+i;
            }
        }
        if(sum>o){
            System.out.println("PerfectNumber");
        }
        else{
            System.out.println("Not PerfectNumber");
        }
    }
    
}
