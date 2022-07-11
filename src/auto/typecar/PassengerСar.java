package auto.typecar;

import auto.Car;
import auto.StartCarException;
import auto.typecar.carsobj.detail.*;

public abstract class PassengerСar extends Car {

    private boolean isCruiseControlOn;

    public PassengerСar(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, Wheel[] wheels, GasTank gasTank, Engine engine, Electric electric, Headlight headLight) throws StartCarException {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheels, gasTank, engine, electric, headLight);
    }


    public void changeCruiseControl() {
        this.isCruiseControlOn = !this.isCruiseControlOn;
    }

    public boolean isCruiseControlOn() {
        return this.isCruiseControlOn;
    }
}
