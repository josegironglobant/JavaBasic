public class CozaLozaWoza {
    public static void main(String[] args){
        final int LOWERBOUND = 1, UPPERBOUND = 110;
        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            boolean printNumber = true;
            if(number % 3 == 0){
                System.out.print("Coza");
                printNumber = false;
            }
            if(number % 5 == 0){
                System.out.print("Loza");
                printNumber = false;
            }
            if(number % 7 == 0){
                System.out.print("Woza");
                printNumber = false;
            }

            if(printNumber){
                System.out.print(number);
            }

            if(number % 11 == 0){
                System.out.println();
            }else{
                System.out.print(" ");
            }
        }
    }
}
