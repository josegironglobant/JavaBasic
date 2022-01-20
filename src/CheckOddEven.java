public class CheckOddEven {
    public static  void  main(String[] args){
        int number = 0;       // Set the value of "number" here!
        number = 1;
        number = 88;
        //number = 99;
        //number = -1;
        //number = -2;

        System.out.println("The number is " + number);
        if ( number % 2 == 0) {
            System.out.println( "Even Number" );   // even number
        } else {
            System.out.println( "Odd number" );   // odd number
        }
        System.out.println( "Bye!" );
    }
}
