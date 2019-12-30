package carFactory.parts.wheel.api;

public abstract class AWheel implements IWheel{
	private int radius;
	private String season; //TODO change string to enum
	private String name;
	
	public String getSeason() {
		return this.season;
	}
	
	@Override
	public int getRadius() {
		return this.radius;
	}
	
	@Override
	public String getName() {
		return this.name;
	}
}
