package auto.typecar;

import auto.Car;
import auto.StartCarException;
import auto.typecar.carsobj.detail.*;

public abstract class CargoVan extends Car {

    private int loadCapacity;


    public CargoVan(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo,
                    Wheel[] wheels, GasTank gasTank, Engine engine, Electric electric, Headlight headLight,int loadCapacity)  {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheels, gasTank, engine, electric, headLight);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }
}

