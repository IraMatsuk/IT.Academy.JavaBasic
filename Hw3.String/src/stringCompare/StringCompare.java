package stringCompare;
import java.util.Scanner;

public class StringCompare {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter: Mom washed the frame");
		String phrase = scan.nextLine().intern();
		String str = "Mom washed the frame";
		
		System.out.println(str == phrase);
		System.out.println(str == "Mom" + " washed the " + "frame");
		
		scan.close();
	}
}
