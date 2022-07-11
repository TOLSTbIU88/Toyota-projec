package auto.typecar.carsobj;

import auto.StartCarException;
import auto.typecar.CargoVan;
import auto.typecar.carsobj.detail.*;

public class Hiance extends CargoVan {


    public Hiance(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo,
                  Wheel[] wheels, GasTank gasTank, Engine engine, Electric electric, Headlight headLight)
            throws StartCarException {
        super(carPrice, carSpeed, carColor, transmission, isGo, wheels, gasTank, engine, electric, headLight);
    }

    @Override
    public void startMoving() {
        System.out.println("машина поехала");

    }

    @Override
    public void stoptMoving() {
        System.out.println("машина остановилась");

    }

    public void spareWheel() {
        System.out.println("использовать запасное колесо");

    }

}
