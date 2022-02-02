import java.util.Scanner;

public class TimeTable {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int size = 0;
        System.out.print("Enter the size: ");
        size = in.nextInt();
        System.out.printf("  * |");
        String separator = " -----";
        for (int row = 1; row <= size; row++) {
            separator += "----";
            System.out.printf("%4d",row);
        }
        System.out.println();
        System.out.print(separator);
        for (int row = 1; row <= size; row++) {
            System.out.println();
            System.out.printf("%3d |", row);
            for (int col = 1; col <= size; col++) {
                int res = col * row;
                System.out.printf("%4d",res);
            }
        }

    }
}
