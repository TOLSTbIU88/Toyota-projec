package auto.typecar;

import auto.Car;
import auto.typecar.carsobj.detail.Transmission;
import auto.typecar.carsobj.detail.WeelCar;

public abstract class CargoVan extends Car {

    private int loadCapacity;

    public CargoVan(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, WeelCar[] wheelset, int loadCapacity) {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheelset);
        this.loadCapacity = loadCapacity;
    }


}

