public class Main {

	public static void main(String[] args) {
		Registration registrator = new Registration();
		String name1 = "g3726866@gmail.com";
		String password1 = "qw!Htet";
		String name2 = "g5129554@gmail.com";
		String password2 = "wrt?oPyq";
			
		try {
			User user1 = registrator.registrateUser(name1, password1);			
			User user2 = registrator.registrateUser(name2, password2);
		} catch(Exception e) {
			System.out.println(e);
		}	
		
		Chat chat = new Chat();
		//Message message = new Message();
	}
}


