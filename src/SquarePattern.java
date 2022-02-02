import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter the size: ");
        size = in.nextInt();
        generateFor(size);
        System.out.println();
        generateWhile(size);
    }
    private static void generateFor(int size){
        for (int row = 1; row <= size; row++) {  // row = 1, 2, 3, ..., size
            // Inner loop to print each of the columns of a particular row
            for (int col = 1; col <= size; col++) {  // col = 1, 2, 3, ..., size
                System.out.print("# ");   // Use print() without newline inside the inner loop
            }
            // Print a newline after printing all the columns
            System.out.println();
        }
    }

    private static void generateWhile(int size){
        int row2 = 1;
        do{
            int col2 = 1;
            while(col2 <= size){
                System.out.print("# ");
                col2++;
            }
            System.out.println();
            row2++;
        }while(row2 <= size);
    }
}
