package auto.typecar;

import auto.Car;
import auto.typecar.carsobj.detail.Transmission;
import auto.typecar.carsobj.detail.WeelCar;

public abstract class CargoVan extends Car {


    public CargoVan(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, WeelCar[] wheelset) {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheelset);
    }
}

