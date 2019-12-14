
public class MultiplicationOfNumbers {
	public static void main (String[] args) {
		if (args.length > 0) {
			long fact = 1;
			try {
				int number = Integer.parseInt(args[0]);
				for (int i = 1; i <= number; i++) {
					fact *= i;					
				}
			} catch (NumberFormatException e) {
				System.out.println("Invalid data");
				System.exit(1);
			}
			System.out.println(fact);
		}
	}
}
