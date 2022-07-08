package auto.typecar;

import auto.Car;
import auto.typecar.carsobj.detail.Transmission;
import auto.typecar.carsobj.detail.WeelCar;

public abstract class PassengerСar extends Car {

    private boolean cruise;

    public PassengerСar(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, WeelCar[] wheelset, boolean cruise) {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheelset);
        this.cruise = cruise;
    }

    public PassengerСar(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo) {
        super(carPrice, carSpeed, carColor, transmission, isGo);
    }

    public void cruiseOn() {
        System.out.println("Круиз работает");
        cruise = true;
    }
    public void cruiseOff() {
        System.out.println("Круиз выключен");
        cruise = false;
    }
}
