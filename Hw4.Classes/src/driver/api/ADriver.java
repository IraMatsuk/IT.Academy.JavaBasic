package driver.api;

import java.util.ArrayList;
import carFactory.cars.api.ACar;
import carFactory.parts.key.api.AKey;

public abstract class ADriver implements IDriver {
	private int experience = 0;
	private String driveLicense; //TODO change string to enum
	private ArrayList<AKey> keys;
	
	public ADriver() {
		this.keys = new ArrayList<AKey>();
	}
		
	@Override
	public boolean open(ACar car) {
		return false;
	}
	
	@Override
	public boolean start(ACar car) {
		return false;
	}
	
	@Override
	public boolean drive(ACar car) {
		return false;
	}
	
	@Override
	public int takePassangers(int numberOfPassengers) {
		return 0;
	}
	
	@Override
	public void giveKey(AKey key) {
		keys.add(key);
	}
	
	@Override
	public boolean pickUpKey(AKey key) {
		return keys.remove(key);
	}
}
