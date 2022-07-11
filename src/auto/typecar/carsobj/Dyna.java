package auto.typecar.carsobj;

import auto.StartCarException;
import auto.typecar.CargoVan;
import auto.typecar.carsobj.detail.*;

public class Dyna extends CargoVan {


    public Dyna(float carPrice, int carSpeed, String carColor, Transmission transmission, boolean isGo, Wheel[] wheels, GasTank gasTank, Engine engine, Electric electric, Headlight headLight) throws StartCarException {
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


    public void powerSocket() {
        System.out.println("зарядить телефон");

    }

}
