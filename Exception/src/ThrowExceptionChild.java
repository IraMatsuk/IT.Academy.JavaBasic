public class ThrowExceptionChild extends ThrowException{
	
	@Override
	public void generateException(String input) {
		if(input.equals("catch")) {
			throw new IllegalArgumentException();
		} 
		return;
	}
}
