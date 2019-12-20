import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        if (!scan.hasNextInt()) {
          System.out.println("not a number!");
        }

        int number = scan.nextInt();
        System.out.println(isPalidrom(number));       
      }

      private static String isPalidrom(int number) {
        String stringOfNumbers = Integer.toString(number);
        String reverseStr = new StringBuilder(stringOfNumbers).reverse().toString();
        if (reverseStr.equals(stringOfNumbers)) {
          return "The number is a palindrome";
        } else {
          return "The number is not a palindrome";
        }       
      } 
}