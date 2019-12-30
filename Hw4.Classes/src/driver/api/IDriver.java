package driver.api;

import carFactory.cars.api.ACar;
import carFactory.parts.key.api.AKey;

public interface IDriver {	
	boolean open(ACar car);
	boolean start(ACar car);
	boolean drive(ACar car);
	int takePassangers(int numberOfPassengers);
	void giveKey(AKey key);
	boolean pickUpKey(AKey key);
}
