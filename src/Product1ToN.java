public class Product1ToN {
    public static void main (String[] args) {
        int product = 1;      // The accumulated product, init to 1
        long fact = 1;
        final int LOWERBOUND = 20;
        final int UPPERBOUND = 10;
        for (int number = 1; number <= LOWERBOUND; number++) {
            fact = fact * number;
            product = product * number;
        }
        System.out.println("Factorial of " + LOWERBOUND + " with Long is: " + fact);
        System.out.println("Factorial of " + LOWERBOUND + " with Int is: " + product);
        if (fact > product) {
            System.out.println("Factorial with Long is Higher");
        } else {
            System.out.println("Factorial with int is equals or minus");
        }
    }
}
