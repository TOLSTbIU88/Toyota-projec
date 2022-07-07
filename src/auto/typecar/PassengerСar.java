package auto.typecar;

import auto.Car;
import auto.typecar.carsobj.detail.Transmission;

public abstract class PassengerСar extends Car {


    public PassengerСar(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo) {
        super(carPrice, carSpeed, carColor, transmission, isGo);
    }
}
