import java.util.Scanner;

public class PrintStringToEachDigit {
 /*   Using String and Character classes. Create  2 methods
 that will print each individual  digit of a string.  You will use each
 class to create one method.Strings length is between 2 - 100;
    Ex String s = 597;
    Print : Number 1 is 5
    Print : Number 2 is 9
    Print : Number 3 is 7
    */

    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string,string length should be between 2 to 100: ");
        s = sc.nextLine();
        printStringToEachDigit(s);
    }
    public static void printStringToEachDigit(String s) {
        int n = s.length();
        if( n>=2 && n<=100)
            for (int i = 0; i<= n-1; i++) {
                System.out.println("Print : Number " + (i+1) + " is " +s.charAt(i));
            }
        }
}
