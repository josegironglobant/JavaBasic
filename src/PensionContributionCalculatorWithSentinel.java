import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {

    public static void main(String[] args){
        final int SALARY_CEILING = 6000;
        final int SENTINEL = -1;    // Terminating value for input
        int salary, age;     // to be input
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the monthly salary (or -1 to end) : $");
        salary = in.nextInt();

        while (salary != SENTINEL) {
            System.out.print("Enter the age:");
            age = in.nextInt();
            if(salary <= SALARY_CEILING){
                calculatePensionContributionCalculator(age, salary);
            }else{
                calculatePensionContributionCalculator(age, 6000);
            }
            System.out.println();
            System.out.print("Enter the monthly salary (or -1 to end) : $");
            salary = in.nextInt();

        }
        System.out.println("bye!");
    }

    private static void calculatePensionContributionCalculator(int age, int contributableSalary){
        double employeeContribution = 0.00, employerContribution= 0.00, totalContribution = 0.00;
        final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
        final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
        final double EMPLOYEE_RATE_55_TO_60 = 0.13;
        final double EMPLOYER_RATE_55_TO_60 = 0.13;
        final double EMPLOYEE_RATE_60_TO_65 = 0.075;
        final double EMPLOYER_RATE_60_TO_65 = 0.09;
        final double EMPLOYEE_RATE_65_ABOVE = 0.05;
        final double EMPLOYER_RATE_65_ABOVE = 0.075;

        if(age <= 55){
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
            employerContribution = contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
        }else if(age > 55 && age <= 60){
            employeeContribution = contributableSalary * EMPLOYEE_RATE_55_TO_60;
            employerContribution = contributableSalary * EMPLOYER_RATE_55_TO_60;
        }else if(age > 60 && age <= 65){
            employeeContribution = contributableSalary * EMPLOYEE_RATE_60_TO_65;
            employerContribution = contributableSalary * EMPLOYER_RATE_60_TO_65;
        }else if(age > 65){
            employeeContribution = contributableSalary * EMPLOYEE_RATE_65_ABOVE;
            employerContribution = contributableSalary * EMPLOYER_RATE_65_ABOVE;
        }

        totalContribution = employeeContribution + employerContribution;
        System.out.printf("The employee's contribution is: $%.2f%n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f%n", employerContribution);
        System.out.printf("The total contribution is: $%.2f%n", totalContribution);
    }
}
