import java.util.Objects;
import java.util.Scanner;
	
public class Test4 {

	public static void main (String[ ] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ��� ������������:");
		String name = scan.nextLine();
		
		String[] userNames = {"����", "���������"};
		if (Objects.equals(userNames[0], name)) {
			System.out.println("������!");
			System.out.println("� ���� ��� ����� ����");
		}
		if (Objects.equals(userNames[1], name))  {
			System.out.println("� ���� ��� ����� ����");
		}
		if (!Objects.equals(userNames[0], name) && (!Objects.equals(userNames[1], name))) {
			System.out.println("������ ����, � �� ���?");	
		}
	}
}
