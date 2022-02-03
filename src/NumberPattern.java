import java.util.Scanner;

public class NumberPattern {
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

        createPatterA(size);
        System.out.println();
        createPatterB(size);
        System.out.println();
        createPatterC(size);
        System.out.println();
        createPatterD(size);
    }

    public static void  createPatterA(int size){
        for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
                if (row >= col) {
                    System.out.printf("%2d", col);
                } else {
                    System.out.print("  ");  // Need to print the "leading" blanks
                }
            }
            System.out.println();
        }
    }

    public static void  createPatterB(int size){
        for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
                if (row <= col) {
                    System.out.printf("%2d", col);
                } else {
                    System.out.print("  ");  // Need to print the "leading" blanks
                }
            }
            System.out.println();
        }
    }

    public static void  createPatterC(int size){
        for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
                if (row + col >= size + 1) {
                    System.out.printf("%2d", col);
                } else {
                    System.out.print("  ");  // Need to print the "leading" blanks
                }
            }
            System.out.println();
        }
    }

    public static void  createPatterD(int size){
        for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
                if ( row + col <= size + 1) {
                    System.out.printf("%2d", col);
                } else {
                    System.out.print("  ");  // Need to print the "leading" blanks
                }
            }
            System.out.println();
        }
    }
}
