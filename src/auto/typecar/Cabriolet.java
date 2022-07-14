package auto.typecar;

import auto.Car;
import auto.typecar.carsobj.detail.*;

public abstract class Cabriolet extends Car {

    private boolean isRoofUp;

    public Cabriolet(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo,
                     Wheel[] wheels, GasTank gasTank, Engine engine, Electric electric, Headlight headLight)  {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheels, gasTank, engine, electric, headLight);
    }

    public void changeRoofStatus() {
        this.isRoofUp = !this.isRoofUp;
    }

    public boolean isRoofUp() {
        return isRoofUp;
    }
}
