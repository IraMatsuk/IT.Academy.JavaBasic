import java.util.Objects;
import java.util.Scanner;
	
public class Test4 {

	public static void main (String[ ] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите имя пользователя:");
		String name = scan.nextLine();
		
		String[] userNames = {"Вася", "Анастасия"};
		if (Objects.equals(userNames[0], name)) {
			System.out.println("Привет!");
			System.out.println("Я тебя так долго ждал");
		}
		if (Objects.equals(userNames[1], name))  {
			System.out.println("Я тебя так долго ждал");
		}
		if (!Objects.equals(userNames[0], name) && (!Objects.equals(userNames[1], name))) {
			System.out.println("Добрый день, а вы кто?");	
		}
	}
}
