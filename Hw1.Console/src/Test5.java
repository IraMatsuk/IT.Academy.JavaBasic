import java.util.Scanner;

public class Test5 {
	public static void main (String[ ] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ��� ������������:");
		String name = scan.nextLine();
		
		String[] userNames = {"����", "���������"};
		switch (name) {
		case "����":
			System.out.println("������!");
			System.out.println("� ���� ��� ����� ����");
			break;
		case "���������":
			System.out.println("� ���� ��� ����� ����");
			break;	
		default:
			System.out.println("������ ����, � �� ���?");
			break;	
		}
		scan.close();
	}
}
