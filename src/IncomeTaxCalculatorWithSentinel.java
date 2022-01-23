import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel {
    public static void main(String[] args){
        final int SENTINEL = -1;    // Terminating value for input
        int taxableIncome;
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        double taxPayable;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the taxable income (or -1 to end): $");
        taxableIncome = in.nextInt();
        while (taxableIncome != SENTINEL) {
            taxPayable = 0.00;//Clear the variable
            if(taxableIncome > 40000){
                taxPayable += 20000 * TAX_RATE_ABOVE_20K;
                if(taxableIncome > 60000){
                    taxPayable += 20000 * TAX_RATE_ABOVE_40K;
                    int rest = taxableIncome - 60000;
                    taxPayable += rest * TAX_RATE_ABOVE_60K;
                }else {
                    int rest = taxableIncome - 40000;
                    taxPayable += rest * TAX_RATE_ABOVE_40K;
                }
            }else{
                if(taxableIncome > 20000){
                    int rest = taxableIncome - 20000;
                    taxPayable += rest * TAX_RATE_ABOVE_20K;
                }
            }
            System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
            System.out.println();
            System.out.print("Enter the taxable income (or -1 to end): $");
            taxableIncome = in.nextInt();
        }
        System.out.println("bye!");
    }
}
