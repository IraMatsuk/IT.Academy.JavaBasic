import java.util.HashMap;
import java.util.Map;

public class Registration {
	private Map<String, String> registratedUsers = new HashMap<>();
	private long lastId = 1;
	
	public User registrateUser(String name, String password) {		
		if(registratedUsers.containsKey(name)) {
			throw new IllegalArgumentException("User with the same name already exists!");
		} 
		
		Validation validator = new Validation();
		User user;
		if(validator.validate(name, password) == true) {
			user = new User(lastId, name, password);
			lastId++;
		} else {
			throw new IllegalArgumentException(validator.getLastError());
		}
		return user;
	}
}
