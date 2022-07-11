package auto.typecar;

import auto.Car;
import auto.typecar.carsobj.detail.Transmission;
import auto.typecar.carsobj.detail.Wheel;

public abstract class Cabriolet extends Car {


    public Cabriolet(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, Wheel[] wheelset) {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheelset);
    }
}
