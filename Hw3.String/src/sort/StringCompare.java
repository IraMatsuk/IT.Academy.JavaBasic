package sort;
import java.util.Scanner;

public class StringCompare {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������: ���� ���� ����");
		String phrase = scan.nextLine().intern();
		String str = "���� ���� ����";
		
		System.out.println(str == phrase);
		System.out.println(str == "����" + " ���� " + "����");
		
		scan.close();
	}
}
