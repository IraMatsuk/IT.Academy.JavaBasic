import java.util.Objects;
import java.util.Scanner;
//import java.util.Objects;

public class Test3 {
	public static void main (String[ ] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ��� ������������:");
		String name = scan.nextLine();
		
		String[] userNames = {"����", "���������"};
		if (Objects.equals(userNames[0], name)) {
			System.out.println("������!");
			System.out.println("� ���� ��� ����� ����");
		} else if (Objects.equals(userNames[1], name))  {
			System.out.println("� ���� ��� ����� ����");
		} else {
			System.out.println("������ ����, � �� ���?");
		}
	}
}	
