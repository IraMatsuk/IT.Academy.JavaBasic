package sort;
import java.util.Scanner;

public class StringCompare {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите: Мама мыла раму");
		String phrase = scan.nextLine().intern();
		String str = "Мама мыла раму";
		
		System.out.println(str == phrase);
		System.out.println(str == "Мама" + " мыла " + "раму");
		
		scan.close();
	}
}
