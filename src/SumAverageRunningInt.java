public class SumAverageRunningInt {
    public static void main (String[] args) {
        // Define variables
        int sum = 0;          // The accumulated sum, init to 0
        double average;       // average in double
        final int LOWERBOUND = 10;
        final int UPPERBOUND = 111;
        //forLoop(LOWERBOUND, UPPERBOUND);
        //sumOfTheSquares(LOWERBOUND, UPPERBOUND);
        sumOfTheOddsAndEvenNumbers(LOWERBOUND, UPPERBOUND);
        /*whileLoop(LOWERBOUND, UPPERBOUND);
        doWhileLoop(LOWERBOUND, UPPERBOUND);*/
    }

    private static void forLoop(int lowerBound, int upperBound) {
        int sum = 0;          // The accumulated sum, init to 0
        double average = 0;       // average in double
        int count = 0;
        for (int number = lowerBound; number <= upperBound; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += number;     // same as "sum = sum + number
            ++count;
        }
        average = sum / count;
        // Print sum and average
        System.out.println("In the Simple For the count is: "+count);
        System.out.println("In the Simple For the Sum is: "+sum);
        System.out.println("In the Simple For the Average is: "+average);
    }

    private static void sumOfTheSquares(int lowerBound, int upperBound) {
        int sum = 0;          // The accumulated sum, init to 0
        double average = 0;       // average in double
        int count = 0;
        for (int number = lowerBound; number <= upperBound; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            sum += (number * number);     // same as "sum = sum + number
            ++count;
        }
        average = sum / count;
        // Print sum and average
        System.out.println("In the sumOfTheSquares the count is: "+count);
        System.out.println("In the sumOfTheSquares the Sum is: "+sum);
        System.out.println("In the sumOfTheSquares the Average is: "+average);
    }

    private static void sumOfTheOddsAndEvenNumbers(int lowerBound, int upperBound) {
        int sumOdd  = 0;   // Accumulating sum of odd numbers
        int sumEven = 0;   // Accumulating sum of even numbers
        int absDiff;       // Absolute difference between the two sums
        for (int number = lowerBound; number <= upperBound; ++number) {
            // The loop index variable number = 1, 2, 3, ..., 99, 100
            if(number % 2 == 0){
                sumEven += number;
            }else{
                sumOdd += number;
            }
        }
        absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : Math.abs(sumOdd - sumEven);
        // Print sum and average
        System.out.println("In the sum the odd numbers is: "+sumOdd);
        System.out.println("In the sum the even numbers is: "+sumEven);
        System.out.println("The Absolute difference is: "+absDiff);
    }


    private static void whileLoop(int lowerBound, int upperBound){
        int sum = 0;          // The accumulated sum, init to 0
        double average = 0;       // average in double
        int number = lowerBound;        // declare and init loop index variable
        while (number <= upperBound) {  // test
            sum += number;
            ++number;                    // update
        }
        average = sum / number;
        // Print sum and average
        System.out.println("In the while the number is: "+number);
        System.out.println("In the while the Sum is: "+sum);
        System.out.println("In the while the Average is: "+average);
    }

    private static void doWhileLoop(int lowerBound, int upperBound){
        int sum = 0;          // The accumulated sum, init to 0
        double average = 0;       // average in double
        int number = lowerBound;        // declare and init loop index variable
        do {
            sum += number;
            ++number;                     // update
        } while (number <= upperBound);
        average = sum / number;
        // Print sum and average
        System.out.println("In the Do while the number is: "+number);
        System.out.println("In the Do while the Sum is: "+sum);
        System.out.println("In the Do while the Average is: "+average);
    }
}
