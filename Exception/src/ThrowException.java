
public class ThrowException {

	public static void main(String[] args) {
		try {
			ThrowException.generateException("throw");
			System.out.println("case1: didn't catch exception");
		} catch (IllegalArgumentException e) {
			System.out.println("case1: caught exception");
		}	
		
		try {
			ThrowException.generateException("catch");
			System.out.println("case2: didn't catch exception");
		} catch (IllegalArgumentException e) {
			System.out.println("case2: caught exception");
		}
	}
	
	static void generateException(String input) {
		if(input.equals("throw")) {
			throw new IllegalArgumentException();
		} 
		return;
	}
}
