package carFactory.cars.api;

import carFactory.parts.engine.api.AEngine;
import carFactory.parts.key.api.AKey;
import carFactory.parts.lock.api.ALock;
import carFactory.parts.wheel.api.AWheel;

public abstract class ACar implements ICar {
    private String model;
    private AEngine engine;
	private int numberOfSeats;
	private String driveLicense; //TODO change string to enum
	private AWheel wheel;
	private ALock lock;
	private AKey key;
	
	public AWheel getWheel() {
		return this.wheel;
	}
	
	public void setWheel(AWheel wheel) {
		this.wheel = wheel;
	}
	
	public ALock getLock() {
		return this.lock;
	}
	
	public void setLock(ALock lock) {
		this.lock = lock;
	}
	
	public AKey getKey() {
		return this.key;
	}
	
	public void setKey(AKey key) {
		this.key = key;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public AEngine getEngine() {
		return this.engine;
	}
	
	public void setEngine(AEngine engine) {
		this.engine = engine;
	}
	
	public int getNumberOfSeats() {
		return this.numberOfSeats;
	}
	
	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}
	
	public String getDriveLicense() {
		return this.driveLicense;
	}
	
    @Override
    public void drive() {
        System.out.println("Поехал");
    }

    @Override
    public boolean open(AKey key) {
        System.out.println("Открыто");
        return true;
    }

    @Override
    public void close() {
        System.out.println("Закрыто");
    }

    @Override
    public void start() {
        System.out.println("Запустили");
    }

    @Override
    public void stop() {
        System.out.println("Остановлено");
    }

    @Override
    public void fuel() {
        System.out.println("Заправляем");
    }

    @Override
    public void changeWheel() {
        System.out.println("Меняем шины");

    }

    @Override
    public void driverSeat() {
        System.out.println("Садим водителя");
    }

    @Override
    public void passengerSeat() {
        System.out.println("Садим пассажира");

    }
}
