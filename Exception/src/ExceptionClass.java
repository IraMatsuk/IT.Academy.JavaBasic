
public class ExceptionClass {

	public static void main(String[] args) {
		new ExceptionClass().someMethod();

	}
	void someMethod() {
		try {
			System.out.println("try");
			Object o = null;
			//o.hashCode();
			//throw new Exception();
		} catch(NullPointerException e) {
			System.out.println("catch");
			//e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
	}
}
