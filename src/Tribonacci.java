public class Tribonacci {
    public static void main(String[] args) {
        int n = 4;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
        int fn;             // F(n) to be computed
        int fnMinus1 = 0;   // F(n-1), init to F(2)
        int fnMinus2 = 0;   // F(n-2), init to F(1)
        int fnMinus3 = 1;   // F(n-3), init to F(0)
        int nMax = 20;      // maximum n, inclusive
        System.out.println("The first " + nMax + " Fibonacci numbers are:");
        System.out.print(fnMinus1);
        System.out.print(" ");
        System.out.print(fnMinus2);
        System.out.print(" ");
        System.out.print(fnMinus3);
        while (n <= nMax) {
            System.out.print(" ");
            fn = fnMinus1 + fnMinus2+fnMinus3;
            System.out.print(fn);
            fnMinus1 = fnMinus2;
            fnMinus2 = fnMinus3;
            fnMinus3 = fn;
            ++n;
        }
    }
}
