public class ExceptionClass {

	public static void main(String[] args) {
		ExceptionClass.methodTryCatch();
		ExceptionClass.methodTryCatchFinally();
		ExceptionClass.methodTryFinally();
	}
		
	static void methodTryCatch() {
		try {
			int divisionByZero = 3 / 0;
			System.out.println("try 1.1");
		} catch(Exception e) {
			System.out.println("catch 1.1");
		}
	}
	
	static void methodTryFinally() {
		try {
			int divisionByZero = 3 / 0;
			System.out.println("try 1.2");
		} finally {
			System.out.println("finally 1.2");
		}	
	}
	
	static void methodTryCatchFinally() {
		try {
			int divisionByZero = 3 / 0;
			System.out.println("try 1.3");
		} catch(Exception e) {
			System.out.println("catch 1.3");
		} finally {
			System.out.println("finally 1.3");
		}
	}
}
