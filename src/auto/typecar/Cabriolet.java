package auto.typecar;

import auto.Car;
import auto.typecar.carsobj.detail.Transmission;

public abstract class Cabriolet extends Car {


    public Cabriolet(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo) {
        super(carPrice, carSpeed, carColor, transmission, isGo);
    }
}
