import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args) {
        int number1, number2, number3;
        int sum, product, min, max;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first integer : ");
        number1 = in.nextInt();
        System.out.print("Enter second integer : ");
        number2 = in.nextInt();
        System.out.print("Enter third integer : ");
        number3 = in.nextInt();
        in.close();
        sum = number1+number2+number3;
        product  = number1*number2*number3;
        min = number1;
        if(number2 < min){
            min = number2;
        }
        if(number3 < min){
            min = number3;
        }

        max = number1;
        if(number2 > max){
            max = number2;
        }
        if(number3 > max){
            max = number3;
        }
        System.out.println("The sum is: " + sum);   // Print with newline
        System.out.println("The product is: " + product);   // Print with newline
        System.out.println("The min is: " + min);   // Print with newline
        System.out.println("The max is: " + max);   // Print with newline
    }
}
