import java.util.Scanner;

public class Swap2Integers {
    public static void main(String[] args) {
        int number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        number1 = in.nextInt();
        System.out.print("Enter second integer: ");
        number2 = in.nextInt();
        int temp = number2;
        number2 = number1;
        number1 = temp;
        System.out.println("After the swap, first integer is: "+number1+", second integer is: "+number2);
    }
}
