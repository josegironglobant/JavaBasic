import java.util.Scanner;

public class Add2Integers {
    public static void main(String[] args){
        int number1, number2;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        number1 = in.nextInt();
        System.out.print("Enter second integer : ");
        number2 = in.nextInt();
        int sum = number1 + number2;
        in.close();
        System.out.println("The sum is: " + sum);   // Print with newline
    }
}
