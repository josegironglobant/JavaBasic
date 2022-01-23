import java.util.Scanner;

public class ReverseInt {
    public static void main(String[] args){
        int toReverse;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        toReverse = in.nextInt();
        while (toReverse > 0) {
            int digit = toReverse % 10;  // Extract the least-significant digit
            // Print this digit
            System.out.print(digit);
            toReverse /= 10;  // Drop the least-significant digit and repeat the loop
        }
    }
}
