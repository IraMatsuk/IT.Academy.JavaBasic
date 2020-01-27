public class Validation {
	private String lastError;
	private String nameRegexPattern = "[a-zA-Z0-9]+@[a-zA-Z0-9.]+";
	private String passwordRegexPattern = "((?=.*[a-z])(?=.*[A-Z])(?=.*[':/!?+%]).{7,20})";
	public boolean validate(String name, String password) {

		if (!name.matches(nameRegexPattern)) {
			lastError = "Invalid name";
			return false;
		}
		
		if (!password.matches(passwordRegexPattern)) {
			lastError = "Invalid password";
			return false;
		}
		
		return true;
	}
	
	public String getLastError() {
		return this.lastError;
	}
}
