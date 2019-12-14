import java.util.Scanner;

public class Test5 {
	public static void main (String[ ] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите имя пользователя:");
		String name = scan.nextLine();
		
		String[] userNames = {"Вася", "Анастасия"};
		switch (name) {
		case "Вася":
			System.out.println("Привет!");
			System.out.println("Я тебя так долго ждал");
			break;
		case "Анастасия":
			System.out.println("Я тебя так долго ждал");
			break;	
		default:
			System.out.println("Добрый день, а вы кто?");
			break;	
		}
		scan.close();
	}
}
