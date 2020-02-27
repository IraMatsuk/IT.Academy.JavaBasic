import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ConsoleInput {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int maxNumberAttempts = 3;
		int incorrectAttempt = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < maxNumberAttempts; i++) {
			try {
				System.out.print("Input numbers: ");
				String lineNumbers[] = scan.nextLine().split(" ");
				int[] array = Arrays.stream(lineNumbers).mapToInt(Integer::parseInt).toArray();
			    for(int element:array) {
			    	list.add(element);
			    }
			    Collections.sort(list);
				break;
			} catch (Exception e) {
				incorrectAttempt++;
				System.out.printf("Invalid input data! Number of attempts: %d%n", maxNumberAttempts - incorrectAttempt);
			}
		}
		
		for(int item : list) {
			System.out.printf("%d ", item);
		}
	}	
}
