import java.util.Scanner;

public class AverageWithInputValidation {
    public static void main(String[] args){
        final int NUM_STUDENTS = 3;
        int numberIn;
        boolean isValid;   // boolean flag to control the input validation loop
        int sum = 0;
        double average;
        Scanner in = new Scanner(System.in);
        for (int studentNo = 1; studentNo <= NUM_STUDENTS; ++studentNo) {
            isValid = false;
            do{
                System.out.print("Enter the mark (0-100) for student "+studentNo+" :");
                numberIn = in.nextInt();
                //Validate input by setting the boolean flag accordingly
                if (numberIn >= 0 && numberIn <= 100) {
                    isValid = true;   // exit the loop
                } else {
                    System.out.println("Invalid input, try again...");  // Print error message and repeat
                }
            }while (!isValid);
            sum += numberIn;
        }
        average = sum / NUM_STUDENTS;
        System.out.printf("The average is: %.2f%n", average);
    }
}
