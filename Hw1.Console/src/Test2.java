
public class Test2 {
	public static void main (String[] args) {
		int x = 5 + 2 / 8;
		System.out.println(x); // 5
		x = (5 + 2) / 8;
		System.out.println(x); // 0
		//x = (5 + 2++) / 8; // mistake of compilation (we can't work with constants for increment and decrement)
		//x = (5 + 2++) / --8; // mistake of compilation (we can't work with constants for increment and decrement)
		//x = (5 * 2 >> 2++) / --8 // mistake of compilation (we can't work with constants for increment and decrement)
		//x = (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8; // mistake of compilation (we can't work with constants for increment and decrement)
		//x = (5 + 7 > 20 ? 68 => 68 : 22 * 2 >> 2++) / --8 ; // mistake of compilation (we can't work with constants for increment and decrement)
		boolean a = 6 - 2 > 3 && 12 * 12 <= 119; // false 
		// 4 > 3 (true) && 144 <= 119 (false) ==> false
		System.out.println(a);
		
		if (true && false) { //false
			System.out.println("True"); 
		}
		else {
			System.out.println("False");
		}
	}
}