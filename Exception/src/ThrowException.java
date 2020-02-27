
public class ThrowException {

	public static void main(String[] args) {
		
		try {
			new ThrowException().generateException("throw");
			System.out.println("case1: didn't catch exception");
		} catch (IllegalArgumentException e) {
			System.out.println("case1: caught exception");
		}	
		
		try {
			new ThrowException().generateException("catch");
			System.out.println("case2: didn't catch exception");
		} catch (IllegalArgumentException e) {
			System.out.println("case2: caught exception");
		}
		
		try {
			new ThrowExceptionChild().generateException("catch");
			System.out.println("case3: didn't catch exception");
		} catch (IllegalArgumentException e) {
			System.out.println("case3: caught exception");
		}
	}
	
	public void generateException(String input) {
		if(input.equals("throw")) {
			throw new IllegalArgumentException();
		} 
		return;
	}
}
