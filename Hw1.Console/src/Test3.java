import java.util.Objects;
import java.util.Scanner;
//import java.util.Objects;

public class Test3 {
	public static void main (String[ ] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите имя пользователя:");
		String name = scan.nextLine();
		
		String[] userNames = {"Вася", "Анастасия"};
		if (Objects.equals(userNames[0], name)) {
			System.out.println("Привет!");
			System.out.println("Я тебя так долго ждал");
		} else if (Objects.equals(userNames[1], name))  {
			System.out.println("Я тебя так долго ждал");
		} else {
			System.out.println("Добрый день, а вы кто?");
		}
	}
}	
