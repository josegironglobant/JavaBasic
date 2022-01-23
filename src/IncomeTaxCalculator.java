import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args){
        int taxableIncome;
        final double TAX_RATE_ABOVE_20K = 0.1;
        final double TAX_RATE_ABOVE_40K = 0.2;
        final double TAX_RATE_ABOVE_60K = 0.3;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the taxable income:");
        taxableIncome = in.nextInt();  // read input
        /*in.close();*/
        double taxPayable = 0.00;
        /*my solution at the problem*/
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

        // Print results rounded to 2 decimal places
        System.out.printf("The income tax payable is: $%.2f%n", taxPayable);
        System.out.println();
        //returnTaxPayable();
    }

    private static void returnTaxPayable(){
        int taxableIncome;
        final double TAX_RATE = 0.1;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the taxable income: ");

        taxableIncome = in.nextInt();  // read input
        double rebate = taxableIncome * TAX_RATE;
        if(rebate > 1000){
            rebate = 1000;
        }
        System.out.printf("The tax rebate is: $%.2f%n", rebate);
    }

}
