import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String inStr = in.next();
        int inStrLen = inStr.length();
        String reverSe = "";
        for (int charIdx = inStrLen - 1; charIdx >= 0; --charIdx) {
            // charIdx = inStrLen-1, inStrLen-2, ... ,0
            reverSe += inStr.charAt(charIdx);
        }

        System.out.print("The reverse of the String \""+inStr+"\" is \""+reverSe+"\".");
    }
}
