
public class Test1 {
	public static void main (String[] args) {
		int a = 42; //00101010
		int b = 15; //00001111
	
		System.out.println(a & b); //10 or 00001010 in binary system
		System.out.println(a | b); // 47 or 00101111 in binary system
		System.out.println(a ^ b); //37 or 00100101 in binary system
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(~a)); //11111111111111111111111111010101
		System.out.println(Integer.toBinaryString(~b)); //11111111111111111111111111110000
		System.out.println(~a); //-43 or 11111111111111111111111111010101
		System.out.println(~b); //-16 or 11111111111111111111111111110000
		System.out.println(a << b); //1376256 or 101010000000000000000
		System.out.println(a >> b); //0
		System.out.println(a >>> b); //0
		
		a = -42; //11111111111111111111111111010110
		b = -15; //11111111111111111111111111110001
	
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(a & b); //-48 or 11111111111111111111111111010000
		System.out.println(Integer.toBinaryString(a & b));
		System.out.println(a | b); //-9 or 11111111111111111111111111110111
		System.out.println(Integer.toBinaryString(a | b));
		System.out.println(a ^ b); //39 or 00100111
		System.out.println(Integer.toBinaryString(~a)); 
		System.out.println(Integer.toBinaryString(~b));
		System.out.println(~a); //41 or 00101001
		System.out.println(~b); //14 or 00001110
		System.out.println(a << b); //-5505024 or 11111111101011000000000000000000
		System.out.println(Integer.toBinaryString(a<<b));
		System.out.println(a >> b); //-1 or 11111111111111111111111111111111
		System.out.println(Integer.toBinaryString(a>>b));
		System.out.println(a >>> b); //32767 or 111111111111111
		System.out.println(Integer.toBinaryString(a>>>b));
	}
}
