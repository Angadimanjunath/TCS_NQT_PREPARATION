
import java.util.Scanner;
import java.util.Stack;

public class OddStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<n; i++){
            int num = sc.nextInt();
            if(num%2!=0){
                stack.push(num);

            }
        }
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
    
}
