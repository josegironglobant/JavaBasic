import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args){
        // Declare variables
        int numberIn;      // to be input
        boolean isValid;   // boolean flag to control the loop
        // Use a do-while loop controlled by a boolean flag
        // to repeatably read the input until a valid input is entered
        isValid = false;   // default assuming input is not valid
        Scanner in = new Scanner(System.in);
        do {
            // Prompt and read input
            System.out.print("Enter a number between 0-10 or 90-100:");
            numberIn = in.nextInt();
            // Validate input by setting the boolean flag accordingly
            if (numberIn >= 0 && numberIn <= 10 || numberIn >= 90 && numberIn <= 100) {
                isValid = true;   // exit the loop
                System.out.println("You have entered: "+numberIn);
            } else {
                System.out.println("Invalid input, try again...");  // Print error message and repeat
            }
        } while (!isValid);
    }
}
