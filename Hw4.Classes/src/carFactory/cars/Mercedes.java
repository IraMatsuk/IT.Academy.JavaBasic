package carFactory.cars;

import carFactory.cars.api.ACar;
import carFactory.parts.engine.api.AEngine;
import carFactory.parts.key.MercedesKey;
import carFactory.parts.key.api.AKey;
import carFactory.parts.lock.api.ALock;
import carFactory.parts.wheel.api.AWheel;

public class Mercedes extends ACar{
    public Mercedes(String model, AEngine engine, AWheel wheel, ALock lock, AKey key){
    	int defaultNumberOfSeats = 4;
        this.setModel(model);
        this.setEngine(engine);
        this.setWheel(wheel);
        this.setLock(lock);
        this.setKey(key);
        this.setNumberOfSeats(defaultNumberOfSeats);
    }

	@Override
	public String getModel() {
		return this.getModel();
	}

	@Override
	public String getBrand() {
		return this.getBrand();
	}
}
