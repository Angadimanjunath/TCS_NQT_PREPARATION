import java.util.*;

public class ReverseUsingStringNumberStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        String num = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < num.length(); i++) {
            stack.push(num.charAt(i));
        }
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}