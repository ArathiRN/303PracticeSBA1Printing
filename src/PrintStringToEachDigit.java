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

/*
    public static void main(String[] args) {

         //String s = "597";
         String s = "";
         s = inputStringToPrintDigits(s);
         printDigitsWithString(s);
         printDigitsWithCharacter(s);

    }

    //Method using String Class
   public static void printDigitsWithString(String s){
        System.out.println("Using String class:");
        for(int i=0; i<s.length(); i++){
            System.out.println("Print : Number " + (i+1) + " is " + s.charAt(i));
        }
    }
    //Method using character Class
    public static void printDigitsWithCharacter(String s){
        int length = s.length();
        System.out.println("Using Character class:");
        for(int i=0; i<length; i++){
            char digit = s.charAt(i);
            System.out.println("Print : Number " + (i+1) + " is " + Character.getNumericValue(digit));
        }
    }
   public static String inputStringToPrintDigits(String s){
       System.out.println("Enter the string to print each digit");
       Scanner sc = new Scanner(System.in);
       s = sc.nextLine();
       if( s.length()<2 && s.length()>100);
           System.out.println("Enter the string to Print its digit," +
                   " it's length should be between 2 to 100");
        return s;
    }
 */
