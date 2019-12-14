
public class MultiplicationOfNumerals {
	public static void main (String[] args) {
		if (args.length > 0) {
			System.out.println(multipleNumerals(args[0]));	
		}
	}
	
	public static int multipleNumerals (String number) {
		int result = 1;
		String[] numerals = number.split("");
		for (int i = 0; i < numerals.length; i++) {
			System.out.println(result + "*" + numerals[i]);
			result *= Integer.parseInt(numerals[i]);
			System.out.println(result);		
		}
		return result;
	}

}
