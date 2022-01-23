import java.util.Scanner;

public class SumOfDigitsInt {
    public static void main(String[] args){
        int toReverse;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        toReverse = in.nextInt();
        int sum = 0;
        while (toReverse > 0) {
            int digit = toReverse % 10;  // Extract the least-significant digit
            sum += digit;
            toReverse /= 10;  // Drop the least-significant digit and repeat the loop
        }
        System.out.println("The sum of all digits is: "+sum);
    }
}
