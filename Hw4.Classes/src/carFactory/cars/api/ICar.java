package carFactory.cars.api;

import carFactory.parts.key.api.AKey;

public interface ICar {
    String getModel();
    String getBrand();

    void drive();
    boolean open(AKey key);
    void close();
    void start();
    void stop();
    void fuel();
    void changeWheel();
    void driverSeat();
    void passengerSeat();
}
