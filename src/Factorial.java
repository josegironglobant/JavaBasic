public class Factorial {
    public static void main(String[] args) {  // Set an initial breakpoint at this statement
        int n = 20;
        long factorial = 1; //change this line, numbers > 10 variable is long, the better is using Long ever
        // n! = 1*2*3...*n
        for (int i = 1; i <= n; i++) {  // i = 1, 2, 3, ..., n
            factorial = factorial * i;   // *
        }
        System.out.println("The Factorial of " + n + " is " + factorial);
    }
}
