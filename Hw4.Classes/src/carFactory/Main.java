package carFactory;

import carFactory.cars.Mercedes;
import carFactory.parts.engine.MercedesEngine;
import carFactory.parts.engine.NoNameEngine;
import carFactory.parts.key.MercedesKey;
import carFactory.parts.lock.MercedesLock;
import carFactory.parts.wheel.MercedesWheel;
import driver.CarDriver;

public class Main {

	public static void main(String[] args) {
        Mercedes mercedesGl666 = new Mercedes("GL666", new MercedesEngine(), new MercedesWheel(), new MercedesLock(), new MercedesKey());
        //Mercedes mercedesGl777 = new Mercedes("GL777", new NoNameEngine());
        
        CarDriver serega = new CarDriver();
        serega.giveKey(mercedesGl666.getKey());
	}

}
