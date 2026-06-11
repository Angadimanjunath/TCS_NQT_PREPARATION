import java.util.*;
public class ReverseofanArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter Numbers");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("ReverseNumber Array :");
        for(int i = arr.length -1; i >= 0; i--){
            System.out.println(arr[i] + " ");
        }
    }
    
}
