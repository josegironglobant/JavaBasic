import java.util.Scanner;

public class CheckerPattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = 0;
        boolean isValid = false;
        do{
            System.out.print("Enter the size: ");
            size = in.nextInt();
            //Validate input by setting the boolean flag accordingly
            if (size >= 0) {
                isValid = true;   // exit the loop
            } else {
                System.out.println("bad number, try again.... ");  // Print error message and repeat
            }
        }while (!isValid);

        for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            if ((row % 2) == 0) {   // row 2, 4, 6, ...
                System.out.print(" ");
            }
            for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., siz
                System.out.print("# ");   // Use print() without newline inside the inner loop
            }
            // Print a newline after printing all the columns
            System.out.println();
        }
    }
}
